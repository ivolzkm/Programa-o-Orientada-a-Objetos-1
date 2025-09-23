package calculoDoIMC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramaPrincipal {

	public static void main(String[] args) throws IOException {
		Paciente pac1 =  new Paciente(null, 0,null, 0, 0);
		BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite o nome do paciente: ");
		pac1.setNome(leitura.readLine());
		System.out.println("Digite a idade do paciente: ");
		pac1.setIdade(Integer.parseInt(leitura.readLine()));
		System.out.println("Digite o endereço do paciente: ");
		pac1.setEndereco(leitura.readLine());
		System.out.println("Digite a altura do paciente: ");
		pac1.setAltura(Double.parseDouble(leitura.readLine()));
		System.out.println("Digite o peso do paciente: ");
		pac1.setPeso(Double.parseDouble(leitura.readLine()));
		pac1.IMC();
		System.out.println(pac1.imrpimirDados());
	}

}
