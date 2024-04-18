package br.com.estruturadedados.pilha.teste;

import br.com.estruturadedados.pilha.Pilha;

public class Aula14 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 1; i <= 10; i++) {
            pilha.Empilha(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
