package Turma22;

import java.util.Scanner;

public class Exercicioclass2 {
	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Primeiro valor");
		n1= ler.nextInt();
		System.out.println("Segundo valor");
		n2= ler.nextInt();
		System.out.println("Terceiro valor");
		n3= ler.nextInt();
		
		if (n1<n2) {
			if (n2<n3)
			{
			System.out.println(n1+" "+n2+" "+n3);
			}
			else if (n1 < n3) {
				System.out.println(n1+" "+n3+" "+n2);
			} 
			else {
				System.out.println(n3+" "+n1+" "+n2);
			}
		}
		else if (n2<n3) {
			if (n1<n3)
			{
			System.out.println(n2+" "+n1+" "+n3);
			}
			else {
				System.out.println(n2+" "+n3+" "+n1);
			} 
			
		} else {
			System.out.println(n3+" "+n2+" "+n1);
		}
	}

}
