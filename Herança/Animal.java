package Javatreino;

public class Animal {
	private String nome;
	private String raca;
	private String habitate;
	private String alimenta��o;
	private int idade;
	
	public Animal (String nome,String raca,String habitate, String alimenta��o,int idade) 
	{
		this.nome=nome;
		this.raca=raca;
		this.habitate=habitate;
		this.idade=idade;
		this.alimenta��o=alimenta��o;
		
	}
	
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getHabitate() {
		return habitate;
	}
	public void setHabitate(String habitate) {
		this.habitate = habitate;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getAlimenta��o() {
		return alimenta��o;
	}
	public void setAlimenta��o(String alimenta��o) {
		this.alimenta��o = alimenta��o;
	}
	
    
}
