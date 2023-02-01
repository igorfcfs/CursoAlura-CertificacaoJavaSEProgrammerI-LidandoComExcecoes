package financeiro;

import modelo.*;

public class ContaFinanceira extends Conta{
	/*Atencao
	 * Este metodo nao esta sobreescrevendo o metodo fecha de conta, por mais
	 * q pareca que esteja, pois a visibilidade do metodo fecha de conta e 
	 * <package private>, ou seja, so tem acesso a ele quem estiver dentro 
	 * do mesmo pacote. Por conta disso, por questao de seuranca, uma 
	 * opcao e usar a assinatura @Override*/
//	@Override
//	void fecha() {
//		System.out.println("financeira");
//	}
	
	@Override
	protected void fecha() {
		System.out.println("financeira");
	}
}
