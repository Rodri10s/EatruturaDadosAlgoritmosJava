package br.com.estruturadedados.fila;

import br.com.estruturadedados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {
    public Fila() {
        super(); // Chama o construtor da classe mãe
    }

    public Fila(int capacidade) {
        super(capacidade); // Chama o construtor da classe mãe que recebe capacidade
    }

    public void enfileira(T elemento) {
        this.adiciona(elemento); // Utiliza do método da classe Pai
    }

    public T espiadinha() {

        if (this.estaVazio()) {
            return null;        //Verifica se a fila está vazia, se sim retorna null
        }
        return this.elementos[0];
    }

    public T remove() {
        if (this.estaVazio()) {
            return null;
        }

        T temporario = this.elementos[0];   //Põe o primeiro item da fila numa variável temporária

        for (int i = 0; i < tamanho; i++) {
            this.elementos[i] = this.elementos[i + 1]; //Anda com os itens para a esquerda
        }

        this.tamanho--;     //Subtrai o tamanho devido estar dimuindo um item da fila
        return temporario;      //Retorna o valor salvo na variável temporária
    }
}
