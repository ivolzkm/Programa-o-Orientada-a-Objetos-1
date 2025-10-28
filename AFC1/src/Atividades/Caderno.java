package Atividades;

public class Caderno {
	private double preco;
	private boolean capaDura;
	private String cor; 
	private int numeroDeFolhas;

public Caderno(double precoCaderno, boolean capa, String corCaderno, int folhas) {
	this.capaDura = capa;
	this.cor = corCaderno;
	this.numeroDeFolhas = folhas;
	this.preco = precoCaderno;
	
}
public Caderno() {
	
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public boolean isCapaDura() {
	return capaDura;
}
public void setCapaDura(boolean capaDura) {
	this.capaDura = capaDura;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public int getNumeroDeFolhas() {
	return numeroDeFolhas;
}
public void setNumeroDeFolhas(int numeroDeFolhas) {
	this.numeroDeFolhas = numeroDeFolhas;
}
}