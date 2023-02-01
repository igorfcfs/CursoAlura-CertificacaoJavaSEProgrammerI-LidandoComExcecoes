
public class TestaTernario {
	public static void main(String[] args) {
		//(condicao) ? caso_verdadeira : caso_falsa
		int i = 5;
		int resultado = (i == 5) ? 100 : 0;
		System.out.println(resultado);
		System.out.println(i == 5 ? 100 : 0);
		System.out.println(i == 5 ? "100" : 0);
		
//		int resultado2 = i == 5 ? "100" : 0; -> error -> tipo n e compativel
//		System.out.println(resultado2);
		
		double resultado3 = i == 5 ? 100 : 0d;
		System.out.println(resultado3);
		
		Object resultado4 = i == 5 ? "100" : 0d;
		System.out.println(resultado4);
	}
}
