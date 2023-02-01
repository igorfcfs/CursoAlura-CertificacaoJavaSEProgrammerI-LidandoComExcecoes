package financeiro;

//import modelo.Pessoa;
//import modelo.Endereco;
import modelo.*;
//import static modelo.Util.TAMANHO;
//import static modelo.Util.maior;
import static modelo.Util.*;

//import java.util.Date;
//import java.sql.Date;

//import Produto; //impossivel acessar uma classe do pacote default
import java.util.*;
import java.sql.*;

import br.com.caelum.certificacao.dao.*;
import br.com.caelum.certificacao.modelo.*;

public class Pedido {
	Quadrado quadrado;
	ProdutoDAO dao;
	
	/*modelo.*/Pessoa cliente;
	Endereco endereco;
//	Date dateDeCriacao;
//	Produto produto; //impossivel acessar uma classe do pacote default
	public /*modelo.*/Pessoa getCliente(){
		return cliente;
	}
	
	public void calculaTudo() {
		int t = Util.TAMANHO;
		Util.maior(3, 10);
	}
}
