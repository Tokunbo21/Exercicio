package Turma22;

import java.util.Scanner;

public class ExecicioFOR
 {
   public static void main(String[] args) 
   {
	    int x,Qpar=0,Qimpar=0,valor;
		Scanner ler = new Scanner(System.in);
			
	for(valor=1;valor<=10;valor++) 
	{
		System.out.println("numero "+valor);
		x = ler.nextInt();
		if (x%2==0) 
		{
			Qpar ++;
		}
		else if(x%2==1)
		{
			Qimpar ++;
		}
	}
	System.out.println("Quantidade de par"+Qpar);
	System.out.println("Quantidade de impar"+Qimpar);
	
   }
  }
