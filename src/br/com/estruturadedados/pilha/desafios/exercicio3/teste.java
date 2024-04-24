package br.com.estruturadedados.pilha.desafios.exercicio3;

import java.util.Scanner;

import br.com.estruturadedados.pilha.Pilha;

public class teste {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<>(20);
        Scanner input = new Scanner(System.in);

        boolean ativo = true;
        do {
            menu();
            int num = input.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Quantos Livros deseja empilhar?");
                    int quantidade = input.nextInt();
                    criarLivroDinamicamente(quantidade, pilha);
                    break;

                case 2:
                    desempilhar(pilha);
                    break;

                case 3:
                    System.out.println("O topo da pilha é:\n"+pilha.topo());
                    break;

                case 4:
                    System.out.println(pilha.toString());
                    break;

                case 0:
                    ativo = false;
                    System.out.println("Programa Finalizado");
                    break;

                default:
                    System.out.println("\nInformação inválida, tente novamente.\n");
                    break;
            }
        } while (ativo);

    }

    private static void desempilhar(Pilha<Livro> pilha) {
        System.out.println("Desempilhando:\n" + pilha.Desempilha());
    }

    private static void menu() {
        System.out.println("Escolha uma opção:");

        System.out.println("1 - Empilhar Livros dinamicamente");
        System.out.println("2 - Desempilhar");
        System.out.println("3 - Topo da Pilha");
        System.out.println("4 - Imprimir Pilha");
        System.out.println("0 - Encerrar");
    }

    private static void criarLivroDinamicamente(int quantidade, Pilha<Livro> pilha) {
        Livro livro;

        for (int i = 1; i <= quantidade; i++) {
            livro = new Livro();
            livro.setNome("Livro " + i);
            livro.setIsbn("978-65-59841-167-" + i);
            livro.setAnoLancamento(2020 + i);
            livro.setAutor("Autor " + i);

            pilha.Empilha(livro);
        }
    }
}
