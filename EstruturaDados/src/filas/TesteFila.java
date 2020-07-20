package filas;

import java.util.Stack;

public class TesteFila {
	public static void main(String[] args) {
		Fila<String> fila = new Fila<> (3); 
		
		//Enfileirando elementos
		fila.enfileirar("1");
		fila.enfileirar("2");
		fila.enfileirar("3");
		fila.enfileirar("4");
		
		//Desenfileirando elementos
		System.out.println("Retirando elemento: " + fila.desenfilerar()); 
		System.out.println("Retirando elemento: " + fila.desenfilerar());
		
		//Espiando elemento
		System.out.println("Espiando elemento: " + fila.espiar());
		System.out.println(fila);
	}
}
