public class TestaTrataException {
	public static void main(String[] args) {
		String nome = null;
		try {
			nome.toLowerCase();
			new java.io.FileInputStream("a.txt");
			System.out.println("linha seguinte");
		} catch(/*NullPointerException, Throwable, Exception*/RuntimeException ex) {
			System.out.println("peguei a exception");
		} catch(java.io.IOException ex) {
			
		}
		System.out.println("terminei");
	}
}