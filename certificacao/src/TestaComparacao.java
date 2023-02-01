
public class TestaComparacao {
	public static void main(String[] args) {
		//Operadores de Comparacao
		//== -> igual => obs: nao confunda com o operador de atribuicao "="
		//!= -> diferente
		//>= -> maior-igual
		//<= = menor-igual
		//> -> maior
		//< -> menor
		
		System.out.println(1 == (100.0 / 100.0));
		
		int idade = 25;
		System.out.println(idade = 1);
		
		boolean mentira = false;
		System.out.println(mentira = true);
		
//		System.out.println(true == 1);
		
		System.out.println(true == true);
		System.out.println(true != false);
		
		System.out.println(1.0f == 1.0d);
		System.out.println(1.0f == 1l);
		
		System.out.println(1 == 1);
		System.out.println(1 != 1);
		
		System.out.println(2 <= 1);
		System.out.println(2 <= 1);
		System.out.println(2 > 1);
		System.out.println(2 < 1);
	}
}
