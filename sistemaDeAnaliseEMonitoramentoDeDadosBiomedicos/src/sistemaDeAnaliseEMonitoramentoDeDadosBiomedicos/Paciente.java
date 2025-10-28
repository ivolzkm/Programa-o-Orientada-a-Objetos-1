package sistemaDeAnaliseEMonitoramentoDeDadosBiomedicos;

public class Paciente extends Pessoa{
	private String historicoMedico;
	private String datadeInternacao;
	
	
	public Paciente(String nome, String cpf, int idade, String historicoMedico, String datadeInternacao) {
		super(nome, cpf, idade);
		this.historicoMedico = historicoMedico;
		this.datadeInternacao = datadeInternacao;
	}
	public String getHistoricoMedico() {
		return historicoMedico;
	}


	public void setHistoricoMedico(String historicoMedico) {
		this.historicoMedico = historicoMedico;
	}


	public String getDatadeInternacao() {
		return datadeInternacao;
	}


	public void setDatadeInternacao(String datadeInternacao) {
		this.datadeInternacao = datadeInternacao;
	}
	public void exibirInformacoes() {
		System.out.println("----Informações do Paciente----");
		System.out.println("Nome do Paciente: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("CPF: "+getCpf());
		System.out.println("Histórico Médico: "+getHistoricoMedico());
		System.out.println("Data de Internação: "+getDatadeInternacao());
	}
		
}
