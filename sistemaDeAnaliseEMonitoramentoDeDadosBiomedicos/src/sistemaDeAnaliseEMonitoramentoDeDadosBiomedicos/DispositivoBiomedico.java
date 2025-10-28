package sistemaDeAnaliseEMonitoramentoDeDadosBiomedicos;

public abstract class DispositivoBiomedico implements FonteDeDados{
	private int idDispositivo;
	private String nomeDispositivo;
	public DispositivoBiomedico(int idDispositivo, String nomeDispositivo) {
		this.idDispositivo = idDispositivo;
		this.nomeDispositivo = nomeDispositivo;
	}
	public abstract String gerarRelatorio(Paciente paciente);
	public int getIdDispositivo() {
		return idDispositivo;
	}
	public void setIdDispositivo(int idDispositivo) {
		this.idDispositivo = idDispositivo;
	}
	public String getNomeDispositivo() {
		return nomeDispositivo;
	}
	public void setNomeDispositivo(String nomeDispositivo) {
		this.nomeDispositivo = nomeDispositivo;
	}
	
}
