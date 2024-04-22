package br.com.estruturadedados.pilha.desafios;

import br.com.estruturadedados.pilha.Pilha;

public class Exercicio1 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Empilhando " + i);
                pilha.Empilha(i);
            } else {
                Object desempilha = pilha.Desempilha();

                if (desempilha == null) {
                    System.out.println("A pilha já está vazia");
                } else {
                    System.out.println("Desempilhando o número " + desempilha);
                }
            }
        }

        while (!pilha.estaVazio()) {
            System.out.println("Desempilhando o número " + pilha.Desempilha());
        }

        System.out.println("Todos os elementos foram desempilhados");
    }
}
