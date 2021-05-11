package Javatreino;

public class Cliente {
	private String cabelo;
	private String altura;
	private String olhos;
	private String nome;
	
	public Cliente (String cabelo, String altura, String olhos, String nome)
	{
		this.nome = nome;
		this.cabelo= cabelo;
		this.altura= altura;
		this.olhos= olhos;
	}
	public String getcaract() 
	{
		String caract = cabelo+" "+altura+" "+olhos+" "+nome;
		return caract;
	}

}
