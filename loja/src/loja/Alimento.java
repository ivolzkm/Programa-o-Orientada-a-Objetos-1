package loja;

public class Alimento extends Produto{
	private double desconto;

	public Alimento(String nome, double preço, double desconto) {
		super(nome, preço);
		this.desconto = desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	@Override
	public double calcularPrecoFinal() {
		return getPreço()-getDesconto();
	}
	

}
