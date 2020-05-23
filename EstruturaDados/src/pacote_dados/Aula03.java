package pacote_dados;

public class Aula03 {
	public static void main(String[] args) {
		Vetor v1 = new Vetor(6); 

		//Adicionando elementos: 
		v1.adicionar("Palavra"); 	//0
		v1.adicionar("Segunda");   //1
		v1.adicionar("Add");	  //2
		v1.adicionar("String");  //3	
		
		try {
			v1.adicionar("Valor", 5); //Posicao invalida, pois nao posso add valores em desordem
		}catch (Exception e){
			e.printStackTrace();
		}
		
		try {
			v1.adicionar("Valor1", 2); 
		}catch (Exception e){
			e.printStackTrace();
		}
		
		
		//Buscando elementos pelo indice: 
		try {
			System.out.println(v1.buscarElemento(3)); 
		}catch (Exception e){
			e.printStackTrace();
		}
			
		try { 
			System.out.println(v1.buscarElemento(1));
		}catch (IllegalArgumentException e){
			e.printStackTrace();
		}
		
		//Buscando elemento pela String: 
		try { 
			System.out.println(v1.buscarElemento("string"));
		}catch (Exception e){
			e.printStackTrace();
		}
		
		v1.statusElementos();

	}
}
