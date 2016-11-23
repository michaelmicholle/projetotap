package br.ucb.managedbean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.ucb.entidade.Pessoa;
import br.ucb.util.JPAUtil;

@ManagedBean
@RequestScoped
public class PessoaMB {

	private Pessoa pessoa= new Pessoa();
	private List<Pessoa> pessoas=null;
	
	
	public void salvar(Pessoa pessoa){
		EntityManager manager = JPAUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(pessoa);
		manager.getTransaction().commit();
		manager.close();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public List<Pessoa> getPessoas() {
		if(this.pessoas == null){
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("select e from Pessoa e", Pessoa.class);
		this.pessoas = query.getResultList();
		}
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	
	
}
