package veículos;

public class VSUV extends Veiculo{

	public VSUV(int id, float combustivel) {
		super(id, combustivel);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected float getCapacidadeMaxima() {
		// TODO Auto-generated method stub
		return 90;
	}

	@Override
	protected String getTipoVeiculo() {
		// TODO Auto-generated method stub
		return "Veículo SUV";
	}

}
