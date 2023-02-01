
public class TestaStringBufferEBuilder {
	
	public static void main(String[] args) {
		
		//StringBuffer
//		StringBuffer sb = new StringBuffer("Caelum");
//		sb.append(" - ");
//		sb.append("Ensino e Inovacao");
//		System.out.println(sb.toString());
//		System.out.println(sb);
//		
//		StringBuffer sb2 = new StringBuffer(50);
//		System.out.println(sb2.toString());
//		
//		StringBuffer sb3 = new StringBuffer(sb);
//		sb3.append("e Alura e Casa do Codigo");
//		System.out.println(sb3);
		
		//StringBuilder
		StringBuilder sb = new StringBuilder("Caelum");
		sb.append(" - ");
		sb.append("Ensino e Inovacao");
//		System.out.println(sb.toString());
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder(50);
		System.out.println(sb2.toString());
		
		StringBuilder sb3 = new StringBuilder(sb);
		sb3.append("e Alura e Casa do Codigo");
		sb3.append('x');
		sb3.append(sb);
		sb3.append(new Carro());
		System.out.println(sb3);
		
		StringBuilder sb4 = new StringBuilder("Caelum - Inovacao");
		sb4.insert(9, "Ensino e ");
		System.out.println(sb4);
		sb4.delete(6, 15);
		System.out.println(sb4);
		
		String valor = sb4.toString();
		System.out.println(new StringBuffer("igor").reverse());
		
		StringBuilder sb5 = new StringBuilder("Caelum - Ensino e Inovacao");
		System.out.println(sb5.substring(6, 15));
		System.out.println(sb5.subSequence(6, 15));
		System.out.println(sb5);
	}
}
