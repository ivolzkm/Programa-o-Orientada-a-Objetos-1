package empresa;

public class Secretaria extends Funcionario {

	public Secretaria(String nome, int cpf, double salario) {
		super(nome, cpf, salario);

	}

	public void atendeTelefone() {
		System.out.println("A funcionária está atendendo o telefone.");
	}
	public double calculaSalario() {
		return this.salario  +  this.salario*0.1;
	}

}
