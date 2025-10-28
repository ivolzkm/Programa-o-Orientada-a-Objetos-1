package veterinário;

public class Gato implements Animal{
	private String nome;
	private int idade;
	
	public Gato(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
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

	@Override
	public String fazerBarulho() {
		return "Miado de gato.";
	}
	public String cacarRatos() {
		return "Gato caçando ratos.";
	}

}
