package aulas_loiane;

public class ExemplosDeTratamentos {

        public static void main(String[] args) {
	     /*Criando um for para acessar os elementos do vetor
	      o primeiro vetor, tem mais elementos que o segundo.
	      o segundo vetor, tem elementos zero....Que causa uma indeterminação*/ 
	     
	     int vetor1[] = {1,2,3,4,5,3}; 
	     int vetor2[] = {1,2,0,4,0};
	     
	     for (int i=0; i<vetor1.length; i++) {
		  try {
		          System.out.printf("%d / %d = %d\n", vetor1[i],  vetor2[i], vetor1[i] / vetor2[i]);
		  }
		  /*>Caso queira usar multiplos catchs a ordem precisa ser escolhida de acordo com prioridade
		      >Ou seja, ArrayIndexOfBoundsException: eh mais especifica, Throwble eh superClasse 
		   	(Trowable eh superClasse de todas excessoes)*/
		  
//		  catch (ArrayIndexOutOfBoundsException | ArithmeticException exe) {
		  	//Maneira de combinar dois parametos de excessoes
//		          System.out.println("Aconteceu um erro");
//		  }
		  
		  catch (ArrayIndexOutOfBoundsException  exe) {
		          System.out.println("Erro indexação");
		  }
		  catch (ArithmeticException exe) {
		          System.out.println("Erro aritimetrico");
		  }
		  catch ( Throwable a ) {
		          //Captura todo tipo de erro
		          System.out.println("Erro qualquer");
		  }
		  finally {
		         //Esse bloco é executado em toda momento, idenpendente do bloco try
		          System.out.println("Execultando bloco try");
		  }
	     }
        }
}

