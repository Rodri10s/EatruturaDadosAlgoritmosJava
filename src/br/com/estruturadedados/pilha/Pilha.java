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

    public T topo(){
        if(estaVazio()){
            return null;
        }

        return (T) this.elementos[tamanho-1];
    }

    public T Desempilha(){
        if(estaVazio()){
            return null;
        }

        return (T) this.elementos[--tamanho];
    }
}
