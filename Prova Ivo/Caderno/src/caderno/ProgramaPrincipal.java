package caderno;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {


		Scanner leitura = new Scanner(System.in);
		System.out.println("-----Caderno-----");
		System.out.println("Digite o ID:");
		int id = leitura.nextInt();
		leitura.nextLine();	
		System.out.println("Digite o nome do dono: ");
		String nomeDono = leitura.nextLine();
		System.out.println("Digite o número de folhas: ");
		int numFolhas = leitura.nextInt();
		leitura.nextLine();
		System.out.println("Digite o preço: ");
		float preco = leitura.nextFloat();
		Caderno cad1 = new Caderno(id, nomeDono, numFolhas, preco);
		System.out.println(cad1.toString());
		leitura.close();
	}

}
