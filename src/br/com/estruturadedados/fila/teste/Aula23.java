package br.com.estruturadedados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        /*A classe "Queue" não existe no Java, oq existe é a interface, aí que entra a classe LinkedList,
        que representa Lista encadeada e possui diversos métodos, incluindo os de fila,
        mas esses métodos não seguem as normas FIFO. Então quando declaramos a interface Queue(Fila)
        e instanciamos a classe LinkedList(Lista encadeada), estamos usando apenas os 
        métodos da classe que pertencem à interface*/

        fila.add(3); //adicionar
        fila.add(2);
        fila.add(1);

        System.out.println(fila);   //ToString
        System.out.println(fila.peek());    //Espiar
        System.out.println(fila.remove());  //Dequeue (desenfileira)
        System.out.println(fila);
    }
}
