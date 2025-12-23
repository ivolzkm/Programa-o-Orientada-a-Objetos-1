package model;

import java.util.Date;
import java.util.List;

public class Pedido {
	private int IDpedido;
	private String matriculaSolicitante;
	private Date dataPedido;
	private String categoria;
	private String descricaoPedido;
	private String predio;
	private String sala;
	private String partrimonio;
	public int getIDpedido() {
		return IDpedido;
	}
	public void setIDpedido(int iDpedido) {
		IDpedido = iDpedido;
	}
	public String getMatriculaSolicitante() {
		return matriculaSolicitante;
	}
	public void setMatriculaSolicitante(String matriculaSolicitante) {
		this.matriculaSolicitante = matriculaSolicitante;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescricaoPedido() {
		return descricaoPedido;
	}
	public void setDescricaoPedido(String descricaoPedido) {
		this.descricaoPedido = descricaoPedido;
	}
	public String getPredio() {
		return predio;
	}
	public void setPredio(String predio) {
		this.predio = predio;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public String getPartrimonio() {
		return partrimonio;
	}
	public void setPartrimonio(String partrimonio) {
		this.partrimonio = partrimonio;
	}
	
	public List<String> validaCampos () {
		
		List<String> vazios = null;
		if (matriculaSolicitante==null|| matriculaSolicitante.trim().isEmpty()) {
			 
		}
		if (categoria==null||categoria.trim().isEmpty()) {
			vazios.add("categoria");
		}
		if (descricaoPedido==null||descricaoPedido.trim().isEmpty()) {
			vazios.add("Descrição do Pedido");
		}
		if (predio==null||predio.trim().isEmpty()) {
			vazios.add("Prédio");
		}
		if (sala==null||sala.trim().isEmpty()) {
			vazios.add("Sala");
		}
			
			//exceto IdPedido e dataPedido
		return vazios;
	}
	
	

	

}
