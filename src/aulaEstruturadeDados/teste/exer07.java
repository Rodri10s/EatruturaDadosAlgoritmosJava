package aulaEstruturadeDados.teste;

import java.util.ArrayList;
import java.util.Scanner;

import aulaEstruturadeDados.Contato;

public class exer07 extends Main{
    public static void main(String[] args) throws Exception {
        // criação das variáveis
		Scanner scan = new Scanner(System.in);

		// criar vetor com 20 de capacidade
		ArrayList<Contato> lista = new ArrayList<Contato>(20);

		// criar e adicionar 30 contatos
		criarContatoDinamicamente(30, lista);

		// criar um menu para que o usuario escolha a opcao
		int opcao = 1;

		while (opcao != 0) {
			opcao = obterOpcaoMenu(scan);

			switch (opcao) {
				case 1: {
					adicionarContatoNoFinal(scan, lista);
					break;
				}
				case 2: {
					adicionarContatoPosicaoEspecifica(scan, lista);
					break;
				}
				case 3: {
					obtemContatoPosicao(scan, lista);
					break;
				}
				case 4: {
					obtemContato(scan, lista);
					break;
				}
				case 5: {
					pesquisarUltimoIndice(scan, lista);
					break;
				}
				case 6: {
					pesquisarContatoExiste(scan, lista);
					break;
				}
				case 7: {
					excluirPorPosicao(scan, lista);
					break;
				}
				case 8: {
					excluirContato(scan, lista);
					break;
				}
				case 9: {
					imprimeTamanhoVetor(lista);
					break;
				}
				case 10: {
					limparVetor(lista);
					break;
				}
				case 11: {
					imprimir(lista);
					break;
				}
			}
		}
		System.out.println("\nOperação finalizada!");

	}

	private static void adicionarContatoNoFinal(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("\nInserir as informações do usuários:");

		Contato contato = new Contato();

		System.out.println("Nome: ");
		contato.setNome(scan.nextLine());
		System.out.println("Email: ");
		contato.setEmail(scan.nextLine());
		System.out.println("Telefone: ");
		contato.setTelefone(scan.nextLine());

		lista.add(contato);

		System.out.println("\nContato adicionado com sucesso!\n");
	}

	private static void adicionarContatoPosicaoEspecifica(Scanner scan, ArrayList<Contato> lista) throws Exception {
		System.out.println("\nInserir as informações do usuários:");

		Contato contato = new Contato();

		System.out.println("Nome: ");
		contato.setNome(scan.nextLine());
		System.out.println("Email: ");
		contato.setEmail(scan.nextLine());
		System.out.println("Telefone: ");
		contato.setTelefone(scan.nextLine());

		int posicao = informacaoBaseInt("Insira a posição", scan);

		try {
			lista.add(posicao, contato);

			System.out.println("\nContato adicionado com sucesso!");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("\nPosição Inválida, contato não adicionado\n");
		}
	}

	private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista) {

		int posicao = informacaoBaseInt("Entre com a posição a ser pesquisada", scan);

		try {

			Contato contato = lista.get(posicao);

			System.out.println("\nContato existe, seguem dados");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("\nPosição Inválida!\n");
		}
	}

	private static void obtemContato(Scanner scan, ArrayList<Contato> lista) {

		int posicao = informacaoBaseInt("Entre com a posição a ser pesquisada", scan);

		try {

			Contato contato = lista.get(posicao);

			System.out.println("\nContato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo Pesquisa do contato encontrado:");
			posicao = lista.indexOf(contato);

			System.out.println("Contato encontrado na posição " + posicao + "\n");
		} catch (Exception e) {
			System.out.println("\nPosição Inválida!\n");
		}
	}

	private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista) {

		int posicao = informacaoBaseInt("Entre com a posição a ser pesquisada", scan);

		try {

			Contato contato = lista.get(posicao);

			System.out.println("\nContato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo Pesquisa do último índice do contato encontrado:");
			posicao = lista.lastIndexOf(contato);

			System.out.println("\nContato encontrado na posição" + posicao +"\n");
		} catch (Exception e) {
			System.out.println("\nPosição Inválida!\n");
		}
	}

	private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista) {

		int posicao = informacaoBaseInt("Entre com a posição a ser pesquisada", scan);

		try {

			Contato contato = lista.get(posicao);

			boolean existe = lista.contains(contato);

			if (existe) {
				System.out.println("\nContato existe, seguem dados: ");
				System.out.println(contato);
			} else {
				System.out.println("\nContato não existe!\n");
			}

		} catch (Exception e) {
			System.out.println("\nPosição Inválida!\n");
		}
	}

	private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista) {

		int posicao = informacaoBaseInt("Entre com a posição a ser removida", scan);

		try {

			lista.remove(posicao);

			System.out.println("\nContato Excluído");

		} catch (Exception e) {
			System.out.println("\nPosição Inválida!\n");
		}
	}

	private static void excluirContato(Scanner scan, ArrayList<Contato> lista) {

		int posicao = informacaoBaseInt("Entre com a posição a ser removida", scan);

		try {
			Contato contato = lista.get(posicao);
			lista.remove(contato);

			System.out.println("\nContato Excluído");

		} catch (Exception e) {
			System.out.println("\nPosição Inválida!\n");
		}
	}

	private static void imprimeTamanhoVetor(ArrayList<Contato> lista){

		System.out.println("Tamanho do vetor é de: "+ lista.size());

	}

	private static void limparVetor(ArrayList<Contato> lista){

		lista.clear();

		System.out.println("Todos os contatos do vetor  foram excluídos");

	}

	private static void imprimir(ArrayList<Contato> lista) {
		System.out.println(lista);
	}

	private static void criarContatoDinamicamente(int quantidade, ArrayList<Contato> lista) {
		Contato contato;
		for (int i = 1; i <= quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato" + i);
			contato.setEmail("contato" + i + "@gmail.com");
			contato.setTelefone("87 9645-779" + i);
			lista.add(contato);
		}
	}

	
    }
