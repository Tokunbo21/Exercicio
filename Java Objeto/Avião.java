package Javatreino;

public class Avião {
	private String modelo;
	private String tamanho;
	private String tipo;
	private String cor;
	
	
	public Avião(String modelo, String tamanho, String tipo, String cor) {
		
		this.modelo=modelo;
		this.tamanho= tamanho;
		this.tipo= tipo;
		this.cor=cor;
	
	}
	public void infor() {
		System.out.println("Avião do modelo"+modelo+"\nTamanho: "+ tamanho+"\nTipo: "+tipo+"\nE cor: "+cor);
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	

}
