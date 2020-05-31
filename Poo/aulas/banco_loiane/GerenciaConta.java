package banco_loiane;

public class GerenciaConta {
	private Conta[] vetor = new Conta[3];
	
	public void criarConta (int num, boolean especial) {
		Conta x = new Conta (num, especial);
		vetor[0] = x ;
	}
}
