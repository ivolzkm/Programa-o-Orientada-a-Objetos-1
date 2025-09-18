package conversor;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Scanner leitura = new Scanner (System.in);
		System.out.println("Digite o primeiro  número inteiro: ");
		int numero1 = leitura.nextInt();
		System.out.println("Digite o segundo número inteiro: ");
		int numero2 = leitura.nextInt();
		System.out.println("Os número digitados são: " + numero1 +" e "+ numero2);
		System.out.println(" O primeiro número inteiro digitado em binário é: " + Integer.toBinaryString(numero1));
		System.out.println(" O primeiro número inteiro digitado em binário é: " + Integer.toBinaryString(numero2));

		
	}

}
