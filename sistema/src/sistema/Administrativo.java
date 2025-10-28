package sistema;

public class Administrativo extends Funcionario implements Autenticavel{

	public Administrativo(String nome, String cpf, int idade, String matricula, double salario) {
		super(nome, cpf, idade, matricula, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return getSalario();
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("----Informações do Administrativo----");
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("CPF: "+getCpf());
		System.out.println("Matrícula: "+getMatricula());
		System.out.println("Salário Base "+getSalario());
		
		
		
	}

	@Override
	public boolean autenticar(String senha) {
		if (senha.equals("senhaadm")) {
		return true;
	} else {
		return false;
	}
	
}
}
