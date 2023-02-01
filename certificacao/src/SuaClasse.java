
public class SuaClasse {
	public void fazAlgo(int[] idades) {
		if(idades != null && idades.length >= 2) {
			System.out.println(idades[1]);
		}
	}
	public static void main(String[] args) {
//		new SuaClasse().fazAlgo(new int[0]);
		new SuaClasse().fazAlgo(null);
	}
}
