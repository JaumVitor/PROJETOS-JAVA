package pilhas;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio01 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>(); 
		Scanner input = new Scanner(System.in);
		int cont = 0; 
		
		while (cont < 3) {
			int valor = recebeValor(input, "Type the number: ");
			if (valor % 2 == 0) {
				System.out.println("Value par, added to the stack");
				stack.push(valor); 
			}else {
				if (!stack.isEmpty()) {
					System.out.println("Making pop on the stack");
					stack.pop(); 
				}else {
					System.err.println("Stack is empty");
				}
			}
			cont++; 
		}
		System.out.println("---------------------------------");
		
		if (stack.isEmpty()) {
			System.out.println("STACK IS EMPTY!");
		}else {
			System.out.println("STACK ISENT EMPTY!, REMOVING ELEMENTS: ");
			while (!stack.isEmpty()) {
				System.out.println("\tRemoving element " + stack.pop());
			}
			System.err.println("\tFinaly is empty" + stack);
		}
	}

	public static int recebeValor(Scanner input, String msg) {
		do {
			System.out.print(msg);
			String aux = input.nextLine(); 

			try {
				int valor = Integer.parseInt(aux); 
				return valor; 
			} catch (Exception e) {
				System.err.println("valor invalido");
			}
		}while (true); 
	}
}
