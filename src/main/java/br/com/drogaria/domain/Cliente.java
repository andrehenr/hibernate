package br.com.drogaria.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity(name = "cliente")
public class Cliente extends GenericDomain{
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Calendar dataCadastro;
	
	
	@Column(nullable = false)
	private Boolean liberado;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Boolean getLiberado() {
		return liberado;
	}

	public void setLiberado(Boolean liberado) {
		this.liberado = liberado;
	}

}
