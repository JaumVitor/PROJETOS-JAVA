package vetor_generico;

public class Teste {
	public static void main(String[] args) {
		VetorObject v = new VetorObject(3); 
		Contato c = new Contato ("Jose", "end R1", "41234-41234"); 
		Contato c1 = new Contato ("Jose", "end R1", "41234-41234");
		
		//Adicionando elementos: 
		v.adicionar("Palavra"); //Adicionando String 
		v.adicionar(1); 		//Adicionando valores numericos
		v.adicionar(c); 
		
		//Buscando elementos: 
		System.out.println("Indice: " + v.buscarElemento(0));
		System.out.println("Indice: " + v.buscarElemento("Palavra"));
		System.out.println("Indice: " + v.buscarElemento(c1));
		
		//Removendo elemetos: 
		//v.remover("Palavra"); 
		
		System.out.println(v.toString());
	}
}
