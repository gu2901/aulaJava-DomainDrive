package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.Carro;

public class View {

	public static void main (String args[]) {
		Carro carroDoGus = new Carro();
	Carro ka = new Carro();
	
	carroDoGus.ligar();		
		//Objeto para ler teclado (tipo input manja) - Scanner
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o ano do carro");
		carroDoGus.ano = leitor.nextInt();
		
		System.out.println("Digite a marca do carro");
		carroDoGus.marca = leitor.next();
		
		System.out.println("Digite a modelo do carro");
		carroDoGus.modelo = leitor.next();
		
		System.out.println("Digite a motor do carro");
		carroDoGus.motor = leitor.nextFloat();
		
		System.out.println("Digite a preco do carro");
		carroDoGus.preco = leitor.nextDouble();
		
		System.out.println("Digite a automatico do carro");
		carroDoGus.automatico = leitor.nextBoolean();
		
		leitor.close();
		System.out.println(carroDoGus.ano);
		System.out.println(ka.ano + ka.modelo);
		
	
		
				
				
	}
	
	
}
