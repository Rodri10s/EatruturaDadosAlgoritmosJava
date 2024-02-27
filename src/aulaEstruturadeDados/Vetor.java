package aulaEstruturadeDados;

import java.util.Arrays;

public class Vetor {
	
	private Object[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}
	
	public void adicionar(Object elemento) throws Exception {
		adicionarCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception ("Vetor já está cheio, impossíveil inserir mais elementos"); 	
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
	
	public Object busca(int posicao) throws Exception {
		if(!(posicao>= 0 && posicao < tamanho)) {
			throw new Exception ("posição insdisponível!"); 
		}
		return elementos[posicao];
	}
	
	public boolean busca(Object elemento){
		for(int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)){
				return true;
			}
		}
		return false;
	}
	
	public boolean lastIndex(Object elemento){
		for(int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)){
				return true;
			}
		}
		return false;
	}
	
	public void mover(int posicao, Object informacao) throws Exception {
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
			Object[] novosElementos = new Object [this.elementos.length * 2];
			for(int i=0; i<this.elementos.length;i++) {
				novosElementos[i] = this.elementos[i];
			}
			this.elementos = novosElementos;
		}
	}
	

}
