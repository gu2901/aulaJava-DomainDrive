package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Carro;

public class ViewMetodos {
	public static void main (String args[]) {
		//criar objeto da vclase carro
		Carro deLuxo = new Carro();
		
		
		//atribuir valor ao atributo pre�io
		deLuxo.preco = 30000;
				
		//chamar o metodo de calcularipva
		
	double valorIpva = deLuxo.calcularIpva();
		
		//exibir valor do ipva
		System.out.println("Valor do IPVA: "+valorIpva);
		
	deLuxo.aumentarValor(4000);
	
	System.out.println("Novo pre�o: "+deLuxo.preco);
		
	
	double precoOff = deLuxo.calculaDesconto(10);
	System.out.println("preco com desconto: "+precoOff);
			
	}
}
