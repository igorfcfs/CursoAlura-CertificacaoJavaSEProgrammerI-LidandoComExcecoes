
public class TestaPrecedenciaTrocada {
	public static void main(String[] args) {
		int a = 15 * 4 + 1;
		System.out.println(a);
		
		int b = 15 * (4 + 1);
		System.out.println(b);
		
		System.out.println(15 + 0 + " e cento e cinquenta");
		System.out.println(15 + (0 + " e cento e cinquenta"));
		
		System.out.println("igor" + "fernando".length());
		System.out.println(("igor" + " fernando").length());
	}
}
