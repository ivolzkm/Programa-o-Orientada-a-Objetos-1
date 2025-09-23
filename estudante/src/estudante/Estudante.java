package estudante;

public class Estudante {
	private String nome;
	private String matricula;
	private double nota;
	public Estudante(String nome, String matricula, double nota) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String obterStatus() {
		if(nota<7){
			return "Reprovado.";
			
		} else {
			return "Aprovado.";
		}
	
	}
public static double obterMediaTurma(Estudante[] turma) {
	if (turma==null||turma.length==0) {
		return 0.0;
	}
	double somaDasNotas = 0.0;
	for (Estudante e : turma) {
		somaDasNotas += e.getNota();
	}
	return somaDasNotas / turma.length;
}
	
	
}
