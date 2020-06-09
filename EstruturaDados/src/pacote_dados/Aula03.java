package pacote_dados;
/*
 * Aumentar capacidade do vetor
 * criar novamente metodo de remocao
 */
public class Aula03 {
	public static void main(String[] args) {
		Vetor v1 = new Vetor(2); 

		//Adicionando elementos: 
		v1.adicionar("Palavra"); 	//0
		v1.adicionar("Segunda");   //1
		v1.adicionar("Add");	  //2
		v1.adicionar("String");  //3	
		v1.adicionar("fakjsdlfkjsdf"); 
		
		System.out.println(v1.toString());

//		try {
//			v1.adicionar("Valor", 5);
//		}catch (Exception e){
//			e.printStackTrace();
//		}
//		
//		try {
//			v1.adicionar("Valor1", 2); 
//		}catch (Exception e){
//			e.printStackTrace();
//		}
//		

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
		
		if (!v1.remover(5)) {
			System.out.println("Não foi possivel remover");
		}
		
		System.out.println(v1.toString());
	}
}
