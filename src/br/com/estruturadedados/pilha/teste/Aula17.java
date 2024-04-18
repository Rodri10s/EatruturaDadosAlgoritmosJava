package br.com.estruturadedados.pilha.teste;

import br.com.estruturadedados.pilha.Pilha;

public class Aula17 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        pilha.Empilha(1);
        pilha.Empilha(2);
        pilha.Empilha(3);

        System.out.println(pilha);

        System.out.println("Desempilhando "+ pilha.Desempilha());

        System.out.println(pilha);
    }
}
