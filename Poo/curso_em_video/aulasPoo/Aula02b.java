//Neste progama eu posso utilizar as classes que eu ja criei neste pacote

package aulasPoo;

public class Aula02b {
	public static void main (String[] args) {
		Caneta c1 = new Caneta();  
		Caneta c2 = new Caneta (); 
		
		//Fazendo o preenchimento do objeto c1 (Metodo não convencional)
		c1.modelo = "Bic"; 
		c1.cor = "Azul"; 
		c1.carga = 10;
		c1.ponta = 1.2f; //Precisa converter o valor para float
		c1.tampada = true;
		
		c2.tampada = true; 
		
		//Fazendo uso dos metodos
		c1.destampar(); 
		c1.rabiscar(); 
		
		c2.rabiscar(); 
	}
}
