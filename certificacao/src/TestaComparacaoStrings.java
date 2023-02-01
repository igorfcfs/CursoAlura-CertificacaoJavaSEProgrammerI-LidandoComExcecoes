
public class TestaComparacaoStrings {
	public static void main(String[] args) {
		
//		String nome1 = new String("Igor");
//		String nome2 = new String("Igor");
		
//		String nome1 = "Igor";
//		String nome2 = "Igor";
		
		String nome1 = "Igor";
		String nome2 = "Igor";
		String nome3 = new String("Igor");
		
		System.out.println(nome1 == nome2);
		System.out.println(nome1 == nome3);
		System.out.println(nome1.equals(nome3));
		
	}
}
