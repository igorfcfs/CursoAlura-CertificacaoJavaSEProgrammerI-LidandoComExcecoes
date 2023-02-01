
public class TestaComparaIfs {
	public static void main(String[] args) {
		boolean autentico = true;

		if (autentico) {
			System.out.println("Ok");
		} else {
			System.out.println("Nao autorizado");
		}

		if (1 < 2) {
			System.out.println("Ok");
		}

		boolean valor = true;

		if (!valor) { // valor == false
			System.out.println("False");
		}

		if (valor) { // valor == true
			System.out.println("valor");
		}

		int a = 0, b = 3;
//		if(a = b) { --> erro: nao compila, vc esta atribuindo o valor de b na variavel a, e n comparando eles
//			System.out.println("iguais");
//		}
		if (a == b) {
			System.out.println("iguais");
		}

		boolean v = true;
		// as chaves sao opcionais quando so temos uma linha de codigo dentro do if
		if (v)
			System.out.println("true");
		else
			System.out.println("false");

		if (v)
			System.out.println("v");
		else if (valor)
			System.out.println("false");
		else if (!valor)
			System.out.println("false");
		else
			System.out.println("so else");

		if (autentico)
			System.out.println("autentico");
		else
			System.out.println("Falhou");
			// lembre-se: aqui n tem as chaves e tem duas linhas de codigo,
			// o "tente novamente" n faz parte do bloco else,
			// aqui n esta com a identacao correta
			System.out.println("Tente novamente");

		// a identacao correta seria:
		if (autentico)
			System.out.println("autentico");
		else
			System.out.println("Falhou");
		System.out.println("Tente novamente");
		
		//se vc quisesse o "tente novamente" dentro do bloco else, ficaria:
		if(autentico)
			System.out.println("autentico");
		else {
			System.out.println("Falhou");
			System.out.println("Tente novamente");
		}
	}
}
