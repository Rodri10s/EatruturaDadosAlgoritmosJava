package br.com.estruturadedados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        fila.add(3); //adicionar
        fila.add(2);
        fila.add(1);

        System.out.println(fila);   //ToString
        System.out.println(fila.peek());    //Espiar
        System.out.println(fila.remove());  //Dequeue (desenfila)
        System.out.println(fila);
    }
}
