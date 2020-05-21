package heranca_super_classes;

public class SubClasse extends SuperClasse{
        private int c; 
        private int d;
        //	private int a=0; //Tem o mesmo nome da variavel da super Classe

        public SubClasse(int a, int b, int c, int d) { //Contrutor da subClasse
	     super (a, b); //Usando super (Passando os elementos do parametro, para o contrutor da superClasse)
	     this.c = c; 
	     this.d = d; 
        }

        @Override
        public void print () {
	     System.out.println("Usando o print sobreescrito da subClasse");
	     //		System.out.println(super.a); 	//Posso acessar as variaveis da super Classe usando o super
	     //		System.out.println(a); 		   //Se referencia a variavel "a" dessa classe
	     //		System.out.println(super.b);
	     //		System.out.println(this.c);	  	
	     //		System.out.println(this.b + "\n");  //Posso me referenciar a variavel da super Classe usando o this 

	     //Printando todas as variaveis, tanto herdadas como locais da classe: 
	     System.out.println(this.a);
	     System.out.println(this.b);
	     System.out.println(this.c);
	     System.out.println(this.d);

        }
}
