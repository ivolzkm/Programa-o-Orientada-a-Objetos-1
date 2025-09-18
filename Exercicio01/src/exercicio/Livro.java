package exercicio;

public class Livro {
	private String titulo;
	private String autor;
	private int paginas;
	private int anoDePublicacao;
	
	public Livro() {
		
	}
	public Livro(String titulo, String autor, int paginas, int anoDePublicacao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.anoDePublicacao = anoDePublicacao;
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
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}
	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}
	@Override
	public String toString() {
		return "Livro "
				+ "titulo = " + titulo + ""
						+ ", autor=" + autor + ", paginas=" + paginas + ", anoDePublicacao="
				+ anoDePublicacao + "]";
	}
	

	
}
