package Turma22;

import java.util.Scanner;

public class Exercicioclass4 {
    public static void main(String[] args) {
    	float num,num2,num3;
    	Scanner ler= new Scanner(System.in);
    	num = ler.nextFloat();
    	
    	
    	if(num%2==0)
    	{  		 
    		 num2 =(float)Math.sqrt(num);
    		 System.out.println("é par"+"e a raiz é: "+ num2);
    		
    	}
    	else if(num%2==1) {
    		num3 =(float) Math.pow(num, 2);
    		System.out.println("É impar "+"e o quadrado é:"+num3);
    		
    	}
	}
}
