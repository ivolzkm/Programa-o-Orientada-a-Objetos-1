package veículos;

public abstract class Veiculo implements IVeiculo{
	protected int id;
	protected float combustivel;
	public Veiculo(int id, float combustivel) {
		super();
		this.id = id;
		this.combustivel = combustivel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(float combustivel) {
		this.combustivel = combustivel;
	}
	protected abstract float getCapacidadeMaxima();
	protected abstract String getTipoVeiculo();
	
	public void dirigir() { 
		if (combustivel>0) {
		System.out.println("O "+getTipoVeiculo() +" está sendo dirgido.");
	} else {
		System.out.println("O "+getTipoVeiculo() + " está sem combustível.");
	}
	}
	public boolean reabastecer(float quantidade) {
		if ((quantidade>0)&&(quantidade+combustivel<=getCapacidadeMaxima())){
		combustivel+= quantidade;
		return true;
	} else {
		System.out.println("Por favor, informe uma quantidade válida para abastecer.");
		return false;
	}
	
	}
}