package atividade;

public class RegistroAcademico {
	private String nomeAluno;
	private int numeroMatricula;
	private boolean eBolsista;
	
	public RegistroAcademico(String nomeAluno, int numeroMatricula, boolean eBolsista) {
		super();
		this.nomeAluno = nomeAluno;
		this.numeroMatricula = numeroMatricula;
		this.eBolsista = eBolsista;
	}
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	public boolean iseBolsista() {
		return eBolsista;
	}
	
	public void seteBolsista(boolean eBolsista) {
		this.eBolsista = eBolsista;
	}
	
	public void calculaMensalidade(float mensalidade) {
		if (this.eBolsista) { // Correção: use apenas o nome da variável booleana
			float mensalidadeBolsista = mensalidade * 0.5f; // A observação pede um desconto de 50% [cite: 446]
			System.out.println("Aluno bolsista, desconto aplicado.");
			System.out.println("Mensalidade com desconto: R$" + mensalidadeBolsista);
		} else {
			System.out.println("Não há bolsas aplicáveis.");
			System.out.println("Mensalidade integral: R$" + mensalidade);
		}
	}
	
	public void mostraRegistro() {
		System.out.println("---Registro Acadêmico---");
		System.out.println("Aluno: " + nomeAluno);
		System.out.println("Matrícula: " + numeroMatricula);
		System.out.println("Status de Bolsa: " + (this.eBolsista ? "Aluno Bolsista." : "Aluno não bolsista."));

	}
}