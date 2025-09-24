package veiculo;

public class Bicicleta extends Veiculo {
	private int aro;

	public void acelerar(int incremento) {
			if (velocidade > 0) {
				if (velocidade + incremento < 50) {
					velocidade += incremento;
					System.out.println("Velocidade atualizada: " + velocidade);
				} else {
					System.out.println("Esse valor excede o limite de velocidade.");
				}
			} else {
				System.out.println("É impossível acelerar com uma velocidade nula.");
			}
		}

	public Bicicleta(String marca, String modelo, int anoFabricacao, int velocidade, int aro) {
		super(marca, modelo, anoFabricacao, velocidade);
		this.setAro(aro);
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}
	
	
	
	
	
	
}
