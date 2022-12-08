package com.idat.BackendDAM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="AZ_PAQUETE")
public class Paquete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPaquete;
	private String estado;
	
	@OneToOne
	private Remitente remitentes;
	
	@OneToOne
	private Consignado consignados;
	
	public Integer getIdPaquete() {
		return idPaquete;
	}
	public void setIdPaquete(Integer idPaquete) {
		this.idPaquete = idPaquete;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
