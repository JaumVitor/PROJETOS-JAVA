package banco_loiane;

public class ContaEspecial extends Conta{
	private double limite; 
	
    public ContaEspecial(int numero) {
		super(numero);
		this.limite = 500; 
	}

    @Override
	protected boolean sacarSaldo(double valor) {
    	if ((this.getSaldo() + limite) - valor >= 0) {
    		this.setSaldo(getSaldo() - valor);
    		extrato(valor, "saque"); //Passando os registros, para colocar no extrato
    		return true;
    	}
    	return false;  
    }
}
