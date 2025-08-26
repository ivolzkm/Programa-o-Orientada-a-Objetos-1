package Atividades;

public class Caneta {
	private double preco;
	private int tamanhoEmCM;
	private String cor;
	private boolean canetaFina;

public Caneta(double precoCaneta, int centimetros, String corCaneta, boolean pontaCaneta) {
	this.preco = precoCaneta;
	this.tamanhoEmCM = centimetros;
	this.cor = corCaneta;
	this.canetaFina = pontaCaneta;
}
public Caneta() {
	
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public int getTamanhoEmCM() {
	return tamanhoEmCM;
}
public void setTamanhoEmCM(int tamanhoEmCM) {
	this.tamanhoEmCM = tamanhoEmCM;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public boolean isCanetaFina() {
	return canetaFina;
}
public void setCanetaFina(boolean canetaFina) {
	this.canetaFina = canetaFina;
}
}