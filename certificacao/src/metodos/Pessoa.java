package metodos;

public class Pessoa {
	String nome;
	int idade;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void imprime() {
		getNome();
		this.getNome();
		System.out.println(getNome());
		System.out.println(this.getNome());
	}
}
