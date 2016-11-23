package br.ucb.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import br.ucb.entidade.Assunto;
import br.ucb.util.JPAUtil;

@ManagedBean
@RequestScoped
public class AssuntoMB {
	
	private Assunto assunto =new Assunto();
	
	public void salvar(Assunto assunto){
		EntityManager manager = JPAUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(assunto);
		manager.getTransaction().commit();
		manager.close();
		
	}
	public Assunto getAssunto() {
		return assunto;
	}

	public void setAssunto(Assunto assunto) {
		this.assunto = assunto;
	}
	

}
