package br.com.estruturadedados.pilha;

import br.com.estruturadedados.base.EstruturaEstatica;

public class Pilha <T> extends EstruturaEstatica {
    
    public Pilha(){
        super();
    }

    public Pilha(int capacidade){
        super(capacidade);
    }

    public void Empilha(T elemento){
        super.adiciona(elemento);
    }

    public Object topo(){
        if(estaVazio()){
            return null;
        }

        return this.elementos[tamanho-1];
    }

    public Object Desempilha(){
        if(estaVazio()){
            return null;
        }

        return this.elementos[--tamanho];
    }
}
