package exercicio;

import java.util.Random;

public class TestesAleatorios {
	public static void main(String[] args) {
		Random gerador = new Random(); 
		
		StringBuilder string = new StringBuilder ();
		StringBuilder valor = new StringBuilder (); 
		System.out.println(gerador.nextInt(2) + 1);
		
		for (int i=0; i<10; i++) {
			valor.append(gerador.nextInt(9) + 1);  //Variavel auxiliar
			//Verificando se este valor ja existe, caso não exista ele adiciona
			if (!(string.toString().contains(valor) || valor.toString().equals("0"))) {string.append(valor);}
			
			valor.delete(0, valor.length());  //Limpando a variavel
		}
		
		System.out.println(string.toString());
		
	}
}
