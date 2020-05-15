package pacote_dados;

public class Aula03 {
	public static void main(String[] args) {
		Vetor contrlVetor = new Vetor(5); 

		try {
			contrlVetor.adicionar("Palavra"); //0
			contrlVetor.adicionar("Segunda"); //1
			contrlVetor.adicionar("Add");	  //2
			contrlVetor.adicionar("String");  //3	
			
			System.out.println(contrlVetor.buscarElemento(3));
			System.out.println(contrlVetor.buscarElemento(5));
			System.out.println(contrlVetor.buscarElemento(1));
			contrlVetor.statusElementos();
			
		} catch (Exception e) {e.printStackTrace();}	
	}
}
