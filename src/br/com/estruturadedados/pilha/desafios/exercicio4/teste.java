package br.com.estruturadedados.pilha.desafios.exercicio4;

import java.util.Scanner;
import java.util.Stack;

public class teste {
    public static void main(String[] args) {
        Stack<Livro> stack = new Stack<>();
        Scanner input = new Scanner(System.in);

        boolean ativo = true;
        do {
            menu();
            int num = input.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Quantos Livros deseja empilhar?");
                    int quantidade = input.nextInt();
                    criarLivroDinamicamente(quantidade, stack);
                    break;

                case 2:
                    desempilhar(stack);
                    break;

                case 3:
                    System.out.println("O topo da pilha é:\n"+stack.peek());
                    break;

                case 4:
                    System.out.println(stack.toString());
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

    private static void desempilhar(Stack<Livro> stack) {
        System.out.println("Desempilhando:\n" + stack.pop());
    }

    private static void menu() {
        System.out.println("Escolha uma opção:");

        System.out.println("1 - Empilhar Livros dinamicamente");
        System.out.println("2 - Desempilhar");
        System.out.println("3 - Topo da Pilha");
        System.out.println("4 - Imprimir Pilha");
        System.out.println("0 - Encerrar");
    }

    private static void criarLivroDinamicamente(int quantidade, Stack<Livro> stack) {
        Livro livro;

        for (int i = 1; i <= quantidade; i++) {
            livro = new Livro();
            livro.setNome("Livro " + i);
            livro.setIsbn("978-65-59841-167-" + i);
            livro.setAnoLancamento(2020 + i);
            livro.setAutor("Autor " + i);

            stack.push(livro);
        }
    }
}