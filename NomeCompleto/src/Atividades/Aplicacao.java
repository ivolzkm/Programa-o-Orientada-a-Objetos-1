package Atividades;
import java.util.Scanner;


public class Aplicacao {
	
	public static void main (String[] args) {

		System.out.println("Digite o seu nome: ");
		Scanner leitor= new Scanner (System.in);
		String nome = leitor.nextLine();
		System.out.println(nome);
		System.out.println(nome.length()-1);
		System.out.println(nome.toUpperCase());
		int espaco=nome.indexOf(' ');
		String sobrenome = nome.substring(espaco+1);		
		System.out.println("Teste "+sobrenome);
		
	}
	
	
}
