package contabancaria;

public class ContaCorrente implements Contas{
	private double saldo;		
	public ContaCorrente(double saldo) {
		super();
		this.saldo = saldo;
	}
	@Override
	public void sacar(double valor) {
		if (valor > 0 && valor <= this.saldo){
			this.saldo-=valor;
			System.out.println("Saque de R$"+ valor +" realizado com sucesso.");
				} else {
					System.out.println("Operação Inválida.");
				}		
	}
	@Override
	public void depositar(double valor) {
		if (valor>0) {
			this.saldo+=valor;
			System.out.println("Depósito de R$"+ valor + "realizado com sucesso.");
		}					
	}
	@Override
	public double getSaldo() {
		
		return this.saldo;
	}
}
