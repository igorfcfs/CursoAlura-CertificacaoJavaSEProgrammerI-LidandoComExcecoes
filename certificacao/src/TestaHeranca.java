//Toda classe por padrao herda de object
class Igor extends Object {
	
}

class Mae extends Igor {
	
}

class Filha extends Mae {
	
}

class Neta extends Mae {
	
}

//Classes final nao podem ser herdadas
//final class Final{}
//class TesteFinal extends Final{}

class Avenida extends modelo.Endereco {
//	Avenida(){
//		super();
//	}
	
	Avenida(){
		super("");
	}
}

class X{
	int x;
	public void y() {
		System.out.println("Invocando y em um objeto");
	}
}

class Y extends X {
	
}

class W {
	public static void metodo() {
		System.out.println("Invocando um metodo estatico que foi definido em W");
	}
//	abstract static void x();
}

class Z extends W {
	public static void metodo() {
//		super.metodo();
		System.out.println("Invocando um metodo estatico que foi definido em Z");
	}
}

class Gato {
	String corDosOlhos;
	public String toString(){
		return "[Gato " + corDosOlhos + "]";
 	}
}

class TestaHeranca{
	public static void main(String[] args) {
		
		Gato g = new Gato();
		g.corDosOlhos = "mel";
		System.out.println(g.toString());
		System.out.println(g);
		System.out.println("Estou com um " + g);
		
		Y y = new Y();
		y.x = 15;
		y.y();
		
		W.metodo();
		Z.metodo();
		
		Z z = new Z();
		z.metodo();
		
		/*Para metodos estaticos o binding e 
		 * feito em tempo de compilacaoc portanto 
		 * nao importa o objeto que estou referenciando 
		 * em tempo de execucao*/
		W w = new Z();
		w.metodo();
	}
}
