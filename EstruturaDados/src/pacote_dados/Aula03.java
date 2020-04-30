package pacote_dados;

public class Aula03 {
	public static void main(String[] args) {
		Vetor contrlVetor = new Vetor(3); 
		
		try {
			contrlVetor.adicionar("Palavra");
			contrlVetor.adicionar("Segunda Palavra"); 
			contrlVetor.adicionar("Ultima");
			contrlVetor.statusElementos();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
