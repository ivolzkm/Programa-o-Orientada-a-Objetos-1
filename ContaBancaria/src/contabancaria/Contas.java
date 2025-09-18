package contabancaria;

public interface Contas {
	void sacar(double valor);
	void depositar(double valor);	
	double getSaldo();
}
