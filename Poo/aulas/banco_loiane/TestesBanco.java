package banco_loiane;

public class TestesBanco {
    public static void main(String[] args) {
        GerenciaConta g = new GerenciaConta (); 
    	Conta c1 = new Conta (1, true);
        //Conta c2 = new Conta (2, false);
        
        c1.depositaSaldo(200);
        c1.sacarSaldo(100); 
        c1.sacarSaldo(100);
        System.out.println("c1 " + c1.toString());
    }
}