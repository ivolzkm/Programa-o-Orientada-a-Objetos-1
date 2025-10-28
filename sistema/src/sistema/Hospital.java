package sistema;

import java.util.Scanner;

public class Hospital {
	public static void main(String[] args) {
		Paciente paciente1 = new Paciente(null, null, 0, null, null);
		Scanner leitura = new Scanner(System.in);
		System.out.println("----Bem-vindo ao sistema do hospital----");
		System.out.println("Por favor, insira o nome do paciente: ");
		paciente1.setNome(leitura.nextLine());
		System.out.println("Insira o CPF do paciente: ");
		paciente1.setCpf(leitura.nextLine());
		System.out.println("Insira a idade do paciente: ");
		paciente1.setIdade(leitura.nextInt());
		leitura.nextLine();
		System.out.println("Insira o histórico médico: ");
		paciente1.setHistoricoMedico(leitura.nextLine());
		System.out.println("Insira a data de internação: ");
		paciente1.setDataDeInternacao(leitura.nextLine());
		paciente1.exibirInformacoes();
		Medico medico1 = new Medico(null, null, 0, null, 0, null);
		System.out.println("----Bem-vindo ao sistema dos médicos----");
		System.out.println("Insira a senha:");
		medico1.autenticar(leitura.nextLine());
		System.out.println("Por favor, insira o nome do médico: ");
		medico1.setNome(leitura.nextLine());
		System.out.println("Insira o CPF do médico: ");
		medico1.setCpf(leitura.nextLine());
		System.out.println("Insira a idade do médico: ");
		medico1.setIdade(leitura.nextInt());
		leitura.nextLine();
		System.out.println("Insira a matrícula: ");
		medico1.setMatricula(leitura.nextLine());
		System.out.println("Insira o salário: ");
		medico1.setSalario(leitura.nextDouble());
		leitura.nextLine();
		System.out.println("Insira o CRM: ");
		medico1.setCrm(leitura.nextLine());
		medico1.exibirInformacoes();
		Administrativo adm1 = new Administrativo(null, null, 0, null, 0);
		System.out.println("----Bem-vindo ao sistema do setor Administrativo ----");
		System.out.println("Insira senha:");
		adm1.autenticar(leitura.nextLine());
		System.out.println("Insira o nome do administrador: ");
		adm1.setNome(leitura.nextLine());
		System.out.println();
		adm1.setCpf(leitura.nextLine());
		System.out.println();
		adm1.setIdade(leitura.nextInt());
		leitura.nextLine();
		
		
		leitura.close();

	}

}
