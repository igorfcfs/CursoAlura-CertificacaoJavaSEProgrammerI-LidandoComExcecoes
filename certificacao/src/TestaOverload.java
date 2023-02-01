class Overloader {
	//sobrecarga de metodos significa que um numero dos parametros, ou os tipos dos parametros sao diferentes
	//um metodo so e sobrecarregado se ele possui o mesmo nome, tipos e quantidades de parametros diferentes
	public void metodo6(Object a, Object b) {
		System.out.println("Object, Object");
	}
	public void metodo6(String a, String b ) {
		System.out.println("String, String");
	}
	
	public void metodo5(String a, Object b) {
		System.out.println("String, Object");
	}
	public void metodo5(Object a, String b) {
		System.out.println("Object, String");
	}
	
	public void metodo4(int a, double b) {
		System.out.println("int, double");
	}
	public void metodo4(double b, int a) {
		System.out.println("double, int");
	}
	
	public void metodo3(String a, int b) {
		System.out.println("String, int");
	}
	public void metodo3(int b, String a) {
		System.out.println("int, String");
	}
	
	public void metodo2(String s) {
		System.out.println("com string");
	}
	public void metodo2(Object s) {
		System.out.println("com object");
	}
	
	
	public void metodo(int a) {
		System.out.println("com int");
	}
	public void metodo(double a) {
		System.out.println("com double");
	}
	public void metodo() {
		System.out.println("sem nada");
	}
}

public class TestaOverload {
	public static void main(String[] args) {
		new Overloader().metodo6("igor", "igor");
		new Overloader().metodo6(new Object(), new Object());
		new Overloader().metodo6(new Carro(), new Carro());
		new Overloader().metodo6("igor", new Object());
		
//		new Overloader().metodo5("igor", "fernando");
		
		new Overloader().metodo4(3, 5.2);
		new Overloader().metodo4(5.2, 3);
//		new Overloader().metodo4(4, 3);
		
		new Overloader().metodo2("igor");
		new Overloader().metodo2((Object) "igor");
		new Overloader().metodo2(new Object());
		
		new Overloader().metodo();
		new Overloader().metodo((short) 123);
		new Overloader().metodo(423);
		new Overloader().metodo((float) 123);
		new Overloader().metodo(423.3);
	}
}
