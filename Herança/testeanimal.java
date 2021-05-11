package Javatreino;

public class testeanimal {
	public static void main(String args[]) 
	{
		Felinos gato= new Felinos("Gato","Bengal cat","Floresta","passaros", 5, 20, 1.20);
		gato.imprimrInfo();
		
		Passaros aves= new Passaros("João de barros","Furnarius", "Florestas e cidades", "incetos",3,"sul","de cor marron");
		aves.imprimeInfo();
		
		Peixes dourado=new Peixes("Peixe dourado","Kinguio","lagos","incetos e ração",4," goldfish","agua doce");
		dourado.imprimiIfo();
	}

}
