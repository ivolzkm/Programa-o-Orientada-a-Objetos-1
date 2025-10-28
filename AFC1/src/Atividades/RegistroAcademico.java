package Atividades;

public class RegistroAcademico {

	private String nomeAluno;
	private int numeroMatricula;
	private boolean eBolsista;
	
	public RegistroAcademico(String nome, int mat, boolean bolsista) {
		
		this.nomeAluno = nome;
		this.numeroMatricula = mat;
		this.eBolsista = bolsista;
				
	}
	
	public void mostraRegistro() {
		
		System.out.println("O nome do aluno é: "+ nomeAluno);
		System.out.println("A matrícula do aluno é:  "+ numeroMatricula);
		System.out.println(this.eBolsista ? "O aluno é bolsista" : "O aluno não é bolsita");
		
		
	}
	
	
}
