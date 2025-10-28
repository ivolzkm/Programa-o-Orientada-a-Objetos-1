package sistemaDeAnaliseEMonitoramentoDeDadosBiomedicos;

public class MonitorCardiaco extends DispositivoBiomedico implements FonteDeDados{

	public MonitorCardiaco(int idDispositivo, String nomeDispositivo) {
		super(idDispositivo, nomeDispositivo);
	}

	@Override
	public String getTipoDados() {
		return "Sinais Cardíacos";
	}

	@Override
	public String coletarDados() {

		return "75 bpm";
	}


	public String gerarRelatorio() {
		return getTipoDados()+" : "+ coletarDados();
	}

	@Override
	public String gerarRelatorio(Paciente paciente) throws NumberFormatException {				    
		String dadosBrutos = this.coletarDados();
		int bpm = Integer.parseInt(dadosBrutos.replace(" bpm", ""));
		int idade = paciente.getIdade();		    		    
		int frequenciaMinimaIdeal;
		int frequenciaMaximaIdeal;
		int frequenciaMaxima;
		if (idade >= 20 && idade < 30) {
			frequenciaMinimaIdeal = 100;
			frequenciaMaximaIdeal = 170;
			frequenciaMaxima = 200;
		} else if (idade >= 30 && idade < 35) {
			frequenciaMinimaIdeal = 95;
			frequenciaMaximaIdeal = 162;
			frequenciaMaxima = 190;
		} else if (idade >= 35 && idade < 40) {
			frequenciaMinimaIdeal = 93;
			frequenciaMaximaIdeal = 157;
			frequenciaMaxima = 185;
		} else if (idade >= 40 && idade < 45) {
			frequenciaMinimaIdeal = 90;
			frequenciaMaximaIdeal = 153;
			frequenciaMaxima = 180;
		} else if (idade >= 45 && idade < 50) {
			frequenciaMinimaIdeal = 88;
			frequenciaMaximaIdeal = 149;
			frequenciaMaxima = 175;
		} else if (idade >= 50 && idade < 55) {
			frequenciaMinimaIdeal = 85;
			frequenciaMaximaIdeal = 145;
			frequenciaMaxima = 170;
		} else if (idade >= 55 && idade < 60) {
			frequenciaMinimaIdeal = 83;
			frequenciaMaximaIdeal = 140;
			frequenciaMaxima = 165;
		} else if (idade >= 60 && idade < 65) {
			frequenciaMinimaIdeal = 80;
			frequenciaMaximaIdeal = 136;
			frequenciaMaxima = 160;
		} else if (idade >= 65 && idade < 70) {
			frequenciaMinimaIdeal = 78;
			frequenciaMaximaIdeal = 132;
			frequenciaMaxima = 155;
		} else if (idade >= 70) { 
			frequenciaMinimaIdeal = 75;
			frequenciaMaximaIdeal = 128;
			frequenciaMaxima = 150;
		} else {
			return "Idade não suportada para o cálculo.";
		}

		if (bpm >= frequenciaMinimaIdeal && bpm <= frequenciaMaximaIdeal) {
			return "Batimentos cardíacos dentro do regular (faixa ideal)";
		} else if (bpm > frequenciaMaximaIdeal && bpm <= frequenciaMaxima) {
			return "Batimentos cardíacos acima da faixa ideal, mas dentro da frequência máxima";
		} else if (bpm > frequenciaMaxima) {
			return "ATENÇÃO! Batimentos cardíacos acima da frequência máxima";
		} else {
			return "Batimentos cardíacos abaixo da faixa ideal";
		}
	}
}