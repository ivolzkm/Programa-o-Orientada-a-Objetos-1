package veiculo;


public class ProgramaPrincipal {

	/**
	 * O Polimorfismo de sobrecarga está sendo utilizado quando há os métodos acelerar
	 * com a mesma assinatura e com diferentes efeitos na mesma classe, em tempo de compilação.
	 *
	 *O Polimorfismo de sobrescrita está sendo utilizado quando os métodos acelerar das subclasses
	 * carro e bicicleta sobrescrevem o método da classe veículo, ocorrendo em tempo de execução.
	 * 
	 * Os dois tipos de polimorfismo estão sendo utlizados nessa situação.
	 */
	public static void main(String[] args) {
	 
		Carro car1 = new Carro("Mercedes", "SUV", 2026, 0, 4);
		Bicicleta bike1 = new Bicicleta("Marca Bike", "Modelo de dois aros.", 2020, 0, 2);
		//Teste de aceleração com os dois veículos parados
		car1.acelerar(30);
		bike1.acelerar(10);
		//Teste de aceleração com os dois veículos em movimento
		car1.velocidade=30;
		bike1.velocidade=30;
		car1.acelerar(100);
		bike1.acelerar(10);
		//Teste de aceleração excedendo o limite
		car1.acelerar(200);
		bike1.acelerar(100);
		
	}

}
