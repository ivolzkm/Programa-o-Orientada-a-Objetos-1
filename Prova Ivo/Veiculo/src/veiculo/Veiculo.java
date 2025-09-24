package veiculo;

public abstract class Veiculo {
	protected String marca;
	protected String modelo;
	protected int anoFabricacao;
	protected int velocidade;

	public abstract void acelerar(int incremento);

	public void parar() {
		if (velocidade > 0) {
			velocidade = 0;
			System.out.println("Veículo parou.");
		} else {
			System.out.println("O veículo já está parado.");
		}
	}

	public Veiculo(String marca, String modelo, int anoFabricacao, int velocidade) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.velocidade = velocidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getVelocidade() {
		return velocidade;
	}

}
