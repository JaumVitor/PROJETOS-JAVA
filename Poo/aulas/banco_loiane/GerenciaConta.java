package banco_loiane;

public class GerenciaConta {
	private Conta[] vetor = new Conta[3];
	private int cont=0;
	
	public void criarConta (int num) throws Exception {
		if (buscar (num) == null) {
			Conta x = new Conta (num);
			this.vetor[cont] = x ;
			this.cont++; 
		}else {
			throw new Exception ("Esta conta ja existe, escolha outro numero"); 
		}
	}
	
	public Conta buscar (int numeroConta) {
		for (int i=0; i<this.cont; i++) {
			if (this.vetor[i].getNumero() == numeroConta) {
				return vetor[i];
			}
		}
		return null; 
	}
}
