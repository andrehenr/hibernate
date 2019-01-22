package br.com.drogaria.dao;

import org.junit.Test;

import br.com.drogaria.domain.Estado;

public class EstadoDAOTest {
	
	@Test
	public void salvar() {
		Estado estado = new Estado();
		estado.setNome("São Paulo");
		estado.setSigla("SP");
		
		EstadoDao estadoDao = new EstadoDao();
		estadoDao.salvar(estado);
	}

}
