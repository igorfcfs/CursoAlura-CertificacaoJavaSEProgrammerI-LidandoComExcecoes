
public class TestaAritmetica {
	public static void main(String[] args) {
		int dois = 2;
		int dez = 10;
		
		int doze = dez + dois;
		int oito = dez - dois;
		int vinte = dez * dois;
		int cinco = dez / dois;
		int restoDaDivisaoDeCincoPorDois = 5 % 2;
		
//		int divisao1 = 5 / 0;
//		double divisao2 = (dois + 0) / 0;
		double divisao3 = 5 / 0.0;
		double divisao4 = 5.0 / 0;
		double divisao5 = -5.0 / 0;
//		                   int + double = double / 0 => Infinity
		double divisao6 = (dois + 0.0) / 0;
		
		System.out.println(divisao4);
		System.out.println(divisao5);
		
//		NaN => not a number -> nao e um numero
		double positivoInfinito = 5.0 / 0;
		double negativoInfinito = -5.0 / 0;
		System.out.println(positivoInfinito + negativoInfinito);
	}
}
