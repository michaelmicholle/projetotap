package br.ucb.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table 
public class Assunto {
	@Id
	@GeneratedValue
	private long id;
	private Date dtacriacao;
	private String mensagem;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDtacriacao() {
		return dtacriacao;
	}
	public void setDtacriacao(Date dtacriacao) {
		this.dtacriacao = dtacriacao;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	

}
