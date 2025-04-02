/* CAMADA DAO - DATA ACESS OBJECT: USADA PARA O "CONTROLE" DA CLASSE ENTITY (ENTIDADE) ONDE SEUS DADOS
 * SAO ACESSADOS */
package br.com.cdb.bancodigital.dao;

import java.util.ArrayList;
import br.com.cdb.bancodigital.entity.Cliente;

public class ClienteDAO {

	//LISTA DE CLIENTES NA CAMADA DAO (CONTROLE DELES);
	ArrayList<Cliente> listaDeCliente = new ArrayList<>();
	
	//ADICIONAR O CLIENTE NA LISTA;
	public void addCliente(Cliente cliente) {
		
		//O TAMANHO DA LISTA SERA O ID DO CLIENTE; POSICAO/INDEX = 0 >>> ID = 1 (POSICAO 1);
		cliente.setId(listaDeCliente.size()); 
		//ADICAO DE CLIENTES A LISTA;
		listaDeCliente.add(cliente);
	}

	//BUSCAR O CLIENTE NA LISTA;
	public Cliente buscarCliente(int id) {
		for (Cliente c : listaDeCliente) {
			if (c.getId() == id) {
				return c;
			}
		}
		return null;
	}
}
