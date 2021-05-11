package Javatreino;



public class Felinos extends Animal{
	
	private double peso;
	private double altura;
	
	public Felinos(String nome,String raca, String habitate,String alimentação, int idade,double peso, double altura) 
	{
		
		super(nome,raca, habitate, alimentação,idade);
		this.peso=peso;
		this.altura=altura;
	}
	
	public void imprimrInfo() 
	{
		System.out.println("\nNome do felino:"+ getNome()+ "\nraça: "+getRaca()+"\nhabitate: "+getHabitate()+"\nAlimentação: "+getAlimentação()+"\nIdade: "+ getIdade()+"\nPeso: "+peso+"\nAltura: "+altura);
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
