package vetor_generico;

public class Teste {
	public static void main(String[] args) {
		Lista<Contato> vetor = new Lista<Contato>(3); //Criando uma lista "generica especializada"
		Contato c = new Contato("Nome", "endereço fhdaskjh", "42423-42342"); 
	
		vetor.adicionar(c); 
		System.out.println(vetor.toString());
		
		System.out.println("Apagando elementos");
		vetor.clear();
		System.out.println(vetor);
	}
}
