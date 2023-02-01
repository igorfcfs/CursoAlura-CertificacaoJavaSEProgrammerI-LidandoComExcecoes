
public class TestaArray2 {
	public static void main(String[] args) {
		Cliente[] clientes = new Cliente[10];
//		System.out.println(clientes[1].nome);
		
		for(int i = 0; i < clientes.length; i++) {
			clientes[i] = new Cliente();
			clientes[i].nome = "Mario";
		}
		
		for(Cliente c : clientes) {
			System.out.println(c.nome);
		}
		
		Cliente clientes2[] = new Cliente[5];
		clientes2[0] = new Cliente();
		clientes2[1] = new ClienteEspecial();
		
		Cliente igor = new Cliente();
		igor.nome = "Igor";
		
		clientes2[0] = igor;
		
		System.out.println(igor.nome);
		System.out.println(clientes2[0].nome);
		
		igor.nome = "Fernando";
		
		System.out.println(igor.nome);
		System.out.println(clientes2[0].nome);
		
		int[] valores = new int[10];
//		long[] numeros = (long[]) valores;
		
		String[] nomes = {"Mario", "Guilherme"};
		Object[] objetos;
		
		objetos = nomes;
		
		for(Object o : objetos) {
			System.out.println(o);
		}
	}
}

class Cliente {
	String nome;
}

class ClienteEspecial extends Cliente {}