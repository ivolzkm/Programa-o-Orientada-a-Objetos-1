package exercicio;

public class Aluno {
	private String nome;
	private int idade;
	private String curso;
	private int matricula;

	public Aluno() {

	}

	public Aluno(String nome, int idade, String curso, int matricula) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", curso=" + curso + ", matricula=" + matricula + "]";
	}

	
}
