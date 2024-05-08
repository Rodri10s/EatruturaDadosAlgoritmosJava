package br.com.estruturadedados.pilha.desafios.exercicio4;

import java.util.Stack;

public class Exercicio7 {
    public static void main(String[] args) {
        binario(2024);

        decimalQualquerBase(100, 4);

        decimalQualquerBase(50, 8);

        decimalQualquerBase(10035, 16);
    }

    public static void binario(int numero){
        Stack<Integer> pilha = new Stack<>();
        String numeroBinario = "";
        int resto;

        while (numero!=0) {
            resto = numero%2;
            pilha.push(resto);

            numero = numero/2;
        }

        while (!pilha.isEmpty()) {
            numeroBinario += pilha.pop();
        }

        System.out.println(numeroBinario);
    }

    public static void decimalQualquerBase(int numero, int base){
		
		if (base > 16){
			throw new IllegalArgumentException();
		}

		Stack<Integer> pilha = new Stack<>();
		String numBase = "";
		int resto;
		String bases = "0123456789ABCDEF";

		while (numero > 0){
			resto = numero % base;
			pilha.push(resto);
			numero /= base;
		}

		while (!pilha.isEmpty()){
			numBase += bases.charAt(pilha.pop());
		}

		System.out.println(numBase);
	}
}
