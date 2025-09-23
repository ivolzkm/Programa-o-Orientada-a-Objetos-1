package estudante;

public class Main {
	public static void main(String [] args) {
	Estudante estudante1 = new Estudante("Ivo Ricardo", "25001", 10);
	Estudante estudante2 = new Estudante("Ricardo Souza", "52001", 8);
	Estudante estudante3 = new Estudante ("Pedro", "15002", 6);
	System.out.println(estudante1.obterStatus());
	System.out.println(estudante2.obterStatus());
	System.out.println(estudante3.obterStatus());
	Estudante[]  turma = new Estudante[3];
	turma[0]=estudante1;
	turma[1]=estudante2;
	turma[2]=estudante3;
	System.out.println(Estudante.obterMediaTurma(turma));
	}
	}

