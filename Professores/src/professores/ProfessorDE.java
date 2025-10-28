package professores;

public class ProfessorDE extends Professor {

	public ProfessorDE(String nome, int matricula, int idade, double salario) {
		super(nome, matricula, idade, salario);

	}

	@Override
	public void calculaSalario() {
		salario += salario; 
		
	}

}
