package desafios;

import java.util.Scanner;
import java.util.Stack;

public class Desafio03 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int valor = recebeValor(input, "Digite o valor: "); 
		System.out.println("Valor em binario: " + converterDecimal (valor)); 
	}
	
	public static String converterDecimal (int valor) {
		Stack<Integer> pilha = new Stack<> (); 
		StringBuilder binario = new StringBuilder(); 
		
		while (valor >= 2) { 
			int resto = valor % 2; 
			valor /= 2; 
			
			if (valor < 2) { //Ultima passagem 
				pilha.push(resto);
				pilha.push(valor); 
				break; 
			}
			pilha.push(resto); //So acontece quando a condicao nao eh acionado
		}
		
		while (!pilha.isEmpty()) { //Transformando a stack em string
			binario.append(pilha.pop()); 
		}
		return binario.toString();
	}
	
	public static int recebeValor(Scanner input, String mensege) {
		System.out.print(mensege);
		String valor = input.nextLine(); 
		
		int valorParse = Integer.parseInt(valor);
		return valorParse; 
	}
}
