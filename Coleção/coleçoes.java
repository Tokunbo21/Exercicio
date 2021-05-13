package Treinamento;

import java.util.ArrayList;
import java.util.Scanner;

public class coleçoes {
	public static void main(String[] args) {
		int materiais;
		
	   Scanner leia= new Scanner(System.in);
	   
	   ArrayList<String> estoque = new ArrayList();
	   do 
	   {
		   System.out.println("\n-------------------");  
		   System.out.println("\n(1) Deseja adicionar produtos do estoques");
		   System.out.println("\n(2) Deseja remover produtos do estoques");
		   System.out.println("\n(3) Atualizar o estoques");
		   System.out.println("\n(4) Mostra  estoques");
		   System.out.println("\n(0) Encerrar o programa?");
		   System.out.println("\nDigite sua opção");
		   materiais= leia.nextInt();
		   
		   switch(materiais) 
		   {
		   case 1:
			   leia.nextLine();
			   System.out.println("\nDigite o produto para adicionar ao estoque");
			   String produto = leia.nextLine();
			   estoque.add(produto);
			   break;
		   case 2: 
			   leia.nextLine();
			   System.out.println("\nDigite o produto para remover ao estoque");
			   String produto1 = leia.nextLine();
			   if(estoque.contains(produto1)) 
			   {
				   estoque.remove(produto1);
			   }
			   else 
			   {
				   System.out.println("\nProduto não existe no seu estoque");
			   }
			   break;
		   case 3:
			    leia.nextLine();
			    System.out.println("\nDigite o produto que quer atualizar: ");
			    String verifica = leia.nextLine();
			    System.out.println("\nDigite o nome do produto que entrara no lugar" + verifica+": ");
			    String novo = leia.nextLine();
			    
			    if (estoque.contains(verifica)) 
			    {
			    	estoque.remove(verifica);
		    		estoque.add(novo);
			    	
			    }
			    else 
			    {
			    	System.out.println("\nProduto não existe no meu estoque!!!");
			    }
			    break;
		   case 4: 
			   System.out.println("\nMostra os produtos em estoques...");
			   System.out.println(estoque);
			   break;
			   default:
				   System.out.println("\nFinalizou o programa");
		   }
	   }while(materiais!=0);
	}
}


