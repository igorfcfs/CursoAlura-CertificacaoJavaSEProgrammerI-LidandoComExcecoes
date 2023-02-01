import java.io.*;

class AcessoAoArquivo {
	InputStream is = new FileInputStream("a.txt");
	AcessoAoArquivo() throws FileNotFoundException {
		
	}
}

class SaldoInsuficienteException extends Exception {
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}

class ContaDoBem{
	double saldo = 100;
	void saca(double quantidade) throws /*java.io.IOException*/SaldoInsuficienteException {
		if(this.saldo < quantidade) {
//			throw new IllegalArgumentException("Saldo insuficiente " + saldo + " para sacar " + quantidade);
//			throw new java.io.IOException("Saldo insuficiente " + saldo + " para sacar " + quantidade);
			throw new SaldoInsuficienteException("Saldo insuficiente " + saldo + " para sacar " + quantidade);
		}
		saldo -= quantidade;
	}
}

class TestaTrataException3 {
	public static void metodo1() /*throws java.io.IOException*/ {
		try {
			new ContaDoBem().saca(500);
		} catch(NullPointerException ex) {
			System.out.println("tratei nullpointer");
		} catch(RuntimeException ex) {
			System.out.println("tratei nullpointer");
		} catch(/*java.io.IOException*/SaldoInsuficienteException ex) {
			System.out.println("tratei saldo");
		}
	}
	
	public static void main(String[] args) {
		metodo1();
	}
}

public class TestaTrataException2 {
	public static void metodo1() {
		System.out.println("Primeiro antes");
		try {
			metodo2();
			System.out.println("Primeiro depois");
		} catch(NullPointerException ex) {
			System.out.println("Tratei");
		}
		System.out.println("Fim do metodo 1");
	}

	public static void metodo2() {
		String s = null;
		System.out.println("Segundo antes");
		s.length();
		System.out.println("Segundo depois");
	}

	public static void main(String[] args) {
		metodo1();
	}
}
