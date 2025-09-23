package biblioteca;

public class Livro {
	protected String titulo;
	protected String autor;
	protected int numeroDePaginas;
	protected int anoDeEdicao;
	public Livro(String titulo, String autor, int numeroDePaginas, int anoDeEdicao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
		this.anoDeEdicao = anoDeEdicao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	public int getAnoDeEdicao() {
		return anoDeEdicao;
	}
	public void setAnoDeEdicao(int anoDeEdicao) {
		this.anoDeEdicao = anoDeEdicao;
	}
	public void qualTitulo() {
	System.out.println(this.titulo);
	}
	public void qualAutor() {
		System.out.println(this.autor);
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas=" + numeroDePaginas
				+ ", anoDeEdicao=" + anoDeEdicao + "]";
	}
	
}
