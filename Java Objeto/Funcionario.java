package Javatreino;

public class Funcionario {
	private String nome;
	private String telefone;
	private String email;
	private String endere�o;
	
	public Funcionario (String nome, String telefone, String email,String endere�o) {
		this.nome= nome;
		this.telefone=telefone;
		this.email=email;
		this.endere�o=endere�o;
	}
	public String getinfo() 
	{
		String info= nome+ telefone+ email+ endere�o;
		return info;
	}

}

