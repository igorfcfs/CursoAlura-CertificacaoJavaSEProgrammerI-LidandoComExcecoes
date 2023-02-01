import java.util.ArrayList;

public class TestaFor {
	public static void main(String[] args) {
//		int i = 1;
//		while(i < 10) {
//			System.out.println(i);
//			i++;
//		}
		
//		for(int i = 1; i < 10; i++) {
//			System.out.println(i);
//		}
		
//		for(int i = 1 < i < 10;) {
//			System.out.println(i);
//		}
		
//		for(;;) {
//			System.out.println("mensagem");
//		}
		
//		int i;
//		long j;
		
//		for(i = 0, j = 10; i < 10; i++, j--) {
//			System.out.println(i + " " + j);
//		}
		
//		for(i = 0, j = 10; i < 10; System.out.println(i + " " + j), i++, j--);
		
//		int numeros[] = {1,2,3,4,5,6};
//		//for
//		for(int i = 0; i < numeros.length; i++) {
//			int numero = numeros[i];
//			System.out.println(numero);
//		}
//		
//		System.out.println("---------------------------");
//		
//		//enhanced for
//		for(int numero : numeros)
//			System.out.println(numero);
		
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Igor");
		nomes.add("Fernando");
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}
}
