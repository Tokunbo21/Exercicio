package Javatreino;

public class Peixes extends Animal {
	private String tipo;
	private String preferencia;
	
	public Peixes(String nome,String raca,String habitate, String alimenta��o,int idade,String tipo,String preferencia) 
	{
		super(nome,raca, habitate, alimenta��o,idade);
		this.tipo=tipo;
		this.preferencia=preferencia;
	}
	public void imprimiIfo() 
	{
		System.out.println("\nNome do Peixes: "+ getNome()+ "\nra�a: "+getRaca()+"\nhabitate: "+getHabitate()+"\nAlimenta��o:"+getAlimenta��o()+"\nIdade: "+ getIdade()+"\nTipo: "+tipo+ "\npreferencia: "+preferencia);
		System.out.println(getSom());
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPreferencia() {
		return preferencia;
	}
	public void setPreferencia(String preferencia) {
		this.preferencia = preferencia;
	}
	public String setSom() {
		return "nada"+ super.getSom()+" � o som do"+this.getNome();
	}

	

}
