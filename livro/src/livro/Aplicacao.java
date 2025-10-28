package livro;

public class Aplicacao {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Como Fazer Amigos e Influenciar Pessoas", "Dale Carnegie", 200);
		System.out.println("Nome: "+livro1.getNome());
		System.out.println("Autor: "+livro1.getAutor());
		System.out.println("Número de páginas: "+livro1.getNumeroDePaginas());
		
	}

}
