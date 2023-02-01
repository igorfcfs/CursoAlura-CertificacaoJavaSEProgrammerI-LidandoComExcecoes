
public class Carro {
	String modelo;
	int ano;
	
	Carro() {
		ano = 2014;
	}
	
	void reseta() {
		ano = 2014;
	}
	
	public String getDadosImpressao() {
		return modelo + "::" + ano;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
