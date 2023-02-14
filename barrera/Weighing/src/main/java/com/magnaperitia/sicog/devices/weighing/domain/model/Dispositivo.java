package com.magnaperitia.sicog.devices.weighing.domain.model;

import javax.persistence.*;

@Entity
@Table(name="DISPOSITIVOS",
	uniqueConstraints={
			@UniqueConstraint(name="dispositivos_codigo_ukey", columnNames={"codigo"})
	}
)
public class Dispositivo extends Identifiable {
	
	@Column(length=30, nullable = false)
	private String codigo;
	
	@Column(length=100, nullable = false)
	private String descripcion;
	
	@Column(length=50)
	private String ubicacion;
	
	private String categoria;
	
	private String servicio;
	
	private String protocolo;
	
	private String formato;
	
	@Column(length=100)
	private String host;
	
	@Column(length=7)
	private Integer puerto;
	
	@Column(length=150)
	private String endpoint;
	
	@Column(length=7)
	private Integer segundosEspera;
	
	@Column(name="institucion_codigo")
	private String institucionCodigo;
	
	private String observaciones;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPuerto() {
		return puerto;
	}

	public void setPuerto(Integer puerto) {
		this.puerto = puerto;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public Integer getSegundosEspera() {
		return segundosEspera;
	}

	public void setSegundosEspera(Integer segundosEspera) {
		this.segundosEspera = segundosEspera;
	}

	public String getInstitucionCodigo() {
		return institucionCodigo;
	}

	public void setInstitucionCodigo(String institucionCodigo) {
		this.institucionCodigo = institucionCodigo;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
}
