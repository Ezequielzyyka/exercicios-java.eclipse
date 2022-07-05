package com.exercicios.javabasico;

import java.util.Scanner;

public class NumMaiorEMenor {

	public static void main(String[] args) {

		int num1, num2, num3;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número. ");
		num1 = scan.nextInt();

		System.out.println("Digite o segundo número. ");
		num2 = scan.nextInt();

		System.out.println("Digite o terceiro número. ");
		num3 = scan.nextInt();

		if (num1 == num2 && num1 > num3) {
			System.out.println("Os dois primeiros números são iguais e maiores = " + num1);
		} 
		else if (num1 == num3 && num1 > num2) {
			System.out.println("O primeiro e o ultimo número são iguais e maiores = " + num1);
		} 
		else if (num2 == num3 && num2 > num1) {
			System.out.println("Os dois ultimos números são iguais e maiores = " + num2);
		} 
		else if (num1 == num2 && num1 == num3) {
			System.out.println("Os três números são iguais = " + num1);
		}
		else {
			if (num1 > num2 && num1 > num3) {
				System.out.println("O primeiro número é maior = " + num1);
			}
			else if (num2 > num1 && num2 > num3) {
				System.out.println("O segundo número é maior = " + num2);
			} 
			else {
				System.out.println("O terceiro número é maior = " + num3);
			}
		}
		
		if (num1 == num2 && num1 < num3) {
			System.out.println("Os dois primeiros números são iguais e menores = " + num1);
		}
		else if (num1 == num3 && num1 < num2) {
			System.out.println("O primeiro e o ultimo número são iguais e menores = " + num1);
		}
		else if (num2 == num3 && num2 < num1) {
			System.out.println("Os dois ultimos números são iguais e menores = " + num2);
		}
		else if (num1 == num2 && num1 == num3) {
		}
		else {
			if (num1 < num2 && num1 < num3) {
				System.out.println("O primeiro número é menor = " + num1);
			}
			else if (num2 < num1 & num2 < num3) {
				System.out.println("O segundo número é menor = " + num2);
			}
			else {
				System.out.println("O terceiro número é menor = " + num3);
			}
		}
		
	}

}
