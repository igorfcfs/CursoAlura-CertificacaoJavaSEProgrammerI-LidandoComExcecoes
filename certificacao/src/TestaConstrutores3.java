class Automovel {
//	double velocidade;
	double velocidade = 30;
}

class Caminhao extends Automovel {
//	double velocidade;
	double velocidade = super.velocidade;
	double velocidadeDoCaminhao() {
		return this.velocidade;
	}
	double velocidadeDoAutomovel() {
		return super.velocidade;
	}
}

class Pai{
	long numeroGrande;//*
	long segundoNumeroGrande;//***
	Pai(){}
	Pai(String s){
		System.out.println("Pai");
	}
	Pai(int i){}
}

/*super tem sempre que ser a primeira linha e 
pode ter somente um em cada construtor*/
class Filho extends Pai {
	long segundoNumeroGrande;//**
	Filho(int i){
//		super();
//		super(i);
		this("numero: " + i);
		
		numeroGrande = 33;//*
		this.numeroGrande = 33;//*
		super.numeroGrande = 33;//*
		
		segundoNumeroGrande = 33;//**
		this.segundoNumeroGrande = 33;//**
		super.segundoNumeroGrande = 34;//***
		
		i = 3;
		s = "igor";
		System.out.println("fim do construtor com numero");
	}
	String s;
	Filho(String s){
//		this(423); //loop this pra this, detecta e nao compila
		super(s);
//		new Filho("asfasdf"); //loop new, nao detecta e compila, porem da erro
		this.s = s;
		System.out.println(s);
	}
}

public class TestaConstrutores3 {
	public static void main(String[] args) {
//		new Filho("Igor");
		new Filho(567);
		
		Caminhao c = new Caminhao();
//		c.velocidade = 50;
		((Automovel)c).velocidade = 50;
		System.out.println("Velocidade do caminhao: "+c.velocidadeDoCaminhao());
		System.out.println("Velocidade do automovel: "+c.velocidadeDoAutomovel());
	}
}
