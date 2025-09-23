package batalhaDeMonstros;

import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Monstro monstro1 = null;
        Monstro monstro2 = null;

        // Lógica para criar o primeiro monstro
        do {
            System.out.println("Player 1: Selecione seu monstro: ");
            System.out.println("A) Monstro de Fogo");
            System.out.println("B) Monstro de Água");
            System.out.println("C) Monstro de Planta");
            System.out.print("Digite a opção desejada: ");
            String opcao = scan.nextLine();

            if (opcao.equalsIgnoreCase("a")) {
                // Preencha aqui a lógica para criar o monstro de fogo
            } else if (opcao.equalsIgnoreCase("b")) {
                // Preencha aqui a lógica para criar o monstro de água
            } else if (opcao.equalsIgnoreCase("c")) {
                // Preencha aqui a lógica para criar o monstro de planta
            } else {
                System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (monstro1 == null);

        System.out.println("\nVocê escolheu: Monstro de " + monstro1.getTipo());

        // Lógica para criar o segundo monstro
        do {
            System.out.println("\nPlayer 2: Selecione seu monstro: ");
            System.out.println("A) Monstro de Fogo");
            System.out.println("B) Monstro de Água");
            System.out.println("C) Monstro de Planta");
            System.out.print("Digite a opção desejada: ");
            String opcao = scan.nextLine();

            if (opcao.equalsIgnoreCase("a")) {
                // Preencha aqui a lógica para criar o monstro de fogo
            } else if (opcao.equalsIgnoreCase("b")) {
                // Preencha aqui a lógica para criar o monstro de água
            } else if (opcao.equalsIgnoreCase("c")) {
                // Preencha aqui a lógica para criar o monstro de planta
            } else {
                System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (monstro2 == null);

        System.out.println("\nVocê escolheu: Monstro de " + monstro2.getTipo());
        
        // Crie a Arena e inicie a batalha
        ArenaDeBatalha arena = new ArenaDeBatalha();
        arena.iniciarBatalha(monstro1, monstro2);
        
        scan.close();
    }

    // Método auxiliar para criar um monstro
    private static Monstro criarMonstro(Scanner scan, String tipo) {
        System.out.print("Digite o nome para o monstro de " + tipo + ": ");
        String nome = scan.nextLine();
        System.out.print("Digite os pontos de vida iniciais (ex: 100): ");
        int pontosDeVida = scan.nextInt();
        scan.nextLine(); // Consome a nova linha

        if (tipo.equals("Fogo")) {
            return new MonstroDeFogo(nome, pontosDeVida);
        } else if (tipo.equals("Água")) {
            return new MonstroDeAgua(nome, pontosDeVida);
        } else {
            return new MonstroDePlanta(nome, pontosDeVida);
        }
    }
}