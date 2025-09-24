package funcionario;

public class Funcionario {
	private String matricula;
	private String nomeFuncionario;
	private double salario;
	private boolean ativo;

	public void aplicarAumento(double percentualDeAumento){
		if (ativo=true) {
		salario +=salario*percentualDeAumento/100;
		System.out.println("Salário atualizado: "+salario);
		} else {
			System.out.println("O funcionário foi demitido.");
		}
	}
	public void demite() {
		boolean ativo = false;
		System.out.println("O funcionário foi demitido.");
	}

	public Funcionario(String matricula, String nomeFuncionario, double salario, boolean ativo) {
		super();
		this.matricula = matricula;
		this.nomeFuncionario = nomeFuncionario;
		this.salario = salario;
		this.ativo = ativo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
	
}
