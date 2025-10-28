package veículos;

import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		VPasseio vpasseio = new VPasseio(202501, 0);
		VSUV vsuv = new VSUV(202502, 0);
		vpasseio.dirigir();
		vsuv.dirigir();

		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite a quantidade de combustível para reabastecer o " + vpasseio.getTipoVeiculo());
		vpasseio.reabastecer(leitura.nextFloat());
		System.out.println("Digite a quantidade de combustível para reabastecer o " + vsuv.getTipoVeiculo());
		vsuv.reabastecer(leitura.nextFloat());
		leitura.close();

		vpasseio.dirigir();
		vsuv.dirigir();

	}

}
