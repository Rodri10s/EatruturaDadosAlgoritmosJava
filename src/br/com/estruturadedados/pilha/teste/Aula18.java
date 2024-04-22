package br.com.estruturadedados.pilha.teste;

import java.util.Stack;

import br.com.estruturadedados.pilha.Pilha;

public class Aula18 {
    public static void main(String[] args) {
        
        Pilha<Integer> pilha = new Pilha<>();

        Stack<Integer> stack = new Stack<>(); //pilha do próprio Java

        System.out.println(stack.isEmpty()); //Verifica se está vazio

        stack.push(1); //Empilha
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty());

        System.out.println(stack.size()); //Tamanho
        System.out.println(stack);

        System.out.println(stack.peek()); //retorna a última casa da pilha
        System.out.println(stack.pop()); //remove a última casa da pilha

        System.out.println(stack);
    }
}
