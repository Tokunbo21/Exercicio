package Turma22;

import java.util.Scanner;

public class ExercicioVetor {
	public static void main(String[] args) 
	{
		int [] num = new int [6];
		int somapar=0,Qimpar=0,x=0; 
		Scanner ler = new Scanner(System.in);
		
		for(x=0;x<6;x++) 
		{ 
			System.out.println("Digite o seu numero" );
			num[x] = ler.nextInt();
			
			if (num[x]%2==0) {
				
				somapar= somapar + num[x];
			}
			else 
			{
				Qimpar++;
			}
		}
		for (x=0;x<6;x++) 
		{
			if (num[x]%2==0)
			{
				System.out.println("\nÉ par: "+num[x]);
			}
			else {
				System.out.println("\nÉ impar:" +num[x]);
			}
		}
		System.out.println("\n A soma dos pares: "+somapar );
		System.out.println("\n Quantidade de impar"+ Qimpar);
		
	}

}
