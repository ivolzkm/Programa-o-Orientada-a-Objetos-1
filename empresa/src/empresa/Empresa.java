package empresa;

public class Empresa {

	public static void main(String[] args) {
		Programador prog1 = new Programador("Ivo Ricardo", 25001, 5000, 1500); // Adicionei um valor para o bônus
	    Gerente ger1 = new Gerente("Fernando", 25002, 6000, 1000);
	    Funcionario[] arrayFunc = new Funcionario[2];

	    arrayFunc[0] = prog1;
	    arrayFunc[1] = ger1;

	    for (int i = 0; i < arrayFunc.length; i++) {
	        Funcionario f = arrayFunc[i];
	        
	        System.out.println("Nome: " + f.getNome());
	        System.out.println("Salário total: R$" + f.calcularSalarioTotal());
	        System.out.println("---");
	}

}
	}
