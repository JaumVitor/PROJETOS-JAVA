package exercicio;

import java.util.Random;

public class TestesAleatorios {
	public static void main(String[] args) {
		Random gerador = new Random(); 
		
		String string = "0"; 
		String valor = ""; 
		
		for (int i=0; i<10; i++) {
			valor += gerador.nextInt(10);  
			if (string.contains(valor)) {
				System.out.println("Contem dentro da string");
			}else {
				System.out.println("Não contem dentro da string");
				string += valor; 
			}
			valor = "";
		}
	}
}
