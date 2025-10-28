package professores;

public class ProfessorHorista extends Professor {
	private int totalHoras;
	private double salarioHora;

	public ProfessorHorista(String nome, int matricula, int idade, double salario, int totalHoras, double salarioHora) {
		super(nome, matricula, idade, salario);
		this.totalHoras = totalHoras;
		this.salarioHora = salarioHora;
	}

	public int getTotalHoras() {
		return totalHoras;
	}

	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	@Override
	public void calculaSalario() {
		this.salario = this.salarioHora * this.totalHoras;
	}
}