package Javatreino;

public class Passaros extends Animal {
	private String rotas;
	private String penas;
	
	public Passaros(String nome,String raca, String habitate,String alimenta��o, int idade,String rotas,String pena) {
		
		super(nome,raca, habitate, alimenta��o,idade);
		this.rotas=rotas;
		this.penas=pena;
	}
	public void imprimeInfo() 
	{
		System.out.println("\nNome do Passaro: "+ getNome()+ "\nra�a"+getRaca()+"\nhabitate"+getHabitate()+"\nAlimenta��o"+getAlimenta��o()+"\nIdade "+ getIdade()+"\nRota"+rotas+"\nPenas: "+penas);
		System.out.println(getSom());
	}

	public String getRota() {
		return rotas;
	}

	public void setRota(String rotas) {
		this.rotas = rotas;
	}

	public String getPenas() {
		return penas;
	}

	public void setPenas(String penas) {
		this.penas = penas;
	}
	public String setSom() {
		return "Passaro"+ super.getSom()+" � o som do"+this.getNome();
	}

	
    
}
	


