package com.exercicios.javabasico;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		int numero1, numero2, resultado;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		numero1 = scan.nextInt();
		System.out.println("Digite outro n�mero inteiro: ");
		numero2 = scan.nextInt();
		
		resultado = numero1 + numero2;
		System.out.println("Voc� digitou: " + numero1 + ", e digitou: "
				+ numero2 + "\nA soma desses dois n�meros �: " + resultado);
		
	}

}
