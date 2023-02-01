class A {
//	A() {
//		super();
//	}
	int i = 15;
	String nome;
//	int tamanho = tamanhoDoNome();
	String sobrenome = "fernando";
	int tamanho = tamanhoDoSobrenome();
//	String sobrenome = "fernando";
	
	A(String nome){
		imprimeNome();
		this.nome = nome;
//		System.out.println(i);
	}
	
//	int tamanhoDoNome() {
//		return nome.length();
//	}
	
	private void imprimeNome() {
		System.out.println(nome);
	}
	
	int tamanhoDoSobrenome() {
		return sobrenome.length();
	}
	
	A(){
	}
}

class B extends A {
	B(String s){
		super(s);
	}
	void imprimeNome() {
		System.out.println(nome.length());
	}
}
public class TestaConstrutores {
	public static void main(String args[]) {
		A a = new A();
		A b = new A("igor");
		System.out.println(b.i);
		B c = new B("igor");
	}
}
