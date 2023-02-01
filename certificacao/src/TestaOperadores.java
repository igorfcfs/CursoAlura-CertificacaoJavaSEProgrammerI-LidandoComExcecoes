import java.util.ArrayList;
import java.util.List;

public class TestaOperadores {
	public static void main(String[] args) {
		//Atribuicao
		long idade = 15;
		long idade1;
		idade1 = 15;
		
		ArrayList<String> lista = new ArrayList<>();
		List<String> lista2 = lista;
		
					//char ->
		//byte -> short -> int -> long
		//float -> double
		//char
		
		int a = 10;
		long b = 20;
		short c = 3;
		byte d = 4;
		char h = 65;
		
//		a = b -> error: n posso pegar uma variavel de um tipo maior e colocar em uma com o tipo menor, como por exemplo: colocar o long no int
		
		double e = 30.0;
		float f = 40.3f;
		double g = 40.3f;
		f = a;
		f = b;		
		f = c;		
		f = d;		
		g = a;		
		g = b;		
		g = c;		
		g = d;		
		
		byte idade2 = 127;//valor maximo positivo do byte
		byte idade3 = -128;//valor maximo negativo do byte
		
		short idade4 = 32767;//valor maximo positivo do short
		short idade5 = -32768;//valor maximo negativo do shot
		
		int idade6 = 2_119_999_999;//valor maximo positivo int
	}
}
