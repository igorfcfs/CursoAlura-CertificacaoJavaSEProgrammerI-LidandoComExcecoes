import java.util.*;

class BlocoEstatico {
	static {
		String s = null;
		s.length();
	}
}

class NovaConta {
	double saldo = 100;

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new IllegalArgumentException();
		}
		saldo -= valor;
	}
}

class Tarefa {
	boolean rodando = false;

	void start() {
		if (rodando) {
			throw new IllegalStateException();
		}
		rodando = true;
	}

	void stop() {
		rodando = false;
	}
}

public class TestaException4 {

	public static void metodo() {
		metodo();
	}

	public static void main(String[] args) {

		// ArrayIndexOutOfBoundsException
		int[] x = new int[56];
		x[56] = 13;

		// IndexOutOfBoundsException
		ArrayList<String> lista = new ArrayList();
		lista.add("Igor");
		lista.add("Jorge");

		lista.get(2);

		// NullPointerException
		String s = null;
		s.length();

		// ClassCastException
		Object o = "Igor";
		Date date = (Date) o;

		// NumberFormatException
		String numero1 = "1a";
		int um = Integer.parseInt(numero1);

		Tarefa t = new Tarefa();

		// ExceptionInInitializerError
		new BlocoEstatico();

		// StackOverFlowError
		new TestaException4().metodo();

		// OutOfMemoryError
		boolean sempre = true;
		ArrayList<String> strings = new ArrayList();
		String inicial = "igor";
		while (sempre) {
			inicial += "igor";
			strings.add(inicial);
		}
	}
}
