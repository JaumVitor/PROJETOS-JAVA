package banco_loiane;
/* Regras da empresa, utilizar a conta: 
 * 1- Criar conta usando metodo criarConta; 
 * 2- Para poder ter acesso a conta, precisa encontra-la (Usando metodo de busca);
 * 3- Quando a conta for encontrada, ja estará disponivel para fazer movimentacoes */ 

public class TestesBanco {
    public static void main(String[] args) {
    	GerenciaConta gerenciador = new GerenciaConta(); //<> OBJETO ADM DE TODAS AS CONTAS
    	
    	//Iniciando as contas e fazendo movimentacoes: 
    	criarConta(1, gerenciador);
    	
    	try { Conta c1 = buscarConta(2, gerenciador);
    	} catch (Exception e) { System.err.println(e.getMessage()); } 
    	
    }
    
    public static void criarConta (int numConta, GerenciaConta gerenciador) {
    	gerenciador.criarConta(numConta);
    }
    
    public static Conta buscarConta (int numeroConta, GerenciaConta gerenciador) throws Exception {
    	Conta conta = gerenciador.buscar(numeroConta);
    	if (conta != null) {
    		System.out.println("Pode usar sua conta");
    		return conta; 
    	}else {
    		throw new Exception ("Esta conta não existe!"); 
    	}
    }
    
    public static void realizarSaque (Conta conta, double valor) {
    	conta.sacarSaldo(valor);
    }
    
    public static void realizarDeposito (Conta conta, double valor) {
    	conta.depositaSaldo(valor); 
    }
}