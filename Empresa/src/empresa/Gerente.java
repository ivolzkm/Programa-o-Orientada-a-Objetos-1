package empresa;

public class Gerente extends Funcionario implements Autenticavel {
	
	private int numeroFuncGer;

	public Gerente(String nome, int cpf, double salario, int numeroFuncGer) {
		super(nome, cpf, salario);
		this.numeroFuncGer = numeroFuncGer;
	}
	
	public int getNumeroFuncGer() {
		return numeroFuncGer;
	}
	
	public void setNumeroFuncGer(int numeroFuncGer) {
		this.numeroFuncGer = numeroFuncGer;
	}
				
	@Override					
	public double calculaSalario() {
		return this.salario + (this.salario * 0.15);
	}

	
	public void supervisionaFunc() {
		System.out.println("O gerente está supervisionando os funcionários.");
	}
	
	@Override
	public boolean autentica(String senha) {
		if (senha.equals("senha123")) {
			return true;
		}
		return false;
	}
}