package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Produto;

public class Terminal {
	public static void main(String args[]) {
		
		Produto celular = new Produto();
		
		celular.inicializar("Xiaoimi", "Mi8", 2000, false);
		System.out.println(celular);
		
		celular.colocarBlackFriday();
		
		System.out.println("Preco: "+celular.preco);
		
		double precoParcelado = celular.calcularParcelasPrazoInt(5);
		System.out.println(precoParcelado);		
		
		String detalhes = celular.detalhes();
		System.out.println(detalhes);
		
	}
	
}
