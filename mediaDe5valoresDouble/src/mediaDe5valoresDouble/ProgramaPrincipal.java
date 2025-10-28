package mediaDe5valoresDouble;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		double soma = 0;
		double media = 0;
		
		double []valores;
		Scanner leitura = new Scanner(System.in);
		valores = new double[5];
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite um valor double para o "+ (i+1)+ "º endereço no array.");
			valores[i]=leitura.nextDouble();			
		}
		for (int i = 0; i < valores.length; i++) {
			soma += valores[i];
		}
		media = soma/valores.length;

		System.out.println("A média dos cinco valores double do array é igual : "+media);
		leitura.close();

	}

}
