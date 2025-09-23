package biblioteca;


public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {

    
    private boolean estaEmprestado;
    private String localizacao;

    
    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDeEdicao, String localizacao) {        
        super(titulo, autor, numeroDePaginas, anoDeEdicao);               
        this.localizacao = localizacao;
        this.estaEmprestado = false; 
    }

    @Override
    public boolean estaEmprestado() {
        return this.estaEmprestado;
    }


    @Override
    public void empresta() {
        if (this.estaEmprestado) {
            System.out.println("Operação não permitida: O livro '" + this.titulo + "' já está emprestado.");
        } else {
            this.estaEmprestado = true;
            System.out.println("O livro '" + this.titulo + "' foi emprestado com sucesso.");
        }
    }
    @Override
    public void devolve() {
        if (!this.estaEmprestado) {
            System.out.println("Operação não permitida: O livro '" + this.titulo + "' já está na biblioteca.");
        } else {
            this.estaEmprestado = false;
            System.out.println("O livro '" + this.titulo + "' foi devolvido com sucesso.");
        }
    }
    @Override
    public String localizacao() {
        return this.localizacao;
    }

    @Override
    public String descricaoSumaria() {
        return "Título: " + this.titulo + "\nAutor: " + this.autor;
    }
}