package aulas_loiane;

import java.util.Scanner;

public class UsandoStackTrace {
	/* Usando o trhows Exeception dentro do metodo, eu posso tratar o erro quando for usar o metodo
	  E não dentro do metodo chamado*/ 
	
	public static void main(String[] args) {
		try {
			lerNumero();
		} catch (Exception e) {
			System.out.println("Printando a mensagem de erro!");
		}
		
//		try (Scanner input = new Scanner (System.in)) {
//			int valor = input.nextInt();
//			System.out.println("Valor:" + valor);
//		}
//		catch (java.util.InputMismatchException exe) {
//			System.out.println("Vc digitou uma letra");
//		}
	}
	
	public static void lerNumero () throws Exception {
		System.out.println("Digite um valor: ");
		
		Scanner input = new Scanner (System.in); 
		int valor = input.nextInt();
		System.out.println(valor);
		input.close(); //Fechamento do input ou usar o try
	}
}


