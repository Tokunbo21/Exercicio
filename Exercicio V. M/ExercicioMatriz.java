package Turma22;

import java.util.Scanner;

public class ExercicioMatriz 
{
  public static void main(String[] args) 
  {
	float[][] notas= new float[3][3];
	int quant=0, linha,coluna,cont=0;
		Scanner ler= new Scanner(System.in);
		
	for(linha=0;linha<3;linha++) 
	{
		for(coluna=0;coluna<3;coluna++) {
			System.out.println("Digite um Número: ");
			notas[linha][coluna]= ler.nextFloat();
			cont++;
		
		if(notas[linha][coluna]>10) 
		{
			quant++;
		}
	 }
	}
	System.out.println("\nQuantidade de numeros maiores que 10: "+quant);
	
  }
}
