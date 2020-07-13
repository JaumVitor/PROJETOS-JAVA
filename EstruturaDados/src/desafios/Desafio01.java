package desafios;

import java.util.Stack;

public class Desafio01 {
	public static void main(String[] args) {
		
		//Fazendo testes para ver se eh um palindromo: 
		verificarPalindromo ("aba"); 
		verificarPalindromo ("aabaa"); 
		verificarPalindromo ("ards"); 
	}

	public static boolean verificarPalindromo (String palavra) {
		Stack<Character> pilha1 = new Stack<> ();
		Stack<Character> pilha2 = new Stack<> (); 

		for (int i=0; i<palavra.length(); i++) { //Preenchendo pilha 1
			pilha1.push(palavra.charAt(i)); 
		}

		for (int i=palavra.length()-1; i>=0; i--) { //Preenchendo pilha 2
			pilha2.push(palavra.charAt(i)); 
		}

		if (pilha1.equals(pilha2)) {
			System.out.println("A string eh um palindromo");
			return true;
		}
		
		System.out.println("A string NAO eh um palindromo");
		return false;
	}
}
