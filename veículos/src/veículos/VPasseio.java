package veículos;

public class VPasseio extends Veiculo{

	public VPasseio(int id, float combustivel) {
		super(id, combustivel);
	
	}

	@Override
	protected float getCapacidadeMaxima() {
		return 50;
	}

	@Override
	protected String getTipoVeiculo() {		
		return "Veículo de Passeio";
	}

}
