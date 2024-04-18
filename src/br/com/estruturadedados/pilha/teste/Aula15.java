package br.com.estruturadedados.pilha.teste;

import br.com.estruturadedados.pilha.Pilha;

public class Aula15 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha.estaVazio());

        pilha.Empilha(1);

        System.out.println(pilha.estaVazio());
    }
}
