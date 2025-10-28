package banco;


public class ContaBancaria {
	private String nomeCorrentista;
	private double saldo;
	private boolean contaEspecial;
	public ContaBancaria(String nomeCorrentista, float saldo, boolean contaEspecial) {
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
		this.contaEspecial = contaEspecial;
	}
	public String getNomeCorrentista() {
		return nomeCorrentista;
	}
	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isContaEspecial() {
		return contaEspecial;
	}
	public void setContaEspecial(boolean contaEspecial) {
		this.contaEspecial = contaEspecial;
	}
	public void deposita(double valor){
		if(valor>0) {
	saldo+=valor;
	} else {
		System.out.println("Não foi possível concluir a operação!!!");
	}}
	public void retira(double valor) {
		if(valor>0&&saldo>=valor) {
			saldo-=valor;
		} else {
			System.out.println("Não foi possível concluir a operação!!!");
		}
	}
	public void mostraDados() {
		 System.out.println("Nome "+nomeCorrentista);
		 System.out.println("Saldo "+saldo);
		 System.out.println("Conta especial: "+contaEspecial);
	}
	
}
