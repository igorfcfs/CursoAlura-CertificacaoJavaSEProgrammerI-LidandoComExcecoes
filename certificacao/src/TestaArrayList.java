import java.util.ArrayList;

public class TestaArrayList {
	public static void main(String[] args) {
//		String[] nomes = new String[10];
//		ArrayList nomes = new ArrayList();
//		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<String> nomes = new ArrayList<>();
		
		//o add sempre coloca o novo elemento ao final do array list
		nomes.add("java"); //-> adiciona
		nomes.add("ruby");
		nomes.add("java");
		
		System.out.println(nomes.contains("java"));
		System.out.println(nomes.contains("c#"));
		
		boolean removido = nomes.remove("java");
		
		System.out.println(removido);
		System.out.println(nomes.contains("java"));
		
		System.out.println(nomes.size());
		
		Object[] objetos = nomes.toArray(); //-> vai devolver um array de object
		
		String[] nomesArray = nomes.toArray(new String[nomes.size()]);
		String[] nomesArray2 = nomes.toArray(new String[0]);
		
		ArrayList<String> paises = new ArrayList<>();
		paises.add("Brasil");
		paises.add("Coreia");
		
		ArrayList<String> tudo = new ArrayList<>();
		tudo.addAll(nomes);
		tudo.addAll(paises);
		
		System.out.println(tudo.size());
		
		System.out.println(tudo.get(0));
		nomes.add(0, "php"); //-> add sobrecarga
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(1));
		
		nomes.remove(0); //-> remove sobrecarga
		System.out.println(nomes.get(0));
		
		nomes.set(0, "scala"); //-> substitui um elemento pelo outro
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(1));
		
		System.out.println(nomes.indexOf("java")); //-> index do primeiro elemento
		System.out.println(nomes.lastIndexOf("java")); //-> index do ultimo elemento
		System.out.println(nomes.indexOf("c#")); //-> retorna -1 pois este elemento nao existe
	}
}
