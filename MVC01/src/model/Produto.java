package model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	public int codigoDoProduto=0;
	public int quantidade=0;
	public double precoDoProduto;

	public int getCodigoDoProduto() {
		return codigoDoProduto;
	}

	public void setCodigoDoProduto(int codigoDoProduto) {
		this.codigoDoProduto = codigoDoProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoDoProduto() {
		return precoDoProduto;
	}

	public void setPrecoDoProduto(double precoDoProduto) {
		this.precoDoProduto = precoDoProduto;
	}

	public List<String> validaCampos(String codigoDoProdutoTexto, String precoDoProdutoTexto){
		List<String> erros = new ArrayList<>();
		if(codigoDoProdutoTexto.isEmpty()) {
			erros.add("Código do Produto");
			
		} 
		if (precoDoProdutoTexto.isEmpty()) {
			erros.add("Preço do Produto");
		}
		return erros;
	}


}
