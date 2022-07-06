package com.exercicios.javabasico;

import java.util.Scanner;

public class Cumprimentos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String turno;
		
		System.out.println("Informe o turno que se encontra: 'M'- Matutino, 'V'- Vespertino, 'N'- Noturno. ");
		turno = scan.next();
		
		switch(turno) {
			case "m":
			case "M": System.out.println("Bom Dia!"); break;
			case "v":
			case "V": System.out.println("Boa Tarde!"); break;
			case "n":
			case "N": System.out.println("Boa Noite!"); break;
			default: System.out.println("Opção inválida!"); 
				
		}
	}

}
