package atividade;

public class Paciente {
	private String nome;
	private int idade;
	private String endereço;
	private float altura;
	private float peso;
	private float IMC;
	public Paciente(String nome, int idade, String endereço, float altura, float peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereço = endereço;
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
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public void calculaIMC() {
		IMC = (float) (peso/Math.pow(altura, 2));
	}
	public void imprimeDados() {
		System.out.println("---- Dados do Paciente ----");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Endereço: " + endereço);
		System.out.println("Altura: "+ altura);
		System.out.println("Peso: " + peso);
		System.out.println("IMC: "+ IMC);
	}
	
}
