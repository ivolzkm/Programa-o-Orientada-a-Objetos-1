package biblioteca;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// Instancia o objeto LivroDeBiblioteca
		LivroDeBiblioteca livro1 = new LivroDeBiblioteca("O Conde de Monte Cristo", "Alexandre Dumas", 500, 2025, "Estante A");
		
		System.out.println("--- Teste do Livro ---");

		// 1. Mostra a descrição sumária e a localização do livro
		System.out.println(livro1.descricaoSumaria());
		System.out.println("Localização: " + livro1.localizacao());
		System.out.println("O livro está emprestado? " + livro1.estaEmprestado());

		// 2. Empresta o livro
		System.out.println("\nEmprestando o livro...");
		livro1.empresta();
		System.out.println("O livro foi emprestado com sucesso? " + livro1.estaEmprestado());
		
		// 3. Tenta emprestar o livro novamente
		System.out.println("\nTentando emprestar o livro novamente...");
		livro1.empresta();

		// 4. Devolve o livro
		System.out.println("\nDevolvendo o livro...");
		livro1.devolve();
		System.out.println("O livro foi devolvido com sucesso? " + livro1.estaEmprestado());

		// 5. Tenta devolver o livro novamente
		System.out.println("\nTentando devolver o livro novamente...");
		livro1.devolve();
	}
}