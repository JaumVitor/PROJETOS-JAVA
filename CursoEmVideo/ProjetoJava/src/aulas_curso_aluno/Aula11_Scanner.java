package aulas_curso_aluno;

import java.util.Scanner; //Importando uma classe da biblioteca java.util

public class Aula11_Scanner{

    private static int COST;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //Instanciando o objeto input, atravez da classe Scanner
        
        int soma,valor1,valor2; 
        final int CONST = 10; //Criando uma constante
        System.out.print (CONST+"\n"); 
        
        System.out.print("Digite o valor 1: "); 
        valor1 = input.nextInt();
        System.out.print ("Digite o valor 2: "); 
        valor2 = input.nextInt(); 
        
        soma = valor1 + valor2; 
        System.out.println ("O resultado da soma foi de " + soma);
    }     
}