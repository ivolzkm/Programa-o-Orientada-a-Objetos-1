package Atividades;

public class ContaBancaria {

	private String nomeCorretinsta;
	private float saldo;
	private boolean contaEspecial; 
	public ContaBancaria(String nome, float deposito, boolean eEspecial) {
		super();
		this.nomeCorretinsta = nome;
		this.saldo = deposito;
		this.contaEspecial= eEspecial;
		
	}
	
	public void deposita(float valor) {
		this.saldo += valor;
	}
	public void retira(float valor) {
		
		this.saldo -= valor;
	}
	public void mostraDados() {
		System.out.println("Nome Correnista: "+this.nomeCorretinsta);
		System.out.println("Saldo: "+this.saldo);
		System.out.println("Conta especial: "+this.contaEspecial);
		
	}

	public String getNomeCorretinsta() {
		return nomeCorretinsta;
	}

	public void setNomeCorretinsta(String nomeCorretinsta) {
		this.nomeCorretinsta = nomeCorretinsta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isContaEspecial() {
		return contaEspecial;
	}

	public void setContaEspecial(boolean contaEspecial) {
		this.contaEspecial = contaEspecial;
	}
	
	
	
}
