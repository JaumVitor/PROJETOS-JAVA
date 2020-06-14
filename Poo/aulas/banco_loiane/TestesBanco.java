package banco_loiane;
/* Regras da empresa, utilizar a conta: 
 * 1- Criar conta usando metodo criarConta; 
 * 2- Para poder ter acesso a conta, precisa encontra-la (Usando metodo de busca);
 * 3- Quando a conta for encontrada, ja estará disponivel para fazer movimentacoes */ 

//Não deixar criar duas ou mais contas com o mesmo numero
//Criar testes

public class TestesBanco {
    public static void main(String[] args) {
    	GerenciaConta gerenciador = new GerenciaConta(); //<> OBJETO ADM DE TODAS AS CONTAS
    	criarConta (2, gerenciador); //Criando conta 
    	criarConta (2, gerenciador); //Não cria outra conta com mesmo numero
    	
    	//Iniciando as contas e fazendo movimentacoes:
    	Conta c1 = buscarConta(1, gerenciador);
    	if (c1 != null) {
    		realizarDeposito (c1, 500);
    		extrato (c1); 
    	}else {
    		System.err.println("<>Esta conta não existe, para fazer movimentacao!");
    	}
    	
    	Conta c2 = buscarConta(2, gerenciador);
    	if (c2 != null) {
    		realizarSaque(c2, 500);
    		extrato (c2); 
    	}else {
    		System.err.println("<>Esta conta não existe, para fazer movimentacao!");
    	}
    }
    
    public static void criarConta (int numConta, GerenciaConta gerenciador) {
    	try {
			gerenciador.criarConta(numConta);
			System.out.println("Criando conta");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
    }
    
    public static Conta buscarConta (int numeroConta, GerenciaConta gerenciador) {
		Conta conta = gerenciador.buscar(numeroConta);
		if (conta != null) {
			return conta; //Retorna caso a conta seja criada
		}
		return null; //Se a conta não for criada
    }
    
    public static void realizarSaque (Conta conta, double valor) {
    	if (conta.sacarSaldo(valor)) {
    		System.out.println("Realizando saque");
    	}else {
    		System.out.println("Não foi possivel realizar saque");
    	}
    }
    
    public static void realizarDeposito (Conta conta, double valor) {
    	conta.depositaSaldo(valor); 
    	System.out.println("Realizando deposito");
    }
    
    public static void extrato (Conta conta) {
    	System.out.println(conta.extrato()); 
    }
}