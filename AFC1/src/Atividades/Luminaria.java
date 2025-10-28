package Atividades;



public class Luminaria {
	private double preco;
	private boolean bluetooth;
	private int tamanhoEmCM;
	private String cor;	

public Luminaria(double precoLuminaria, boolean luminariaBluetooth, int tamanhoLuminaria, String corLuminaria) {
	this.bluetooth = luminariaBluetooth;
	this.preco = precoLuminaria;
	this.tamanhoEmCM = tamanhoLuminaria;
	this.cor = corLuminaria;
}
public Luminaria() {
	
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public boolean isBluetooth() {
	return bluetooth;
}
public void setBluetooth(boolean bluetooth) {
	this.bluetooth = bluetooth;
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
}
