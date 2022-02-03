package com.exercicios.javabasico;

/* salario bruto
 * desconto INSS__8%
 * desconto sindicato__5%
 * salario liquido com desconto IR__11%
 * total de descontos
 */

import java.util.Scanner;

public class FolhaPagamento {

	public static void main(String[] args) {

		double valorHora, qtdHoras, descINSS, descSind, descIR, totalDesc, salarioBruto, salarioLiquido;

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe quanto ganha por hora: ");
		valorHora = scan.nextDouble();

		System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
		qtdHoras = scan.nextDouble();

		salarioBruto = valorHora * qtdHoras;
		descINSS = (salarioBruto / 100) * 8;
		descSind = (salarioBruto / 100) * 5;
		descIR = (salarioBruto / 100) * 11;
		totalDesc = descINSS + descSind + descIR;
		salarioLiquido = salarioBruto - totalDesc;
		
		System.out.println("\n__________FOLHA DE PAGAMENTO__________ ");
		System.out.println("Salário: " + salarioBruto);
		System.out.println("Encargo de INSS: " + descINSS);
		System.out.println("Encargo de sindicato: " + descSind);
		System.out.println("Encargo de Imposto de Renda: " + descIR);
		System.out.println("Total de descontos: " + totalDesc);
		System.out.println("Salário líquido: " + salarioLiquido);
		
	}

}
