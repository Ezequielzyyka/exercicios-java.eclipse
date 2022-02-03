package com.exercicios.javabasico;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		double raio, area;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		raio = scan.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do circulo é: " + area);

	}

}
