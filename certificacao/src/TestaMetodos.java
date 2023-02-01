import metodos.Pessoa;

class Param {
	String getNumero(int a) {
//		return "nada";
		
//		if(a>0) return "maior";
//		else if(a<0) return "menor";
//		return "zero";
		
		if(true) return "verdadeiro";
//		return "nunca cai aqui";
		throw new RuntimeException("jogando exception resolve o problema");
	}
	void primitivo(double a) {
		if(a>5) {
			return;
		}
		System.out.println("a");
//		return;
//		System.out.println("aaa");
	}
	void referencia(Object o) {
	}
	void teste(final int a, int b) {
		b = 10;
//		a = 5; -> n funciona pois o a e final, e uma variavel final n pode ser alterada
	}
}

class ClasseComMetodos{
	
	//modificadores
	//final: se essa classe for herdada o metodo nao podera ser sobrescrito
	//abstract: so a definicao/assinatura do metodo
	//static: o metodo e estatico, o metodo pertence a classe e nao ao objeto
	//syncronized: o acesso ao metodo e sincronizado, ele bloqueia acesso a diversas threads para acessar esse metodo
	//native: assim como o metodo abstrato, so definie a assinatura sem um corpo, ele permite a implementacao do metodo atraves de um codigo nativo, n vai ser cobrado na prova
	//strictfp: faz com que as contas de ponto flutuante sejam resolvidas de formas bem deterministicas, n vai ser cobrado na prova
	public int getNumero(int i, String x, Pessoa p) {
		return 2;
	}
	
	int getNumero() {
		return 5;
	}
}

public class TestaMetodos {
	public static void main(String[] args) {
		Param p = new Param();
		int a = 1;
		System.out.println(p.getNumero(46));
		String resultado = p.getNumero(423);
		
//		int i = p.primitivo('Z'); -> impossivel fazer um metodo void referenciar a uma variavel
		p.primitivo('Z');
		p.referencia(new Object());
		p.referencia("igor");
		p.primitivo(a);
		p.teste(1, 2);
	}
}
