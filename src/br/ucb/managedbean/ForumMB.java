package br.ucb.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;

import br.ucb.entidade.Forum;
import br.ucb.util.JPAUtil;

@ManagedBean
@RequestScoped
public class ForumMB {
	
	private Forum forum = new Forum();
	
	public void salvar(Forum forum){
		EntityManager manager = JPAUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(forum);
		manager.getTransaction().commit();
		manager.close();
	}
	public Forum getForum() {
		return forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}

}
