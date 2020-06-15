package banco_loiane;

public class ContaPoupanca extends Conta{
	private int diaRendimento;
	
	public ContaPoupanca(int numero) {
		super(numero);
		this.setSaldo(0);
	}
	
	public void atualizarSaldo(float taxaRendimento) {
		//Atualizando saldo
	}
}
