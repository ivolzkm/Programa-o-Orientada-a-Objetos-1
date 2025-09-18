package contabancaria;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		ContaCorrente minhaConta = new ContaCorrente(100000);
		
		System.out.println("Bem-Vindo ao banco.");
		System.out.println("Seu saldo atual: "+ minhaConta.getSaldo());
		System.out.println("Qual é o valor de saque? ");
		double valor = leitura.nextDouble();
		minhaConta.sacar(valor);
		System.out.println("Seu novo saldo é : "+minhaConta.getSaldo());
		leitura.close();
		
		
	}

}
