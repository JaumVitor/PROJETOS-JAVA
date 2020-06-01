package banco_loiane;

public class TestesBanco {
    public static void main(String[] args) {
    	Conta c1 = new Conta (1);
        //Conta c2 = new Conta (2, false);
        
        c1.depositaSaldo(200);
        c1.depositaSaldo(10); 
        System.out.println("c1 " + c1.toString());
    }
    
    public static GerenciaConta criarConta (int numConta) {
    	GerenciaConta g = new GerenciaConta(); 
    	g.criarConta(numConta);
    	return g; 
    }
}