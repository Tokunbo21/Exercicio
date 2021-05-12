package Javatreino;

public class Peixes extends Animal {
	private String tipo;
	private String preferencia;
	
	public Peixes(String nome,String raca,String habitate, String alimentação,int idade,String tipo,String preferencia) 
	{
		super(nome,raca, habitate, alimentação,idade);
		this.tipo=tipo;
		this.preferencia=preferencia;
	}
	public void imprimiIfo() 
	{
		System.out.println("\nNome do Peixes: "+ getNome()+ "\nraça: "+getRaca()+"\nhabitate: "+getHabitate()+"\nAlimentação:"+getAlimentação()+"\nIdade: "+ getIdade()+"\nTipo: "+tipo+ "\npreferencia: "+preferencia);
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
		return "nada"+ super.getSom()+" É o som do"+this.getNome();
	}

	

}
