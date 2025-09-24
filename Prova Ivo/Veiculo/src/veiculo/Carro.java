package veiculo;

public class Carro extends Veiculo {
	private int numPortas;

	public Carro(String marca, String modelo, int anoFabricacao, int velocidade, int numPortas) {
		super(marca, modelo, anoFabricacao, velocidade);
		this.numPortas = numPortas;
	}

	@Override
	public void acelerar(int incremento) {
		if (velocidade > 0) {
			if (velocidade + incremento < 220) {
				velocidade += incremento;
				System.out.println("Velocidade atualizada: " + velocidade);
			} else {
				System.out.println("Esse valor excede o limite de velocidade.");
			}
		} else {
			System.out.println("É impossível acelerar com uma velocidade nula.");
		}
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	
	
	

}
