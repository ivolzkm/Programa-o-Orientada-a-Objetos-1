package calculoDoIMC;

public class Paciente {
	private String nome;
	private int idade;
	private String endereco;
	private double altura;
	private double peso;
	public Paciente(String nome, int idade, String endereco, double altura, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.altura = altura;
		this.peso = peso;
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double IMC() {
		return peso/Math.pow(altura, 2);
	}

	public String imrpimirDados() {
		return " ---Paciente---\n"
				+ "Nome: " + this.nome + "\nIdade:" + this.idade + "\nEndereco: " + this.endereco + "\nAltura: " + this.altura
				+ "\nPeso: " + this.peso + "\nIMC: "+this.IMC();
	}
	

}
