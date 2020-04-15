package pacote_de_aulas;

public class UsandoClassPessoa {
	public static void main (String[] args) {
		Pessoa p1 = new Pessoa(10, 13.4f, "Roberta"); // linha 1 - Esta classe ja esta tem valores inicializados pelo contrutor
		Pessoa p2 = new Pessoa(2,3,3); 
		
		System.out.printf("p1 - Valor de A: %d\n", p1.a);
		System.out.printf("p1 - Valor de B: %.2f\n\n", p1.b);
	
		System.out.println("p2 - A " + p2.a);
		System.out.println("p2 - B " + p2.b);
		System.out.println("p2 - C " + p2.c);
		System.out.println("fdsf");
	}
}
/*Caso eu crie uma classe sem definir meu contrutor, ele é criado automaticamente pelo java
  1- Se eu defini-lo sem parametro, não preciso passar nenhum parametro
  2- Se eu defini-lo com parametro, tenho que passar os parametros na chamada do contrutor ( ex: Linha 1 )  
  3- Se eu criar mais de um contrutor para a mesma classe: 
  	  Dependendo de como eu prencho os parametros de entrada, eu utilizo um contrutor de "inicialização" diferente  
  	  Ex: Posso ter o contrutor que prenche quando os paramentros não são passados, com 3 inteiros, e o com int, float e string
 */