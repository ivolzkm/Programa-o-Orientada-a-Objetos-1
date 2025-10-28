package livro;

public class Livro {
	private String nome;
	private String autor;
	private int numeroDePaginas;
	public Livro(String nome, String autor, int numeroDePaginas) {
		this.nome = nome;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	
}
