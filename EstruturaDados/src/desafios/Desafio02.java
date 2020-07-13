package desafios;

import java.util.Stack;

public class Desafio02 {
	public static void main(String[] args) {
		
		//Expressoes para analise: 
		verificar ("(A+B) * (A-C)"); 	//true
		verificar (")A*B("); 			//false
		verificar ("(A-B)*((A+B)");		//false 
		verificar ("[A-B)+(A/B)]"); 	//false
		verificar ("[A-B+(A*B)]");		//true 
	}
	
	public static void verificar (String expressao) {
		System.out.println("Expressao: " + expressao + " eh valida ? " + verificarExpressao(expressao));
	}
	
	public static boolean verificarExpressao (String expressao) {
		Stack<Character> pilha = new Stack<>(); 
		final String ABRE = "{[("; //Constante de fechamento
		final String FECHA = "}])"; //Constante de abertura 
		
		for (int i=0; i<expressao.length(); i++) {
			char simbolo = expressao.charAt(i);
			
			if (ABRE.indexOf(simbolo) > -1){ 
				//Significa que existe um simbolo de abertura
				pilha.push(simbolo); 
				
			}else if (FECHA.indexOf(simbolo) > -1 && !pilha.isEmpty()) {
				//Siginifica que o exite um simbolo de fechamento
				if (FECHA.indexOf(simbolo) == ABRE.indexOf(pilha.peek())) { //Verificando se o fechamento eh valido  
					pilha.pop();
				}else {
					return false; 
				}
			}else if (FECHA.indexOf(simbolo) > -1 && pilha.isEmpty()) {
				return false; 
			}
		}
		
		if (!pilha.isEmpty()) {	 //Se ao final ainda tiver parentese sem fechamento
			return false; 
		}
		return true;  //Se todos os parenteses estao fechados
	}
}
