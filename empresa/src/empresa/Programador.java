package empresa;

public class Programador extends Funcionario{
	private double bonusPorProjeto;
	public Programador(String nome, int matricula, double salarioBase) {
		super(nome, matricula, salarioBase);
	}

	@Override
	public double calcularSalarioTotal() {
		return getSalarioBase()+bonusPorProjeto;
	}

	public Programador(String nome, int matricula, double salarioBase, double bonusPorProjeto) {
		super(nome, matricula, salarioBase);
		this.bonusPorProjeto = bonusPorProjeto;
	}

	public double getBonusPorProjeto() {
		return bonusPorProjeto;
	}

	public void setBonusPorProjeto(double bonusPorProjeto) {
		this.bonusPorProjeto = bonusPorProjeto;
	}

	
}
