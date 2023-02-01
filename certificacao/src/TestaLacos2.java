
public class TestaLacos2 {
	public static void main(String[] args) {
		
		System.out.println("for break e continue");
		
		//o break sai do laco mais proximo, se quiser sair de uma laco especifico de um nome a ele
//		int externo = 4; //o label tbm pode ter o mesmo nome de uma variavel
//		externo: for(int i = 1; i < 10; i++) {
//			tabuada: System.out.println("Tabuada do " + i); //o label e aceitavel antes de qualquer statement mas para dar um break/continue nele presisa ser antes de um for/while
//			interno: for(int j = 1; j < 10; j++) {
//				if(i * j == 25) break externo;
//				System.out.println(i + " * " + j + " = " + (i * j));
//			}
//		}
		
		//vc n pode dar um continue no switch, somente um break
		//eu posso dar varios labels para um laco ou switch
		http://www.alura.com.br
		for(int i = 0; i < 10; i++) {
			System.out.println("Estou antes do switch");
			igor:
			fernando: switch(i) {
			case 0:
			case 1:
				System.out.println("Caso " + i);
				for(int j = 0; j < 3; j++) {
					System.out.println(j);
					if(j == 1) break fernando;
				}
			case 2:
				System.out.println("Legal, " + i);
				continue;
			case 3:
				System.out.println("Cheguei no 3");
				break;
			default:
				System.out.println("Estranho...");
			}
			System.out.println("Estou apos o switch");
		}
		
		System.out.println();
		
		externo: for(int j = 1; j < 10; j++) {
			if(j == 8) break;
			if(j == 5) continue;
			System.out.println(j);
		}
		
		System.out.println();
		System.out.println("while break e continue");
		int i = 0;
		lacoWhile: while (i < 10) {
			i++;
//			if (i == 5) {
//				break;
//			} else {
//				System.out.println("i = " + i);
//			}
			if(i==5)break;
			System.out.println("i = " + i);
		}
		System.out.println("fora do while");
		
		int j = 0;
		while (j < 10) {
			j++;
//			if (i == 5) {
//				cotinue;
//			} else {
//				System.out.println("i = " + i);
//			}
			if(j==5)continue;
			System.out.println("j = " + j);
		}
		System.out.println("fora do while");
		
//		while(true); //-> nao compila
//		System.out.println("while true sem o break");
		
		int k = 0;
		while(true) {
			k++;
			if(k == 5) break;
			System.out.println("k = " + k);
		}
		System.out.println("fora do while");
	}
}
