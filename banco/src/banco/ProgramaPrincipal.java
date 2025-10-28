package banco;

import java.io.IOException;
import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria(null, 0, false);
        
        System.out.println("Digite o nome do novo correntista");
        conta1.setNomeCorrentista(scan.nextLine());

        String especial;
        do {
            System.out.println("A conta será especial? (sim ou não)");
            especial = scan.nextLine().toLowerCase();
            
            if (especial.equals("sim")) {
                conta1.setContaEspecial(true);
            } else if (especial.equals("não")) {
                conta1.setContaEspecial(false);
            } else {
                System.out.println("Entrada inválida. Por favor, digite 'sim' ou 'não'.");
            }
        } while (!especial.equals("sim") && !especial.equals("não")); 
        
        scan.close();
        conta1.deposita(400);
        conta1.mostraDados();
        conta1.retira(200);
        conta1.mostraDados();
    }
}