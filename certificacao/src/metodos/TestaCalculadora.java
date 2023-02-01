package metodos;

class Calculadora {
	//regras do varargs:
	//tem que ser o ultimo argumento;
	//todos tem que ser definidos com o mesmo tipo na hora de receber eles;
	//um varargs(<tipo>...) e uma array, uma array(<tipo>[]) nao e um varags.
	public int soma(/*Obrigatorio*/String nome, /*Opcional*/int... numeros) {
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		return soma;
	}
}

public class TestaCalculadora {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		System.out.println(c.soma("igor", 3, 5));
		System.out.println(c.soma("igor", 3, 5, 10));
		System.out.println(c.soma("igor", 3, 5, 10, 4));
		System.out.println(c.soma("igor", 3, 5, 10, 4, 5));
		System.out.println(c.soma("igor", 3, 5, 10, 4, 5, 1, 2, 3, 4, 5));
		System.out.println(c.soma("igor", 3));
		System.out.println(c.soma("igor"));
		System.out.println(c.soma("igor", new int[]{3, 3}));
	}
}
