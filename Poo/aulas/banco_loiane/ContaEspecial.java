package banco_loiane;

public class ContaEspecial extends Conta{
	private double limite; 
	
    public ContaEspecial(int numero) {
		super(numero);
	}

    @Override
	protected boolean sacarSaldo(double saldo) {
    	if ((this.getSaldo() + limite) - saldo >= 0) {
    		this.setSaldo(getSaldo() - saldo);
    		extrato(saldo, "saque"); //Passando os registros, para colocar no extrato
    		return true;
    	}
    	return false;  
    }
}
