
public class TestaWhile {
	public static void main(String[] args) {
		
		int i = 1;
		boolean verdadeiro = true;
		
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
//		while(i < 10)
//			System.out.println(i++);
		
//		while(true) -> sempre sera executado
//			System.out.println(i);
//		//i++ -> erro - nunca sera executado, pois o while e infinito
		
//		while(false) -> erro - nunca sera executado
//			System.out.println(i);
		
//		while(verdadeiro)
//			System.out.println(i);
//		i++;
	}
}
