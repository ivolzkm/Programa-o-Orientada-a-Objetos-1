package sistema;

public class Medico extends Funcionario implements Atendimento, Autenticavel{
	

	public Medico(String nome, String cpf, int idade, String matricula, double salario, String crm) {
		super(nome, cpf, idade, matricula, salario);
		this.crm = crm;
	}

	private String crm;

	@Override
	public double calcularSalario() {
		return getSalario()+ 2000.00;
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("----Informações do Médico(a) ----");
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("CPF: "+getCpf());
		System.out.println("Matrćula: "+getMatricula());
		System.out.println("Salário Base: "+getSalario());
		System.out.println("Salário com Ajuste: "+calcularSalario());
		System.out.println("CRM: "+this.crm);
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	@Override
	public void atenderPaciente() {
		System.out.println("O médico está em atendimento no momento.");
		//TODO: Ajustar lógica para mostrar qual paciente está sendo atendido
	}

	@Override
	public boolean autenticar(String senha) {
		if(senha.equals("senhamedico")) {
		return true;
	}else {
		return false;
	}	
}
}