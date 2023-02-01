
public class TestaDoWhile {
	public static void main(String[] args) {
//		int i = 1;
//		while(i < 10) {
//			System.out.println(i);
//			i++;
//		}
//		
//		int j = 1;		
//		do {
//			System.out.println(j);
//			j++;
//		} while(j < 10);
		
//		int i = 20;
//		while(i < 10) {
//			System.out.println(i++);
//		}
//		
//		int j = 20;		
//		do {
//			System.out.println(j++);
//			j++;
//		} while(j < 10);
		
		int i = 1;
		while(i < 10)
			System.out.println(i++);
			System.out.println("oi"); //-> identacao errada
		
		int j = 1;		
		do
			System.out.println(j++);
//		System.out.println("oi"); //error -> nao se pode colocar mais de uma linha sem chaves dentro do do/while
		while(j < 10);
	}
}
