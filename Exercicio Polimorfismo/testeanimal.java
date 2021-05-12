package Javatreino;

public class testeanimal {
	public static void main(String args[]) 
	{
		Felinos gato= new Felinos("Gato","Bengal cat","Floresta","passaros", 5, 20, 1.20);
		gato.setSom("Seu som é Miauuu");
		gato.imprimrInfo();
		
		Passaros aves= new Passaros("João de barros","Furnarius", "Florestas e cidades", "incetos",3,"sul","de cor marron");
		aves.setSom("Seu som piu piu piu");
		aves.imprimeInfo();
		
		Peixes dourado=new Peixes("Peixe dourado","Kinguio","lagos","incetos e ração",4," goldfish","agua doce");
		dourado.setSom("Seu som glub glub");
		dourado.imprimiIfo();
	}

}
