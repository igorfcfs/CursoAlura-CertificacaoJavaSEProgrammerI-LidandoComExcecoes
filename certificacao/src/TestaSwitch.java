
public class TestaSwitch {
	public static void main(String[] args) {
		int opcao = 3;
		final int variavel = 2;

		switch (opcao) {
		// Case:
		// parenteses opcionais, variavel so se ela for final
		// tipos: numeros so se for int ou menor, String, char, etc.
		case (5 - 4):
			System.out.println("PRIMEIRA OPCAO");
			break;
		case variavel:
			System.out.println("SEGUNDA OPCAO");
			break;
		case 3:
			System.out.println("TERCEIRA OPCAO");
			break;
		default:
			System.out.println("default");
		}

	}
}
