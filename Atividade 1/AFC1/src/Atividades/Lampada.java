package Atividades;

public class Lampada {
	private String estadoDaLampada;

	public Lampada() {
		this.estadoDaLampada = "Apagada";
	}
	public void acende(){
		this.estadoDaLampada = "Acesa";
	}
	public void apaga() {
		this.estadoDaLampada = "Apagada";
	}
	public void mostraEstado() {
		System.out.println("A lâmpada está "+ estadoDaLampada);
	}
	public String getEstadoDaLampada() {
		return estadoDaLampada;
	}
	public void setEstadoDaLampada(String estadoDaLampada) {
		this.estadoDaLampada = estadoDaLampada;
	}


}

