import java.util.ArrayList;
import java.util.Iterator;

public class TestaArrayList2 {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("java");
		nomes.add("ruby");
		nomes.add("scala");
		
		Iterator<String> it = nomes.iterator();
		
		while(it.hasNext()) {
			String atual = it.next();
			System.out.println(atual);
			//it.remove();
		}
		System.out.println(nomes.size());
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		Cliente igor = new Cliente();
		igor.nome = "igor";
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		
		clientes.add(igor);
		
		System.out.println(igor.nome);
		System.out.println(clientes.get(0).nome);
		
		igor.nome = "Fernando";
		
		System.out.println(igor.nome);
		System.out.println(clientes.get(0).nome);
	}
}
