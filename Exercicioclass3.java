package Turma22;

import java.util.Scanner;

public class Exercicioclass3 {
	public static void main(String[] args) {
		int idade;
		Scanner ler= new Scanner(System.in);
		System.out.println("Digite a sua idade");
		idade= ler.nextInt();
		
			if(idade>= 10 && idade<=14) 
			{
				System.out.println("Você esta na categoria infantil");
			}
			else if (idade>=15 && idade<=17) 
			{
				System.out.println("Você esta na categoria juvenil");
			}
			else 
			{
				System.out.println("Você esta na categoria Adulto");
			}
	}

}
