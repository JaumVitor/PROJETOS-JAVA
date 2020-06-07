package testandoSobreescrita;

public class Classe2 extends Classe1{
	@Override
	public void metodo() {
		System.out.println("Antes do metodo");
		metodo(1); 
		System.out.println("Nao printa mensagem!!!!");
	}
}
