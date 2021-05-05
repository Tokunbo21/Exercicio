package Turma22;

import java.util.Scanner;

public class Exercicioclass1 
{
    public static void main(String[] args) 
    {
		int num1,num2,num3,maior;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor:  ");
		num1= ler.nextInt();
		System.out.println("Entre com o segundo valor: ");
		num2= ler.nextInt();
		System.out.println("Entre com o terceiro valor: ");
		num3= ler.nextInt();
		
		if (num1>num2 && num1>num3)
		{
			maior= num1;
		}
		else if(num2>num1 && num2>num3)
		{
			maior=num2;
		}
		else 
		{
			maior=num3;
		}
		System.out.println("\nO maior número é: "+ maior);
	}
    
}
