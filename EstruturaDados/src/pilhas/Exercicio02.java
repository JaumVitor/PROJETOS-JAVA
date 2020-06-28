package pilhas;

import java.util.Scanner;
import java.util.Stack;
import static pilhas.Exercicio01.recebeValor;

public class Exercicio02 {

	public static void main(String[] args) {
		Stack<Integer> stackPar= new Stack<Integer>(); //Evens = par 
		Stack<Integer> stackImpar = new Stack<Integer>();  //Odds = impar
		Scanner input = new Scanner(System.in); 

		for (int i=0; i<5; i++) {
			int valor = recebeValor(input, "Type the number: "); 
			
			//<> Removendo elementos das duas pilhas, pois o valor digitado foi zero
			if (valor == 0) {
				System.out.println("\nRemoving values from the stack ODDS and EVENS");
				DeleteBothStack(stackPar, stackImpar); //<--Vai deletar elementos da lista que nao estiver vazia 
			
			//<> Adicionando elementos as pilhas, se for par ou impar
			}else if (valor % 2 == 0) { 
				System.out.println("\nValue is EVEN, added to the stack Evens");
				stackPar.push(valor); 
			} else {
				System.out.println("\nValue is ODD, added to the stack Odds");
				stackImpar.push(valor); 
			}
		}

		System.out.println("------------------------------------------");
		//<> Verificando se as pilhas estao vazias (Para imprimir ou nao os valeres):
		if (!stackPar.isEmpty() && !stackImpar.isEmpty()) {
			//Duas pilhas nao estao vazias
			System.out.println("Both stacks arent empty, removing elements: ".toUpperCase());
			while (!stackPar.isEmpty() || !stackImpar.isEmpty()) {
				DeleteBothStack(stackPar, stackImpar); //Enquanto as duas listas nao estiverem vazias continua chamando o metodo
			}
			System.err.println("\tALL STACKS ARE EMPTY");
		}
		else if (stackPar.isEmpty() && !stackImpar.isEmpty()) {
			//Apenas a stackPar esta vazia, limpar elementos da stackImpar
			System.out.println("stackImpar isent empty, removing elements: ".toUpperCase());

			while (!stackImpar.isEmpty()) {
				System.out.println("\tRemoving elements from the stackImpar - " + stackImpar.pop() + " " + stackImpar);
			}
		}
		else if (!stackPar.isEmpty() && stackImpar.isEmpty()) {
			//Apenas a stackImpar esta vazia, limpar elementos da stackPar
			System.out.println("stackPar isent empty, removing elements: ".toUpperCase());

			while (!stackPar.isEmpty()) {
				System.out.println("\tRemoving elements from the stackPar - " + stackPar.pop() + " " + stackPar);
			}
		}else {
			//Todas as pilhas estao vazias
			System.err.println("ALL STACKS ARE EMPTY"); 
		}
	}
	
	public static void DeleteBothStack(Stack<Integer> stackPar, Stack<Integer> stackImpar) {
		if (!stackPar.isEmpty()) {  //Verificando se a pilha dos pares tem conteudo
			System.out.println("\tDeleting number from the Even- " + stackPar.pop() + " " + stackPar); 
		}else {
			System.out.println("\t@StackPar is empty!".toUpperCase());
		}

		if (!stackImpar.isEmpty()) {  //Verificando se a pilha dos impares tem conteudo
			System.out.println("\tDeleting number from the Odd - " + stackImpar.pop() + " " + stackImpar);
		}else {
			System.out.println("\t@StackImpar is empty!".toUpperCase());
		}
		System.out.print("\n");
	}
}
