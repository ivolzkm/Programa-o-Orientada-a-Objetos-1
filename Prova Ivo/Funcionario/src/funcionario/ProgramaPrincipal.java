package funcionario;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		System.out.println("-----Funcionário-----");
		System.out.println("Digite a matricula do funcionário: ");
		String matricula = leitura.nextLine();
		System.out.println("Digite o nome do funcionário: ");
		String nome = leitura.nextLine();
		System.out.println("Digite o salário do funcionário: ");
		double salario = leitura.nextDouble();
		leitura.nextLine();		
		Funcionario func1 = new Funcionario(matricula, nome, salario, true);
		System.out.println("Informe o percentual de aumento para o salário: ");
		double aumento = leitura.nextDouble();
		leitura.close();
		func1.aplicarAumento(aumento);
		System.out.println("------------------------------");
		func1.demite();
		
	}

}
