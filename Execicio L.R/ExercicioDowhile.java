package Turma22;

import java.util.Scanner;

public class ExercicioDowhile 
{
 public static void main(String[] args) 
 {
	int num,soma=0;
	Scanner ler= new Scanner(System.in);
	
	
	do
	{
		System.out.println("insira um numero");
		num = ler.nextInt();
		soma= soma + num;
	}
	while (num!=0);
	System.out.println("A soma dos numeros é: "+ soma);
}

}
