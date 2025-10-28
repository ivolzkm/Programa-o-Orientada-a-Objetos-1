package sistema;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		String meuNome = "Ivo Ricardo Lozekam Junior";
		String substring = meuNome.substring(4);
		System.out.println(substring);
		Scanner leitura= new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = leitura.nextLine();
		leitura.close();
		System.out.println("Palavra Digitada: "+palavra);
		
		
	
		
		
		}
		
	}

