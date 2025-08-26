package Atividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Aplicacao {

	//Coletar dados, instanciar um objeto pacientes e exibir os resultados
	//Tem que usar IOException para usar BufferedReader
	public static void main(String[] args) throws IOException{
		
	//Classes empacotadoras para conversão de Strings
	BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in)); 
	System.out.println("Digite o nome do paciente: ");
	String nome = leitor.readLine(); 	
	System.out.println("Digite o endereço do paciente: ");
	String endereco = leitor.readLine();
	System.out.println("Digite a idade do paciente: ");
	String idadeStr = leitor.readLine();
	System.out.println("Digite a altura do paciente: ");
	String alturaStr = leitor.readLine();
	System.out.println("Digite o peso do paciente: ");
	String pesoStr = leitor.readLine();

	
	//Conversão dos tipos
	int idade = Integer.parseInt(idadeStr);
	double altura = Double.parseDouble(alturaStr);
	double peso = Double.parseDouble(pesoStr);
	
	//nome, endereco, idade, altura, peso
	Paciente paciente1 = new Paciente(nome, endereco, idade, altura, peso);
	paciente1.imprimirDados();
	
	
	}
	}    
