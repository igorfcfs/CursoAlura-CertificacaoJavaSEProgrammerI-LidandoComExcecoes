class Livro {
	Livro(){
//		this(123);
		System.out.println("sem argumentos");
	}
	
	/*Var args: 0 ou mais argumentos*/
	Livro(String... s){
		System.out.println("strings");
	}
	
	Livro(int i){
		/*this() serve pra ivocar outro 
		 * construtor em um construtor,
		 * e smp tem q ser o primeiro*/
//		this();
		
		/*this() pode invocar somente 
		 * metodos estaticos para 
		 * atribuir valores*/
		this(valor());
		
//		this(123); //pode ter somente um this() em um construtor
//		new Livro(12341234); //loop infinito
		System.out.println("construtor com int");
	}
	static String valor() {
		return "xpto";
	}
}

public class TestaConstrutores2 {
	public static void main(String[] args) {
		Livro l = new Livro(123);
	}
}
