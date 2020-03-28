package br.com.fiap.tds.bean;

public class Produto {
	public String marca;
	public String nome;
	public double preco;
	public boolean blackfriday;

	
	
	public void colocarBlackFriday() {
		blackfriday = true;
		preco /= 2;
	}
	
	
	public double calcularParcelasPrazoInt(int parcelas) {
		double valor = preco / 2;
		return valor;
	}
	
	public void trocarNome(String nome) {
		this.nome = nome;
	}
	
	public void inicializar(String ma, String no,double pre,boolean bf) {
		this.marca = ma;
		this.nome = no;
		this.preco = pre;
		this.blackfriday = bf;
	}
	
	public String detalhes() {
		return (this.marca +", " +this.nome+", "+this.blackfriday);
	}

}
