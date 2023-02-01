
public class TestaArrays {
	public static void main(String[] args) {
		//Formas de criar um array:
//		int[] idades
		
//		double pesos[];
//		
//		long []numeros;
//		
//		long[]tamanhos;
		
		//Instanciar arrays
//		int[] idades = new int[10];
//		int[] idades = new int[-1]; //- NegativeArraySizeException
//		int[] idades = new int[0];
//		int[] idades = new int[] {0,2,4,6,8};
		int[] idades = /*new int[] - Opcional*/{0,2,4,6,8};
		
		int[] idades2;
		idades2 = new int[]/*Obrigatorio*/ {0,2,4,6,8};
		
		Cliente[] clientes = new Cliente[] {new Cliente(), null, new Cliente()};
		System.out.println(idades[1]);
		
		System.out.println("-------------------");
		
		//ArrayIndexOutOfBoundsException
//		System.out.println(idades[5]);
		
		//Substituir valores no array
		System.out.println(idades[4]);
		idades[4] = 10;
		System.out.println(idades[4]);
		
		System.out.println("-------------------");
		
		System.out.println(idades.length);
		
		System.out.println("-------------------");
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		System.out.println("-------------------");
		
		for (int idade : idades) {
			System.out.println(idade);
		}
	}
}
