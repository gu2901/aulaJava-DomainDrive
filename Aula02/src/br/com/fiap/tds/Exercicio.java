package br.com.fiap.tds;

import java.util.Scanner;

public class Exercicio {

	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		//Ler a m�dia final do aluno
		System.out.println("Digite a m�dia final:");
		float media = leitor.nextFloat();
		
		//Calcular a nota que � preciso para passar no exame
		float exame = 12 - media;
		//Exibe a nota necess�ria
		System.out.println("Nota necess�ria: " + exame);
		
		//Fecha o leitor
		leitor.close();
	}
	
}