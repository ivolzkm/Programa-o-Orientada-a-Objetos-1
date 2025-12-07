package model;

import java.util.ArrayList;
import java.util.List;

public class Cotacao {
	private int dia = 0;
	private String moeda;
	private double cotacao;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getMoeda() {
		return moeda;
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}

	public double getCotacao() {
		return cotacao;
	}

	public void setCotacao(double cotacao) {
		this.cotacao = cotacao;
	}

	public List<String> validarCampos(String diaTexto, String moedaTexto){
		List<String> erros = new ArrayList<>();
		if (diaTexto.isEmpty()) {
			erros.add("Dia");
		}
		if (moedaTexto.isEmpty()) {
			erros.add("Moeda");
		}
		return erros;		
	}
}
