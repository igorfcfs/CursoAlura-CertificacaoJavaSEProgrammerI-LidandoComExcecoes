
public class TestaIncrementos {
	public static void main(String[] args) {
		//Formas de incremento: ++, --, +=, -=, *=, /=
		
		int a = 10;
		a += ++a + a + ++a;
		
//		a = a + ++a + a + ++a;
//		a = 10 + ++a + a + ++a;
//		a = 10 + 11 + 11 + ++a;
//		a = 10 + 11 + 11 + 12;
//		a = 44;
		
		System.out.println(a);
		
		//pos-incremento/decremento -> x++/x-- -> primeiro imprime a variavel e depois aplica o incremento/decremento
		int i = 5;
		System.out.println(i--);
		
		//pre-incremento/decremento -> ++x/--x -> primeiro aplica o incremento/decremento e depois imprime a variavel
		int i1 = 5;
		System.out.println(++i1);
		
		int x = 5;
		System.out.println(x--);
//		x = x + 2 //ok
		
		x += 2;
		x -= 2;
		x *= 5;
		x /= 10;
		x *= 100;
		x %= 3;
		System.out.println(x += 3);
		
		byte b = 15;
//		b = b + 3; -> error
		b += 3;
		System.out.println(b);
		
		byte b1 = 10;
		b1 += 200;
		System.out.println(b1);
	}
}
