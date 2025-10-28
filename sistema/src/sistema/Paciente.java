package sistema;
public class Paciente extends Pessoa{
	private String historicoMedico;
	private String dataDeInternacao;
	@Override
	public void exibirInformacoes() {
		System.out.println("----Dados do Paciente----");
		System.out.println("Nome: "+getNome());
		System.out.println("CPF: "+getCpf());
		System.out.println("Idade: "+getIdade());
		System.out.println("Histórico Médico: "+getHistoricoMedico());
		System.out.println("Data de internação: "+getDataDeInternacao());
	}
	public Paciente(String nome, String cpf, int idade, String historicoMedico, String dataDeInternacao) {
		super(nome, cpf, idade);
		this.historicoMedico = historicoMedico;
		this.dataDeInternacao = dataDeInternacao;
	}
	public String getHistoricoMedico() {
		return historicoMedico;
	}
	public void setHistoricoMedico(String historicoMedico) {
		this.historicoMedico = historicoMedico;
	}
	public String getDataDeInternacao() {
		return dataDeInternacao;
	}
	public void setDataDeInternacao(String dataDeInternacao) {
		this.dataDeInternacao = dataDeInternacao;
	}
}
