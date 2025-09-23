package empresa;

public class Gerente extends Funcionario{
private double adicionalGerencia;

	@Override
	public double calcularSalarioTotal() {
		return getSalarioBase()+adicionalGerencia;
	}

	public Gerente(String nome, int matricula, double salarioBase, double adicionalGerencia) {
		super(nome, matricula, salarioBase);
		this.adicionalGerencia = adicionalGerencia;
	}

	public double getAdicionalGerencia() {
		return adicionalGerencia;
	}

	public void setAdicionalGerencia(double adicionalGerencia) {
		this.adicionalGerencia = adicionalGerencia;
	}
	
	

}
