package nome;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Scanner leitura = new Scanner (System.in);
		System.out.println("Digite o nome completo do usuário:");
		String nome = leitura.nextLine();
		System.out.println("O nome digitado foi: "+nome);
		System.out.println("O número de caracteres do nome é:"+ nome.length());
		System.out.println("O índice da última letra é igual a: "+nome.indexOf(" ") );
		System.out.println("O nome em maiúxulo é: " + nome.toUpperCase());
		System.out.println("Teste"+ nome.substring(nome.indexOf(" ")));
			
		
	}

}
