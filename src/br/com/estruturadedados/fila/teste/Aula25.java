package br.com.estruturadedados.fila.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {
    public static void main(String[] args) {
        Queue<Paciente> filaComPrioridade = new PriorityQueue<>();

        filaComPrioridade.add(new Paciente("A", 3));
        filaComPrioridade.add(new Paciente("B", 1));
        filaComPrioridade.add(new Paciente("C", 2));

        System.out.println(filaComPrioridade);
    }
}
