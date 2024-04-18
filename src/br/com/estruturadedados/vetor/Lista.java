package br.com.estruturadedados.vetor;

import java.util.Arrays;

public class Lista <T> {
	
	private T[] elementos;
	private int tamanho;
	
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public void pesquisa(int posicao) throws Exception {
		if(!(posicao>= 0 && posicao < this.tamanho)) {
			throw new Exception ("posição insdisponível!"); 
		}
	}
	
	public void adicionar(T elemento) {
		adicionarCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[tamanho] = elemento;
			this.tamanho++;
		} 
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i=0; i<=this.tamanho-1; i++) {
			s.append(elementos[i]);
			s.append(", ");
		}
		
		s.append("]");
		
		return Arrays.toString(elementos);
	}
	
	public T busca(int posicao) throws Exception {
		this.pesquisa(posicao);
		return elementos[posicao];
	}
	
	public int busca(T elemento){
		for(int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}

	public boolean existe(T elemento){
		for(int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)){
				return true;
			}
		}
		return false;
	}
	
	
	public int lastIndex(T elemento){
		for(int i = this.tamanho-1; i>=0; i--) {
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}
	
	public void remove(T elemento) throws Exception {
		int posi = this.lastIndex(elemento);
		if(posi != -1) {
			this.apagar(posi);
		}
	}
	
	public void mover(int posicao, T informacao) throws Exception {
		if(!(posicao>= 0 && posicao < tamanho)) {
			throw new Exception ("posição insdisponível!"); 
		}
		for(int i = this.tamanho; i>posicao; i--) {
			elementos[i] = elementos[i-1];
		}
		elementos[posicao] = informacao;
		this.tamanho++;
	}
	
	public void apagar(int posicao) throws Exception {
		if(!(posicao>= 0 && posicao < tamanho)) {
			throw new Exception ("posição insdisponível!"); 
		}
		for(int i = posicao; i<tamanho; i++) {
			elementos[i] = elementos[i+1];
		}
		this.tamanho--;
	}
	
	public void adicionarCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] novosElementos = (T[]) new Object [this.elementos.length * 2];
			for(int i=0; i<this.elementos.length;i++) {
				novosElementos[i] = this.elementos[i];
			}
			this.elementos = novosElementos;
		}
	}
	
	public T obtem(int posicao) {
		return this.elementos[posicao];
	}
	
	public void limpar() {
		//this.elementos = (T[]) new Object[this.elementos.length]; 
		
		//ou
		
		for(int i = this.tamanho; i>= 0; i--) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}

	public int tamanho(){
		return tamanho;
	}
	

}
