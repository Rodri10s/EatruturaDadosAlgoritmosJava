package br.com.estruturadedados.pilha.desafios;

import java.util.Scanner;

import br.com.estruturadedados.pilha.Pilha;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pilha<Integer> par = new Pilha<Integer>();
        Pilha<Integer> impar = new Pilha<Integer>();

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite o número que deseja inserir");
            int num = input.nextInt();

            if (num == 0) {
                Object desempilha = par.Desempilha();

                if (desempilha == null) {
                    System.out.println("A pilha PAR já está vazia\n");
                } else {
                    System.out.println("Desempilhando o número " + desempilha);
                }

                desempilha = impar.Desempilha();

                if (desempilha == null) {
                    System.out.println("A pilha IMPAR já está vazia\n");
                } else {
                    System.out.println("Desempilhando o número " + desempilha);
                }
            } else if (num % 2 == 0) {
                System.out.println("Empilhando " + num + " na pilha par\n");
                par.Empilha(num);
            } else {
                System.out.println("Empilhando " + num + " na pilha impar\n");
                impar.Empilha(num);

            }
        }

        while (!par.estaVazio()) {
            System.out.println("Desempilhando o número " + par.Desempilha() + " da pilha Par\n");
        }
        while (!impar.estaVazio()) {
            System.out.println("Desempilhando o número " + impar.Desempilha() + " da pilha Impar\n");
        }
        System.out.println("Todos os elementos foram desempilhados");
    }
}
