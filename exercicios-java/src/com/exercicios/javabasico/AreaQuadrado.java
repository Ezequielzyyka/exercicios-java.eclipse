package com.exercicios.javabasico;

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {
		
		double lado, area;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a medida do lado do quadrado: ");
		lado = scan.nextDouble();
		
		area = Math.pow(lado, 2);
		
		System.out.println("A área do quadrado é: " + area);
		
	}

}
