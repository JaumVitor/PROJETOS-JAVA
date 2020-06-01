package banco_loiane;

public class Conta {
    private int numero;
    private double saldo;
    
    //Contrutor da classe: 
    public Conta(int numero) {
    	//Cria uma conta com saldo zero
        this.numero = numero;
        this.saldo = 0;
    }
    
    public Conta(int numero, double saldo) {
    	//Cria uma conta com valor saldo inicial
        this.numero = numero;
        this.saldo = saldo; 
    }
    
    public void extrato () {
    	//Imprime extrato bancario
    }

    public boolean depositaSaldo(double saldo) { 
    	setSaldo(getSaldo() + saldo); 
    	return true; 
    }
    
    public boolean sacarSaldo(double saldo) {
    	if (this.saldo - saldo >= 0) {
    		this.saldo = getSaldo() - saldo;
    		return true;
    	}
    	return false; 
    }
    
    protected void setSaldo (double saldo) {
    	this.saldo = saldo; 
    }
    
    protected double getSaldo () {
    	return this.saldo; 
    }
    
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
	}
}
