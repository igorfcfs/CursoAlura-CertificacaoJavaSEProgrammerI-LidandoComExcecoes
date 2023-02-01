package modelo;

import financeiro.*;

public class TestaContaHeranca extends Conta{
	public static void main(String[] args) {
		Conta c = new ContaFinanceira();
//		ContaFinanceira c = new ContaFinanceira();
		c.fecha();
	}
}
