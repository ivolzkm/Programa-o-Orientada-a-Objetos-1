package sistema;

public class Enfermeiro extends Funcionario implements Atendimento{

	public Enfermeiro(String nome, String cpf, int idade, String matricula, double salario) {
		super(nome, cpf, idade, matricula, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return getSalario()+1500;
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("---- Informações do Enfermeiro(a)");
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("CPF: "+getCpf());
		System.out.println("Matrćula: "+getMatricula());
		System.out.println("Salário Base: "+getSalario());
		System.out.println("Salário com Ajuste: "+calcularSalario());
		
	}

	@Override
	public void atenderPaciente() {
		System.out.println("Enfermeiro está em atendimento no momento.");
		//TODO: Ajustar lógicar para mostrar qual paciente está sendo atendido

	}
	
	

}
