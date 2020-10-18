package com.desafiolecom.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_agendaservico")
public class AgendaServicoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_agendaservico")
	private Long id;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name="id_cliente", referencedColumnName = "id_cliente")
	private ClienteEntity cliente;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name="id_servico", referencedColumnName = "id_servico")
    private ServicoEntity servico;
   
    @Column(name = "totalservico")
    private BigDecimal totalServico;
    
    @Column(name = "datainicio")
    private Date dataInicio;
    
    @Column(name = "dataTermino")
    private Date dataTermino;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}
	
	public ServicoEntity getServico() {
		return servico;
	}

	public void setServico(ServicoEntity servico) {
		this.servico = servico;
	}
	
	public BigDecimal getTotalServico() {
		/*if(getCliente().getTipoCliente().equals("Ouro")) {
			totalServico = getServico().getValor().subtract((getServico().getValor().multiply(BigDecimal.valueOf(0.1))));
		}else if (getCliente().getTipoCliente().equals("Prata")){
			totalServico = getServico().getValor().subtract((getServico().getValor().multiply(BigDecimal.valueOf(0.05))));
		}
		return totalServico = getServico().getValor();*/
		return totalServico;
	}

	public void setTotalServico(BigDecimal totalServico) {
		this.totalServico = totalServico;
	}

	public Date getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}

}