//Uma interface pode herdar de varias interfaces
interface M {
	//E uma constante
	/*static public final*/ int X = 10;
	
	/*Ate o java 1.7 nao podia ter metodos 
	 * estaticos dentro do corpo de uma 
	 * interface*/
	static void yyy() {
		
	}
}

class GuiM implements M{
	
}

interface N extends M, Runnable {
	
}

interface O extends N {
	
}

/*Uma interface nao pode implementar uma outra interface*/
//interface P implements M{
//	
//}

//Uma classe abstrata nao precisa ter metodos abstratos
abstract class SemMetodo {
	
}

//Mas se uma classe tiver pelo menos um metodo abstrato ela precisa ser abstrata
abstract class ComMetodoAbstrato {
	//Um metodo abstrato nao possui corpo
	abstract void executa();
	void liga() {
		
	}
	void desliga() {
		
	}
}

//abstract class H {
//	abstract void liga();
//}

interface H {
	/*public abstract*/void liga();
}

abstract class L implements H {
	
}

/*Quando forherdar de uma classe abstrata voce tem duas opcoes
 * 1- Implementar todos os metodos da classe abstrata
 * 2- Tornar esta classe abstrata*/

//abstract class I extends H {}
//class I extends H {
//	void liga() {
//		
//	}
//}

class I implements H, Runnable {
	public void liga() {
		
	}

	public void run() {
		
	}
}

abstract class J extends I{
	public void liga() {
	}
}

abstract class K extends J {}

public class TestaAbstractEInterface {
	public static void main(String[] args) {
		System.out.println(M.X);
		System.out.println(new GuiM().X);
		I i = new I();
		i.liga();
//		new SemMetodo();
//		new ComMetodoAbstrato();
	}
}
