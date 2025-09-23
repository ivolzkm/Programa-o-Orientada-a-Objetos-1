package empresa;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		System.out.println("-----Secretária-----");
		Secretaria daniela = new Secretaria("Daniela", 000000001, 3000);
		daniela.atendeTelefone();
		double salario1 = daniela.calculaSalario();
		System.out.println(daniela.nome);
		System.out.println(daniela.cpf);
		System.out.println(salario1);
		System.out.println("----Gerente----");
		Gerente gustavo = new Gerente("Gustavo", 000000002, 6000, 15);
		gustavo.autentica("senha123");
		gustavo.supervisionaFunc();
		double salario2 = gustavo.calculaSalario();
		gustavo.calculaSalario();
		System.out.println(gustavo.nome + salario2 + gustavo.cpf);
		System.out.println("----Diretor----");
		Diretor ivo = new Diretor("Ivo", 000000003, 40000, 3);
		ivo.autentica("senha123");
		ivo.administraFilial();
		double salario3 = ivo.calculaSalario();
		
		System.out.println("O chefe chegou");
		System.out.println(ivo.nome+salario3+ivo.cpf);
		
	}

}
