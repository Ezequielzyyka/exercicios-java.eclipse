package com.exercicios.javabasico;

import java.util.Scanner;

public class VogalOuConsoante {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra. ");
		String letra = scan.next();

		if (letra.matches("^[a-zA-Z]")) {
			switch (letra) {
				case "a":
				case "e":
				case "i":
				case "o":
				case "u":
				case "A":
				case "E":
				case "I":
				case "O":
				case "U":
					System.out.println("Essa letra é uma vogal."); break;
				default:
				System.out.println("Essa letra é uma consoante.");
			}
		} else {
			System.out.println("Opção inválida.");
		}
	}

}
