package br.com.drogaria.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity(name = "funcionario")
public class Funcionario extends GenericDomain{
	
	@Column(length = 20, nullable = false)
	private String carteiraTrabalho;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Calendar dataAdmissao;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;
}
