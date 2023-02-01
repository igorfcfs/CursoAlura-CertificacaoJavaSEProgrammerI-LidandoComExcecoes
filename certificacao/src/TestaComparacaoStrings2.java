
public class TestaComparacaoStrings2 {
	public static void main(String[] args) {
//		String a = "a";
//		String ab = "a" + "b";
//		String ab2 = a + "b";
//		System.out.println(ab == "ab");//vai pro pool
//		System.out.println(ab2 == "ab");//n vai pro pool
		
//		String texto = "um texto qualquer";
//		String txt = texto.substring(3, 8);
//		System.out.println(txt == "texto");
//		System.out.println(texto.toLowerCase() == texto);
//		System.out.println(texto.toString() == texto);
		
		//Quantos objetos foram criados?
		String h = new String("hello "); //2
		String h1 = "hello "; //0
		String w = "world"; //1
		
		System.out.println("hello "); //0
		System.out.println(h1 + "world"); //1
		System.out.println("Hello " == h1); //1
		
		//Sao criados 5 objetos de String neste codigo
	}
}
