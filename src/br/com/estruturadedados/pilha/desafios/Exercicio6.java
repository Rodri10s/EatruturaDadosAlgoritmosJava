package br.com.estruturadedados.pilha.desafios;

import br.com.estruturadedados.pilha.Pilha;

public class Exercicio6 {
    public static void main(String[] args) {
        imprimeResultado("A + B");
		imprimeResultado("A + B + (C - D)");
		imprimeResultado("{[()]}[](){()}");
		imprimeResultado("{[(]}[](){()}");
		imprimeResultado("A + B + C - D)");
    }

    public static void imprimeResultado(String expressao){
		System.out.println(expressao + " está balanceado? " + 
				verificaSimbolosBalanceados(expressao));
	}
	
	final static String ABRE = "([{";
	final static String FECHA = ")]}";

	public static boolean verificaSimbolosBalanceados(String expressao){
		
		Pilha<Character> pilha = new Pilha<Character>();
		int index = 0;
		char simbolo, topo;
		
		while (index < expressao.length()){
			simbolo = expressao.charAt(index);
			
			if (ABRE.indexOf(simbolo) > -1){
				pilha.Empilha(simbolo);
				
			} else if (FECHA.indexOf(simbolo) > -1){
				
				if (pilha.estaVazio()){
					return false;
				} else {
					topo = (char) pilha.Desempilha();
					
					if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
						return false;
					}
				}
			}
			
			index++;
		}
		
		return pilha.estaVazio();
	}
}
