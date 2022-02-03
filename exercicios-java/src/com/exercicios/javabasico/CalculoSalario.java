package com.exercicios.javabasico;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		
		double valorHora, qtdHoras, salario;

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe quanto ganha por hora: ");
		valorHora = scan.nextDouble();

		System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
		qtdHoras = scan.nextDouble();

		salario = valorHora * qtdHoras;
		System.out.println("Seu salario é: " + salario);

	}

}
