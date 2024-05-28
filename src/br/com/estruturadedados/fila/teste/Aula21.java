package br.com.estruturadedados.fila.teste;

import br.com.estruturadedados.fila.Fila;

public class Aula21 {
    public static void main(String[] args) {
        
        Fila<Integer> fila = new Fila<>();

        fila.enfileira(3);
        fila.enfileira(2);
        fila.enfileira(1);

        System.out.println(fila.espiadinha());
        System.out.println(fila.toString());
    }
}
