package matriz3x3;

import java.util.Iterator;
import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		int[][] matriz3x3 = new int[3][3];
		Scanner leitura = new Scanner(System.in);

		for (int i = 0; i < matriz3x3.length; i++) {
			for (int j = 0; j < matriz3x3[i].length; j++) {
				System.out.println("Digite o valor para a " + (i + 1) + "ª linha e " + (j + 1) + "ª coluna:");
				matriz3x3[i][j] = leitura.nextInt();
			}
		}
		System.out.println("Matriz 3x3:");
		for (int i = 0; i < matriz3x3.length; i++) {
			for (int j = 0; j < matriz3x3.length; j++) {
				System.out.print(matriz3x3[i][j]+ " ");
			}
			System.out.println("");
		}

		int[] somaLinhas = new int[3];

		for (int i = 0; i < matriz3x3.length; i++) {
			int somaLinhaAtual = 0;

			for (int j = 0; j < matriz3x3[i].length; j++) {
				somaLinhaAtual += matriz3x3[i][j];
			}
			somaLinhas[i] = somaLinhaAtual;
		}

		System.out.println("\n--- Soma das Linhas ---");
		for (int i = 0; i < somaLinhas.length; i++) {
			System.out.println("Soma da linha " + (i + 1) + ": " + somaLinhas[i]);
		}

		leitura.close();
		int[] produtoColunas = new int[3];
		for (int j = 0; j < produtoColunas.length; j++) {
			int produtoColunaAtual = 1;
			for (int i = 0; i < matriz3x3.length; i++) {
				produtoColunaAtual = matriz3x3[i][j] * produtoColunaAtual;

			}
			produtoColunas[j] = produtoColunaAtual;
		}
		System.out.println("Produto das colunas:");
		for (int i = 0; i < produtoColunas.length; i++) {
			System.out.println(produtoColunas[i]+" ");
		}
		System.out.println("Diagonal Principal:");
		for (int i = 0; i <matriz3x3.length; i++) {
			System.out.println(matriz3x3[i][i]+" ");
		}
	}
}
