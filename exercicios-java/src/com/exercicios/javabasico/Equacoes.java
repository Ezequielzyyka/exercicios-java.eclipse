package com.exercicios.javabasico;

// Calcular o produto do dobro do primeiro número com metade do segundo.
// a soma do triplo do primeiro com o terceiro.
// o terceiro elevado ao cubo.

import java.util.Scanner;

public class Equacoes {

	public static void main(String[] args) {
		
		int numero1, numero3;
		double numero2, resultado1, resultado2, resultado3;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		numero1 = scan.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		numero2 = scan.nextDouble();
		
		System.out.println("Digite um terceiro número: ");
		numero3 = scan.nextInt();
		
		resultado1 = (numero1 * 2) * (numero2 / 2);
		resultado2 = (resultado1 * 3) + numero3;
		resultado3 = Math.pow(numero3, 3);
		
		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 2: " + resultado2);
		System.out.println("Resultado 3: " + resultado3);

	}

}
