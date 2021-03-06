package org.tis.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String login;
	private String senha;

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
	        return false;
	    }
		
		Pessoa pessoa = (Pessoa) obj;
		
		if (pessoa.id != this.getId()) {
			return false;
		}
		
		return true;
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(id, nome, login, senha	);
    }
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPessoa(Pessoa pessoa) {
		
	}
	
}
