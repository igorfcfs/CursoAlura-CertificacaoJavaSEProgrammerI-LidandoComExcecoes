class Motor{
}
class Car {
	int ano;
	char primeiraLetra;
	boolean usado;
	Motor motor;
	String marca;
	
}

public class Teste {

	public static void main(String[] args) {
//		int idade;
//		if(args.length>10) {
//			idade = 15;
//		} else {
//			System.out.println("faca outra coisa");
//			idade = 0;
//		}
//		System.out.println(idade);
		
		char c = 'A';
		char c1= 65;
		char c2 = '\u03A9';
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		
		boolean valor = true;
		
		int valor$ = 11;//nao recomendado
		int bonitão = 22;//nao recomendado, pois se vc tiver que compartilhar este codigo com um americano por exemplo iria gerar um monte de confusao para acessar esta variavel
		
		//convencoes de nomes de variaveis em Java
		int ele_e_rico = 33;//padrao nao recomendado, mas compilavel em Java, padrao snake_case
		int EleERico = 44;//padrao nao recomendado, mas compilavel em Java, padrao PascalCase
//		int ele-e-rico = 55;//padrao nao recomendado e nao compilavel em Java, padrao kebab-case
		int eleERico = 13;//padrao recomendado pro Java, padrao camelCase
		
		//o java e case sensitive, as letras maiusculas importam!
		int idade = 1;
		int IDADE = 2;
		int Idade = 3;
		
		long x2 = 1_234_567__891____________234l;//posso usar o underline entre digitos que dao o valor real
		
		int x1 = 0xF___F;
		int x = 1_5;
		double v = 10.2;
		long l = 13l;
		float f = 13.1f;
		
		double d2 = 3.1E2;
		System.out.println(d2);
		
		float f2 = 2e3f;
		System.out.println(f2);
		
		
//		int i = 0761;//numero octal
//		int i = 0xA;//numero hexadecimal
		int i = 0b11;//numero binario
		System.out.println(i);
		
		int[] valores = new int[10];
		System.out.println(valores[0]);
		
		boolean[] valoresbool = new boolean[10];
		System.out.println(valoresbool[0]);
		
		String[] valorestext = new String[10];
		System.out.println(valorestext[0]);
		
		Car carro = new Car();
		System.out.println(carro.ano);
		System.out.println(carro.primeiraLetra == 0); System.out.println(carro.primeiraLetra);
		System.out.println(carro.usado);
		System.out.println(carro.motor);
		System.out.println(carro.marca);
	}
}
