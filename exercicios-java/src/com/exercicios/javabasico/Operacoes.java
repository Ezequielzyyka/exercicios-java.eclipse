package com.exercicios.javabasico;

import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int opcao = 1;

		while (opcao == 1) {
			System.out.println("\n__________OPERA��ES__________\n");
			System.out.println("Digite o n�mero de posi��es ");
			int posicoes = entrada.nextInt();

			int[] dados = new int[posicoes];

			for (int i = 0; i < dados.length; i++) {
				System.out.println("Digite um n�mero ");
				dados[i] = entrada.nextInt();
			}

			System.out.println("\nEscolha uma opera��o: ");
			System.out.println("1 - listar em ordem ");
			System.out.println("2 - listar invertido ");
			System.out.println("3 - exibir n�meros menores que 5 ");
			System.out.println("4 - exibir at� primeiro n�mero menor que 5 ");
			int operacao = entrada.nextInt();
			System.out.println();

			switch (operacao) {
			case 1:
				for (int i = 0; i < dados.length; i++) {
					System.out.println(dados[i]);
				}
				break;
			case 2:
				for (int i = dados.length - 1; i >= 0; i--) {
					System.out.println(dados[i]);
				}
				break;
			case 3:
				for (int i = 0; i < dados.length; i++) {
					if (dados[i] < 5) {
						System.out.println(dados[i]);
					}

				}
				break;
			case 4:
				for (int i = 0; i < dados.length; i++) {
					if (dados[i] < 5) {
						break;
					}
					System.out.println(dados[i]);
				}
				break;
			default:
				System.out.println("COMANDO INV�LIDO!!");

			}

			do {
				System.out.println("\nDeseja fazer outra operac�o?");
				System.out.println("Digite '1' para continuar, ou '0' para finalizar.");
				opcao = entrada.nextInt();
				if (opcao != 1 && opcao != 0) {
					System.out.println("\nOP��O INV�LIDA!");
				}
			} while (opcao != 1 && opcao != 0);
		}
	}

}