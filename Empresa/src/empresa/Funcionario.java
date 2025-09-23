package empresa;

public abstract class Funcionario {

	protected String nome;

	protected int cpf;

	protected double salario;

	public Funcionario(String nome, int cpf, double salario) {
	    this.nome = nome;
	    this.cpf = cpf;
	    this.salario = salario;
	}

	public Funcionario() {
		
	}

	public String getNome() {

		return nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public int getCpf() {

		return cpf;

	}

	public void setCpf(int cpf) {

		this.cpf = cpf;

	}

	public double getSalario() {

		return salario;

	}

	public void setSalario(double salario) {

		this.salario = salario;

	}

	public double calculaSalario() {

		return this.salario;

	}

}