package aulaEstruturadeDados.teste;

import java.util.Scanner;

import aulaEstruturadeDados.Contato;
import aulaEstruturadeDados.Lista;

public class Main {
	public static void main(String[] args) throws Exception {

		// criação das variáveis
		Scanner scan = new Scanner(System.in);

		// criar vetor com 20 de capacidade
		Lista<Contato> lista = new Lista(20);

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
				case 11: {
					imprimir(lista);
					break;
				}
			}
		}
		System.out.println("\nOperação finalizada!");

	}

	private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista){

		int posicao = informacaoBaseInt("Entre com a posição a ser pesquisada", scan);

		try {
			
			Contato contato = lista.busca(posicao);

			System.out.println("Contato existe, seguem dados");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição Inválida!");
		}
	}

	private static void imprimir(Lista<Contato> lista) {
		System.out.println(lista);
	}

	private static void adicionarContatoPosicaoEspecifica(Scanner scan, Lista<Contato> lista) throws Exception {
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
			lista.mover(posicao, contato);

			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição Inválida, contato não adicionado");
		}
		

		System.out.println("\nContato adicionado com sucesso!\n");
	}

	private static void adicionarContatoNoFinal(Scanner scan, Lista<Contato> lista) {
		System.out.println("\nInserir as informações do usuários:");

		Contato contato = new Contato();

		System.out.println("Nome: ");
		contato.setNome(scan.nextLine());
		System.out.println("Email: ");
		contato.setEmail(scan.nextLine());
		System.out.println("Telefone: ");
		contato.setTelefone(scan.nextLine());

		lista.adicionar(contato);

		System.out.println("\nContato adicionado com sucesso!\n");
	}

	private static String informacaoBase(String mensagem, Scanner scan) {
		System.out.println(mensagem);
		String entrada = scan.nextLine();
		return entrada;
	}

	private static int informacaoBaseInt(String mensagem, Scanner scan) {

		boolean entradaValida = false;
		int num = 0;

		while (!entradaValida) {
			try {
				System.out.println(mensagem);
				String entrada = scan.nextLine();

				num = Integer.parseInt(entrada);

				entradaValida = true;
			} catch (Exception e) {
				System.out.println("Entrada Inválida, tente novamente");
			}
		}

		return num;
	}

	private static void criarContatoDinamicamente(int quantidade, Lista<Contato> lista) {
		Contato contato;
		for (int i = 1; i <= quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato" + i);
			contato.setEmail("contato" + i + "@gmail.com");
			contato.setTelefone("87 9645-779" + i);
			lista.adicionar(contato);
		}
	}

	private static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 0;

		while (!entradaValida) {

			System.out.println("Digite a opção desejada:");
			System.out.println("01 : Adiciona contato no final do vetor");
			System.out.println("02 : Adiciona contato em uma posição específica");
			System.out.println("03 : Obtém contato de uma posição específica");
			System.out.println("04 : Consulta contato");
			System.out.println("05 : Consulta último índice do contato");
			System.out.println("06 : Verifica se o contato existe");
			System.out.println("07 : Excluir por posição");
			System.out.println("08 : Excluir contato");
			System.out.println("09 : Verifica tamanho do vetor");
			System.out.println("10 : Excluir todos os contatos do vetor");
			System.out.println("11 : Imprimir contatos");
			System.out.println("00 : Sair");

			try {
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("\nInformação inválida, tente novamente.\n");
			}
		}
		return opcao;
	}
}
