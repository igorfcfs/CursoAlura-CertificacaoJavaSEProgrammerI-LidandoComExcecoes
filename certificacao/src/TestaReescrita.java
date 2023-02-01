
/*Regras da reescrita
 * mesmo nome
 * mesmo tipo de parametros
 * visibilidade deve ser igual ou mais ampla
 * throws(Exceptions) deve ser igual ou mais especifico
 * o metodo da classe pai/mae nao pode ser final*/

interface C {
	void x();
}

class D implements C {
	/*todo metodo de interface por padrao e publico, e segundo a regra da
	 * sobreescrita, a visibilidade deve ser igual ou mais ampla. */
	public void x() {
		
	}
}

class E{
	public void metodo() {
		System.out.println("e");
//		this.metodo2();
	}
//	public void metodo2() {
//		System.out.println("Metodo 2 do pai");
//	}
}

class F extends E{
	public void metodo() {
		System.out.println("f");
		super.metodo();
	}
	public void metodo2() {
		System.out.println("g");
		metodo();
		super.metodo();
	}
	public static void main(String[] args) {
		new F().metodo2();
	}
}

class Veiculo{
	public void liga() throws java.io.IOException {
		System.out.println("O veiculo esta sendo ligado");
	}
}
class Helicoptero extends Veiculo {
	public void liga() /*throws java.sql.SQLException*/ {
		System.out.println("Ligando o helicoptero");
	}
}

//eu posso sobrescrever um metodo da classe pai/mae, como abstrato
abstract class Droid extends Veiculo {
	public abstract void liga();
}

class HexaDroid extends Droid{
	public void liga() {
		System.out.println("hexa");
	}
}

class FabricaDeVeiculo {
	Veiculo fabrica() {
		return new Veiculo();
	}
}

class FabricaDeHexaDroid extends FabricaDeVeiculo {
	//Quando estou sobreescrevendo o tipo deve ser compativel
	HexaDroid fabrica() {
		return new HexaDroid();
	}
}

class TestaReescrita{
	static void metodo(Veiculo v) throws java.io.IOException {
		v.liga();
	}
	public static void main(String[] args) throws java.io.IOException {
		
//		Helicoptero h1 = new Helicoptero();
//		Veiculo h1 = new Helicoptero();
//		Veiculo h1 = new FabricaDeHexaDroid().fabrica();
//		HexaDroid h1 = new FabricaDeHexaDroid().fabrica();
//		h1.liga();
		
		metodo(new HexaDroid());
		metodo(new Veiculo());
		metodo(new Helicoptero());
	}
}