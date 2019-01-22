package br.com.drogaria.dao;

import java.lang.reflect.ParameterizedType;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.drogaria.util.HibernateUtil;

public class GenericDao<Entidade> {
	
	private Class<Entidade> classe;
	
	@SuppressWarnings("unchecked")
	public GenericDao(){
	
	this.classe = (Class<Entidade>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

	}
	
	 public void salvar(Entidade entidade) {
		 Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		 Transaction transacao = null;
		 
		 try {
			 transacao = sessao.beginTransaction();
			 sessao.save(entidade);
			 transacao.commit();
		 }
		 catch(RuntimeException e) {
			 if(transacao != null) {
				 transacao.rollback();
			 }
			 throw e;
		 }
		 finally {
			 if(sessao != null) {
				 sessao.close();
			 }
		 }
		 
	 }

}
