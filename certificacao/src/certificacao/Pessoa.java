//declaracao do pacote
package certificacao;// - opcional, mas sempre e a primeira informacao

//comentarioa antes do import
import java.util.*;//direita do import

interface A {
	/*public static final*/ int tamanho = 5;
	/*public abstract*/ void autentica(String nome, String senha);
}

class B {
	int B;
	B() {
//		A.TAMANHO = 15; - nao pode alterar o valor
//		A.tamanho = 15; - nao pode alterar o valor pois ela e final 
	}
	void B() {
	}
}

/**Javadoc*/
public class /*nome da classe*/ Pessoa {
	/*tudo que estiver aqui*/
	static int totalDePessoas = 0;
	
	String nome;
	
	Pessoa(String nome) {
		if (nome == null) {
			nome = "Guilherme";
			return;
		}
		this.nome = nome;
	}
	
	String getNome() {
		String sobrenome = "Silveira";
		return nome + sobrenome;
	}
}

interface Figura {
}