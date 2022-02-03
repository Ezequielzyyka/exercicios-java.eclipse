package com.exercicios.javabasico;

import java.util.Scanner;

public class ConversorCentimetros {

	public static void main(String[] args) {
		
		double metros, cm;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de metros: ");
		metros = scan.nextDouble();
		
		cm = metros * 100;
		
		System.out.println(metros + " metros é igual a " + cm + " centimetros.");

	}

}
