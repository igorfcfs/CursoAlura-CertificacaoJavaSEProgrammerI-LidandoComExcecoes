
public class TestaLacos {
	public static void main(String[] args) {
		//while vs do...while
		int j = 9;
		
		while (j < 10) {
			System.out.println("while " + j);
			j++;
		}
		
//		//exemplo de uma conta
//		while(conta.getSaldo > 0) {
//			conta.saca(1000);
//		}

		do {
			System.out.println("do...while " + j);
			j++;
		} while (j < 10);
		
		//for vs enhanced for
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		for (int i = 1; i < 10; i++) {
			array1[i] = 0;//possivel alterar um valor
		}
		for(int i : array1) {
			i = 0;//impossivel alterar um valor
		}
		for(int i : array2) {
		}
	}
}
