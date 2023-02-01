
public class UnreacheableCode {
	public int metodo(int x) {
		if(x > 200) {
			return 10;
		}
		throw new RuntimeException();
	}
}
