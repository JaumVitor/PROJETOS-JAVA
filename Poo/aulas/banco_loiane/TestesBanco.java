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
    	
    	//TESTES CONTA NORMAL: 
    	System.out.println("*****--- TESTES CONTA CORRENTE ---*****");
    	
    	criarConta (1, gerenciador, "corrente"); 
    	//Iniciando as contas e fazendo movimentacoes:
    	Conta cc = buscarConta(1, gerenciador);
    	if (cc != null) { 
    		realizarDeposito (cc, 500);
    		realizarSaque(cc,100);
    		realizarSaque(cc, 800); 
    		extrato (cc); 
    	}else {
    		System.err.println("<>Esta conta não existe, para fazer movimentacao!");
    	}
    	
    	//TESTES CONTA POUPANCA: 
    	System.out.println("*****--- TESTES CONTA POUPANC ---*****");
    	
    	criarConta (2, gerenciador, "poupanca"); 
    	//Iniciando as contas e fazendo movimentacoes:
    	Conta c2 = buscarConta(2, gerenciador);
    	if (c2 != null) {
    		ContaPoupanca cp = (ContaPoupanca) c2; //Fazendo casting, para usar os metodos da classe Poupanca
    		realizarDeposito (cp, 1000);  //Posso depositar usando diretamente o objeto
    		realizarDeposito (cp, 1000);
    		cp.atualizarSaldo(0.2);      
    		extrato (cp); 
    	}else {
    		System.err.println("<>Esta conta não existe, para fazer movimentacao!");
    	}
    	
    	//TESTES CONTA ESPECIAL: 
    	System.out.println("*****--- TESTES CONTA ESPECIAL ---*****");
    	
    	criarConta (3, gerenciador, "especial");  //Criando uma conta com numero 3
    	//Iniciando as contas e fazendo movimentacoes:
    	Conta ce = buscarConta(3, gerenciador);  //Buscando uma conta com numero 3, para chamar o objeto
    	if (ce != null) { 
    		//Fazendo operacoes com o objeto chamado
    		realizarDeposito (ce, 500);
    		realizarSaque(ce,100);
    		realizarSaque(ce, 800); 
    		realizarSaque(ce, 100);
    		realizarSaque(ce, 100); //Não sera possivel, pois so posso dever ate 500 
    		extrato (ce); 
    	}else {
    		System.err.println("<>Esta conta não existe, para fazer movimentacao!");
    	}
    }
    
    public static void criarConta (int numConta, GerenciaConta gerenciador, String tipo) {
    	try {
			gerenciador.criarConta(numConta, tipo);
			System.out.println("\t>Criando conta");
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
    		System.out.println("\t>Realizando saque");
    	}else {
    		System.err.println("\t>Não foi possivel realizar saque");
    	}
    }
    
    public static void realizarDeposito (Conta conta, double valor) {
    	conta.depositaSaldo(valor); 
    	System.out.println("\t>Realizando deposito");
    }
    
    public static void extrato (Conta conta) {
    	System.out.println(conta.extrato()); 
    }
}