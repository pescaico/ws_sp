package es.gaxp.serviplad.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LineaFacturaDTO {
	
	long id;
	String descripcion;
	float medida1;
	float medida2;
	int unidades;
	float precioUnidad;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getMedida1() {
		return medida1;
	}
	public void setMedida1(float medida1) {
		this.medida1 = medida1;
	}
	public float getMedida2() {
		return medida2;
	}
	public void setMedida2(float medida2) {
		this.medida2 = medida2;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public float getPrecioUnidad() {
		return precioUnidad;
	}
	public void setPrecioUnidad(float precioUnidad) {
		this.precioUnidad = precioUnidad;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	
}
