package casting;

interface Automatico{}
class Veiculo{}
class Moto extends Veiculo{}
class Carro extends Veiculo{}
class CarroAutomatico extends Carro implements Automatico{}

public class TestaCasting {
	public static void main(String[] args) {
		CarroAutomatico ca = new CarroAutomatico();
		Carro c2 = ca;
		
		boolean tipoAutomatico = c2 instanceof Automatico;
//		if(c2 instanceof Automatico) {
//			System.out.println("eh automatico");
//		} else if(!(c2 instanceof Automatico)) {
//			System.out.println("nao eh automatico");
//		}
		if(tipoAutomatico) {
			System.out.println("eh automatico");
		} else if(!tipoAutomatico) {
			System.out.println("nao eh automatico");
		}
		
		Automatico a = (Automatico) c2;
		
		Moto m2 = new Moto();
//		Automatico a2 = (Automatico) m2;
		
		/*Casting opicional*/
		String igor = (String) "igor";
		String nome = (String) igor;
		Object nome2 = (Object)igor;
		
		Veiculo v = new Carro();
//		Moto m = (Moto) v;
		
		Carro c = new Carro();
//		Moto m2 = (Moto) c;
		
		Object[] objetos = new Object[100];
		String s = "certificacao";
		objetos[0] = s;
		
		String recuperada = (String) objetos[0];
	}
}
