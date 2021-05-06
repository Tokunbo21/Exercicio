package Turma22;

import java.util.Scanner;

public class ExercicioWhile {
	
	public static void main(String[] args)
	{   
		Scanner ler= new Scanner(System.in);
		int idade,total=0,totalb=0;
		System.out.println("Entre com a sua idade");
		idade = ler.nextInt();
		
		while(idade!=-99)
		{
			if(idade < 21) 
			{  
			    total ++;
			}
			else if(idade > 50)
			{
				totalb ++;
			}
			
			System.out.println("Entre com a sua idade");
			idade = ler.nextInt();
			
		}
		System.out.println("Entre com menos de 21: "+total);
		System.out.println("Entre com maisde 50: "+totalb);
	}

}
