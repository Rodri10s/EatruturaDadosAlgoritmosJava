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

    public T espiadinha(){

        if(this.estaVazio()){
            return null;
        }
        return this.elementos[0];
    }

    public T remove(){
        T temporario =  this.elementos[0];

        for(int i = 0; i < tamanho; i++){
            this.elementos[i] = this.elementos[i+1];
        }

        this.tamanho--;
        return temporario;
    }
}
