//quando algo e statico o scopo dele e a classe, ou seja, n precisa criar uma objeto para acessa-lo
//n posso acessar algo n estatico em algo estatico
class Moto {
	public static final int PADRAO_TOTAL_DE_MOTOS = 8;
	public static int totalDeMotos = PADRAO_TOTAL_DE_MOTOS;
	String marca;
	
	public static int getTotalDeMotos() {
//		marca = "Honda"; - > n e estatico
		return Moto.totalDeMotos;
	}
}

class MotocicletaDupla extends Moto {
	public static int getTotalDeMotos() {
		return -500000;
	}
}

public class TestaStatic {
	public static void main(String[] args) {
//		Moto.marca = "Honda"; -> n e estatico
		Moto.totalDeMotos = 15;
		System.out.println(Moto.totalDeMotos);
		
		Moto m = new MotocicletaDupla();
		System.out.println(m.getTotalDeMotos());
		
	}
}