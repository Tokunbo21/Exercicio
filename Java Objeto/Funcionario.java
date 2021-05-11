package Javatreino;

public class Funcionario {
	private String nome;
	private String telefone;
	private String email;
	private String endereço;
	
	public Funcionario (String nome, String telefone, String email,String endereço) {
		this.nome= nome;
		this.telefone=telefone;
		this.email=email;
		this.endereço=endereço;
	}
	public String getinfo() 
	{
		String info= nome+ telefone+ email+ endereço;
		return info;
	}

}

