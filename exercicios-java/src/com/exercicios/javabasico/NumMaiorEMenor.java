package com.exercicios.javabasico;

import java.util.Scanner;

public class NumMaiorEMenor {

	public static void main(String[] args) {

		int num1, num2, num3;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero. ");
		num1 = scan.nextInt();

		System.out.println("Digite o segundo n�mero. ");
		num2 = scan.nextInt();

		System.out.println("Digite o terceiro n�mero. ");
		num3 = scan.nextInt();

		if (num1 == num2 && num1 > num3) {
			System.out.println("Os dois primeiros n�meros s�o iguais e maiores = " + num1);
		} 
		else if (num1 == num3 && num1 > num2) {
			System.out.println("O primeiro e o ultimo n�mero s�o iguais e maiores = " + num1);
		} 
		else if (num2 == num3 && num2 > num1) {
			System.out.println("Os dois ultimos n�meros s�o iguais e maiores = " + num2);
		} 
		else if (num1 == num2 && num1 == num3) {
			System.out.println("Os tr�s n�meros s�o iguais = " + num1);
		}
		else {
			if (num1 > num2 && num1 > num3) {
				System.out.println("O primeiro n�mero � maior = " + num1);
			}
			else if (num2 > num1 && num2 > num3) {
				System.out.println("O segundo n�mero � maior = " + num2);
			} 
			else {
				System.out.println("O terceiro n�mero � maior = " + num3);
			}
		}
		
		if (num1 == num2 && num1 < num3) {
			System.out.println("Os dois primeiros n�meros s�o iguais e menores = " + num1);
		}
		else if (num1 == num3 && num1 < num2) {
			System.out.println("O primeiro e o ultimo n�mero s�o iguais e menores = " + num1);
		}
		else if (num2 == num3 && num2 < num1) {
			System.out.println("Os dois ultimos n�meros s�o iguais e menores = " + num2);
		}
		else if (num1 == num2 && num1 == num3) {
		}
		else {
			if (num1 < num2 && num1 < num3) {
				System.out.println("O primeiro n�mero � menor = " + num1);
			}
			else if (num2 < num1 & num2 < num3) {
				System.out.println("O segundo n�mero � menor = " + num2);
			}
			else {
				System.out.println("O terceiro n�mero � menor = " + num3);
			}
		}
		
	}

}
