package br.com.estruturadedados.fila.teste;

import br.com.estruturadedados.fila.FilaComPrioridade;

public class Aula24 {
    public static void main(String[] args) {
        
        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();

        fila.enfileira(new Paciente("A", 3));
        fila.enfileira(new Paciente("B", 1));
        fila.enfileira(new Paciente("C", 2));

        System.out.println(fila);
    }
}
