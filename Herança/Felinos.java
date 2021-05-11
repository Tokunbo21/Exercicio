package Javatreino;



public class Felinos extends Animal{
	
	private double peso;
	private double altura;
	
	public Felinos(String nome,String raca, String habitate,String alimenta��o, int idade,double peso, double altura) 
	{
		
		super(nome,raca, habitate, alimenta��o,idade);
		this.peso=peso;
		this.altura=altura;
	}
	
	public void imprimrInfo() 
	{
		System.out.println("\nNome do felino:"+ getNome()+ "\nra�a: "+getRaca()+"\nhabitate: "+getHabitate()+"\nAlimenta��o: "+getAlimenta��o()+"\nIdade: "+ getIdade()+"\nPeso: "+peso+"\nAltura: "+altura);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	


}
