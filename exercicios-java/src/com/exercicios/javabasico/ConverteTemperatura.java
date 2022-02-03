package com.exercicios.javabasico;

import java.util.Scanner;

public class ConverteTemperatura {

	public static void main(String[] args) {

		String opcao;
		double grausC, grausF;

		Scanner scan = new Scanner(System.in);

		System.out.println("O que deseja converter? " + "\nDigite 'F'- para Farenheit e 'C'- para Celsius: ");
		opcao = scan.next();

		switch (opcao) {
		case "f":
		case "F":
			System.out.println("Informe a temperatura em Farenheit: ");
			grausF = scan.nextDouble();

			grausC = (5 * (grausF - 32) / 9);
			System.out.println("A temperatura " + grausF + "°F é igual a " + grausC + "°C");
			break;
		case "c":
		case "C":
			System.out.println("Informe a temperatura em Celsius: ");
			grausC = scan.nextDouble();

			grausF = grausC * 1.8 + 32;
			System.out.println("A temperatura " + grausC + "°C é igual a " + grausF + "°F");
			break;
		default:
			System.out.println("Opção invalida!");

		}

	}

}
