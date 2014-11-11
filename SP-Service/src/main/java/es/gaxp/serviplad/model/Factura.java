package es.gaxp.serviplad.model;

import java.util.Collection;
import java.util.List;

public class Factura {

	String descripcion;
	Cliente cliente;
	String idFactura;
	String obra;
	List<LineaFactura> lineasFactura;
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
	public List<LineaFactura> getLineasFactura() {
		return lineasFactura;
	}
	public void setLineasFactura(List<LineaFactura> lineasFactura) {
		this.lineasFactura = lineasFactura;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
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
			for (LineaFactura lf: lineasFactura) {
				precioAux += lf.getUnidades() * lf.getPrecioUnidad();
			}
		}
		baseImponible =  precioAux;
		IVA = 0.21f;
		precioTotal = baseImponible * (1+IVA);
	}
}
