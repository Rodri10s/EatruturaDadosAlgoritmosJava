package br.com.estruturadedados.fila;

import br.com.estruturadedados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {
    public Fila(){
        super(); //Chama o construtor da classe mãe
    }

    public Fila(int capacidade){
        super(capacidade); //Chama o construtor da classe mãe que recebe capacidade
    }

    public void enfileira(T elemento){
        this.adiciona(elemento); //Utiliza do método da classe Pai 
    }
}
