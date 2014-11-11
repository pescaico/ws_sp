package es.gaxp.serviplad.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FacturaDTO {

	long id;
	String descripcion;
	PersonaDTO cliente;
	PersonaDTO contacto;
	String idFactura;
	String obra;
	List<LineaFacturaDTO> lineasFactura;
	float precioTotal;
	float IVA;
	float baseImponible;

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}
	public String getObra() {
		return obra;
	}
	public void setObra(String obra) {
		this.obra = obra;
	}
	public List<LineaFacturaDTO> getLineasFactura() {
		return lineasFactura;
	}
	public void setLineasFactura(List<LineaFacturaDTO> lineasFactura) {
		this.lineasFactura = lineasFactura;
	}
	public PersonaDTO getCliente() {
		return cliente;
	}
	public void setCliente(PersonaDTO cliente) {
		this.cliente = cliente;
	}
	public float getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}
	public float getIVA() {
		return IVA;
	}
	public void setIVA(float iVA) {
		IVA = iVA;
	}
	public float getBaseImponible() {
		return baseImponible;
	}
	public void setBaseImponible(float baseImponible) {
		this.baseImponible = baseImponible;
	}
	
	public void setPrecio() {
		float precioAux = 0.0f;
		if(lineasFactura != null) {
			for (LineaFacturaDTO lf: lineasFactura) {
				precioAux += lf.getUnidades() * lf.getPrecioUnidad();
			}
		}
		baseImponible =  precioAux;
		IVA = 0.21f;
		precioTotal = baseImponible * (1+IVA);
	}
	public PersonaDTO getContacto() {
		return contacto;
	}
	public void setContacto(PersonaDTO contacto) {
		this.contacto = contacto;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	
}
