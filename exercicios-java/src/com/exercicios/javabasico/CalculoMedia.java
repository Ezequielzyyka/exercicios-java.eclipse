package com.exercicios.javabasico;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {

		double nota1, nota2, nota3, nota4, media;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = scan.nextDouble();

		System.out.println("Digite a terceira nota: ");
		nota3 = scan.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = scan.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Você obteve as seguintes notas: " + "\nNota 1: " + nota1 + "\nNota 2: "
				+ nota2 + "\nNota 3: " + nota3 + "\nNota 4: " + nota4);
		System.out.println("Sua média foi: " + media);
		
	}

}
