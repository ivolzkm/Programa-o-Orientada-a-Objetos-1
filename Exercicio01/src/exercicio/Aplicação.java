package exercicio;

public class Aplicação {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Ivo Ricardo Lozekam Junior", 24, "Informática Biomédica", 2025001);
		System.out.println("Dados do aluno: "+ aluno1);
		carro carro1 = new carro("Mercedes", "SUV", 2025, 800000.00);
		System.out.println("Dados do carro: "+ carro1);
		Livro livro1 = new Livro("O Conde de Monte Cristo", "Alexandre Dumas", 1846, 59);
		System.out.println("Dados do livro: "+ livro1);
		
	}

}
