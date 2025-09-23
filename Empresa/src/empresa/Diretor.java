package empresa;

public class Diretor extends Funcionario implements Autenticavel {

	private int numeroFiliaisAdm;

	public Diretor(String nome, int cpf, double salario, int numeroFiliaisAdm) {
		super(nome, cpf, salario);
		this.numeroFiliaisAdm = numeroFiliaisAdm;
	}
	
	@Override
	public double calculaSalario() {
		
		return this.salario + (this.salario * 0.25);
	}
	
	public void administraFilial() {
		System.out.println("O diretor está administrando a filial.");
	}

	@Override
	public boolean autentica(String senha) {
		if (senha.equals("senha123")) {
			return true;
		}
		return false;
	}

	public int getNumeroFiliaisAdm() {
		return numeroFiliaisAdm;
	}

	public void setNumeroFiliaisAdm(int numeroFiliaisAdm) {
		this.numeroFiliaisAdm = numeroFiliaisAdm;
	}
}