package br.com.fiap.tds;

public class Operacoes {

	//M�todo que ser� executado quando rodar 
	public static void main(String args[]) {
		//Declarar uma vari�vel para armazerar uma nota
		float s1 = 7;
		float s2 = 5;
		
		//Calcular a m�dia final do curso
		double media = s1*0.4 + s2*0.6;
		
		//Exibir a m�dia final
		System.out.println(media);		

		//Declarar uma vari�vel sem valor
		boolean aprovado;
		
		//Atribuir um valor a vari�vel
		s1 = 8;
		aprovado = true; //true -> verdadeiro, false -> falso
		
		//Calcular a m�dia novamente 
		//N�o � preciso declarar novamente a vari�vel
		media = s1*0.4 + s2*0.6; 
		//Exibir a m�dia
		System.out.println(media);
	}
	 
}