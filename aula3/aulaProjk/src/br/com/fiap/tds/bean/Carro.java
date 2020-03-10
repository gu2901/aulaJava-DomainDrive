package br.com.fiap.tds.bean;

public class Carro {
//Atributos
public String modelo;
public String marca;
public int ano;
public float motor;
public double preco;
public boolean automatico;

	
//Metodo sem retorno	
	public void ligar() {
		System.out.println("Carro ligando...");
	}
	
//metodo com retorno
	public double calcularIpva(){
		double ipva = preco * 0.04;
		return ipva;
	}
	
//metodo com parametros
	public void aumentarValor(double valor) {
		preco += valor;
	}
	
	
	//metodo que retornar e recebe valores
	public double calculaDesconto(double desconto) {
	double precoDoDesconto = preco*desconto/100;
	double precoComDesconto = preco - precoDoDesconto;
	return precoComDesconto;
	}
}
