package Atividades;

import java.util.Scanner;



public class Aplicacao {
	
	public static void main (String[] args) {
		System.out.println("Digite um valor em decimal para a conversão: ");		
		Scanner leitor= new Scanner(System.in);
		int valorDecimal1 = leitor.nextInt();
		String resultadoBinario1 = Integer.toBinaryString(valorDecimal1);
		System.out.println("O resultado em binário é: "+resultadoBinario1);
		System.out.println("Digite um outro valor em decimal para a conversão: ");		
		int valorDecimal2 = leitor.nextInt();
		String resultadoBinario2 = Integer.toBinaryString(valorDecimal2);
		System.out.println("O resultado em binário é: "+resultadoBinario2);


	}

}
