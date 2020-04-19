package pacote_de_aulas;
import java.util.Scanner;

public class Aula17_Strings {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in); 
		int idade;
		String nome; 
		
		System.out.print ("Informe seu nome: "); 
		nome = input.next(); 
		System.out.print("Qual sua idade ? ");
		idade = input.nextInt(); 
		
		System.out.printf("Meu nome é %s e tenho %d anos", nome, idade );
		//Fazendo alteração de teste no meu projeto
	}
}
