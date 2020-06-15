package banco_loiane;

import java.util.Calendar;

public class ContaPoupanca extends Conta{
	private int diaRendimento;
	
	public ContaPoupanca(int numero) {
		super(numero);
		this.setSaldo(0);
		this.diaRendimento = 15;  
	}
	
	public void atualizarSaldo(double taxaRendimento) {
		Calendar today = Calendar.getInstance(); 
		
		if (diaRendimento == today.get(Calendar.DAY_OF_MONTH)) { //Se o dia de rendimento for igual o dia atual
			this.setSaldo(getSaldo() + this.getSaldo() * taxaRendimento);
			this.extrato(this.getSaldo() * taxaRendimento, "rendimento");
			System.out.println("\t>Atualizando saldo da conta poupanca!");
		}else {
			System.err.println("Nao eh dia de rendimento!");
		}
	}
}
