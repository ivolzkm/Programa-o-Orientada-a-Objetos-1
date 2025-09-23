package loja;

import java.util.ArrayList;
import java.util.Scanner;

public class AplicacaoLoja {

	public static void main(String[] args) {
		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		Scanner leitura = new Scanner(System.in);
		String opcao;

		do {
			System.out.println("Produto de qual tipo?");
			System.out.println("a) Eletrônico");
			System.out.println("b) Alimento");
			System.out.println("c) Sair");
			opcao = leitura.nextLine();

			if (opcao.equalsIgnoreCase("a")) {
				String nomeEletronico;
				double precoEletronico;
				double impostoEletronico;

				System.out.println("Qual é o nome?");
				nomeEletronico = leitura.nextLine();
				System.out.println("Qual é o preço?");
				precoEletronico = leitura.nextDouble();
				System.out.println("Qual é o valor de imposto?");
				impostoEletronico = leitura.nextDouble();
				leitura.nextLine();

				listaDeProdutos.add(new Eletronico(nomeEletronico, precoEletronico, impostoEletronico));
				System.out.println("Produto eletrônico adicionado.");

			} else if (opcao.equalsIgnoreCase("b")) {
				String nomeAlimento;
				double precoAlimento;
				double descontoAlimento;

				System.out.println("Qual é o nome?");
				nomeAlimento = leitura.nextLine();
				System.out.println("Qual é o preço?");
				precoAlimento = leitura.nextDouble();
				System.out.println("Qual é o valor de desconto?");
				descontoAlimento = leitura.nextDouble();
				leitura.nextLine();
				listaDeProdutos.add(new Alimento(nomeAlimento, precoAlimento, descontoAlimento));
				System.out.println("Produto alimento adicionado.");
			}
		} while (!opcao.equalsIgnoreCase("c"));

		leitura.close();

		System.out.println("\n--- Lista de Produtos ---");

		for (Produto produto : listaDeProdutos) {
			System.out.println(produto);
		}
	}
}