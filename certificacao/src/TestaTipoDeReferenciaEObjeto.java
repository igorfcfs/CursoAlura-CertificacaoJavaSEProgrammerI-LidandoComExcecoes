import java.util.*;

/*abstract*/ class Conta {
	int id;
	void liga() {};
//	abstract void fecha();
}

class ContaJuridica extends Conta {
	String cnpj;
	void fecha() {};
}

class ContaFisica extends Conta {
	void fecha() {}
}

public class TestaTipoDeReferenciaEObjeto {
	public static void main(String[] args) {
		Conta c = new ContaJuridica();
		c.id = 15;
		c.liga();
//		c.fecha();
//		c.cnpj = "5000";

		(new ContaJuridica()).cnpj = "15";
//		ContaJuridica d = c;

		List lista = new ArrayList();
	}
}
