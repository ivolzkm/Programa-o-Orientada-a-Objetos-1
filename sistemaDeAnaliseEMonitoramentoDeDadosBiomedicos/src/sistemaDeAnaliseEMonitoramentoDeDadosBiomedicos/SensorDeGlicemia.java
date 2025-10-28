package sistemaDeAnaliseEMonitoramentoDeDadosBiomedicos;

public class SensorDeGlicemia extends DispositivoBiomedico{

	public SensorDeGlicemia(int idDispositivo, String nomeDispositivo) {
		super(idDispositivo, nomeDispositivo);
	}

	@Override
	public String getTipoDados() {
		
		return "Níveis Glicêmicos";
	}

	@Override
	public String coletarDados() {
		
		return null;
	}

	@Override
	public String gerarRelatorio(Paciente paciente) {
		
		return null;
	}

}
