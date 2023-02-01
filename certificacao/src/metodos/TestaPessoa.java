package metodos;

public class TestaPessoa {
	
	public static void main(String args[]) {
		Pessoa p = new Pessoa();
		
		p.setNome("Igor"
				, 
				   15);//obs: pode ter quebra de linhas enquanto passamos os atributos
		
		String nome = p.getNome();
		System.out.println(nome);
		
		p.getNome();
		System.out.println(p.getNome());
	}
}
