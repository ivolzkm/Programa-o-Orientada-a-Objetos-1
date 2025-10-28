package atividade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		try {
			BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Digite o nome do paciente: ");
			String nome = leitura.readLine();
			System.out.println("Digite a idade do paciente: ");
			int idade = Integer.parseInt(leitura.readLine());
			System.out.println("Digite o endereço do paciente: ");
			String endereço = leitura.readLine();
			System.out.println("Digite a a altura do paciente: ");
			float altura = Float.parseFloat(leitura.readLine());
			System.out.println("Digite o peso do paciente: ");
			float peso = Float.parseFloat(leitura.readLine());
			leitura.close();
			Paciente paciente1 = new Paciente(nome, idade, endereço, altura, peso);
			paciente1.calculaIMC();
			paciente1.imprimeDados();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
