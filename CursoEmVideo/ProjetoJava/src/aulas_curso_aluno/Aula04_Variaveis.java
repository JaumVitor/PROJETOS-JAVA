package aulas_curso_aluno;

public class Aula04_Variaveis {
    public static void main (String[] args){
        int variavel;
        variavel = 100;
        //Execultando testes em java: 
        System.out.println("Valor da varial: " + variavel + "."); 
        System.out.printf ("Minha string: %s;\nMeu numero: %d;\n", "String", 10); 
        System.out.println (10+" "+10); //Outro metodo de fazer a mesma coisa de cima
        
        int v1=11, v2=2; 
        double result = (double)v1/v2; //fazendo um casting, pois somente o tipo da variavel não funciona
        
        System.out.printf ("\n%2f\n", result); 
    }  
}
