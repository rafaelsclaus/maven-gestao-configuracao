package br.com.caelum.financas.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.modelo.Conta;

@Stateless
public class ContaDao {

	@Inject //@PersistenceContext
	EntityManager manager;

	public void adiciona(Conta conta) {
		manager.joinTransaction();
		this.manager.persist(conta);
	}

	
}
