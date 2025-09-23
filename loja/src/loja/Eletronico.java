package loja;

public class Eletronico extends Produto{
	private double imposto;



	public Eletronico(String nome, double preço, double imposto) {
		super(nome, preço);
		this.imposto = imposto;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	@Override
	public double calcularPrecoFinal() {
		return getPreço()+getImposto();
	}
	
	
}
