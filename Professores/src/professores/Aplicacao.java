package professores;

public class Aplicacao {

	public static void main(String[] args) {
		ProfessorDE professor1 = new ProfessorDE("Luciano", 25001, 39, 20000.0);
		
		System.out.println("--- Dados do Professor de Dedicação Exclusiva ---");
		System.out.println("Salário inicial: R$" + professor1.getSalario());
		
		professor1.calculaSalario(); 
		
		System.out.println("Salário após cálculo: R$" + professor1.getSalario());
		
		System.out.println("\n-------------------------------------------------");
		
		ProfessorHorista professor2 = new ProfessorHorista("Ivo", 25002, 24, 0.0, 120, 30.0);
		
		System.out.println("--- Dados do Professor Horista ---");
		System.out.println("Salário por hora: R$" + professor2.getSalarioHora());
		System.out.println("Total de horas: " + professor2.getTotalHoras());

		// O cálculo do salário já está armazenado no atributo da classe
		professor2.calculaSalario();
		
		// Acessando e imprimindo o salário calculado
		System.out.println("Salário total: R$" + professor2.getSalario());
	}
}