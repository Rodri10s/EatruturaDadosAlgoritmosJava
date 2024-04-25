package br.com.estruturadedados.pilha.desafios;

import java.util.Stack;

public class Exercicio5 {
    public static void main(String[] args) {

        imprimirTestePolindromo("ADA");
        imprimirTestePolindromo("Ramon");
        imprimirTestePolindromo("AABBAA");

    }

    private static void imprimirTestePolindromo(String palavra) {
        System.out.println(palavra + " é  um polindromo? " + testaPalindromo(palavra));
    }

    private static boolean testaPalindromo(String palavra) {
        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }

        String palavraInversa = "";
        while (!pilha.isEmpty()) {
            palavraInversa += pilha.pop();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }
        return false;
    }
}
