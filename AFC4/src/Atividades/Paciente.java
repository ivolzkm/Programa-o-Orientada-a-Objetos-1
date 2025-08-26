package Atividades;

public class Paciente {

	private String nome;
	private String endereco;
	private int idade;
	private double altura;
	private double peso;
public Paciente(String nome, String endereco, int idade, double altura, double peso){
	this.nome= nome;
	this.endereco=endereco;
	this.idade=idade;
	this.altura=altura;
	this.peso=peso;		
}
public double calcularIMC() {
	//IMC= peso/altura²
	return this.peso/Math.pow(this.altura, 2);		
}
	public void imprimirDados() {
		System.out.println("Nome: "+nome);
		System.out.println("Endereço: "+endereco);
		System.out.println("Idade: "+idade);
		System.out.println("Altura: "+altura);
		System.out.println("Peso: "+peso);
		System.out.printf("IMC: %.2f\n", calcularIMC());
		//	Paciente paciente1 = new Paciente(nome, idade, endereco, altura, peso);

	}
}
