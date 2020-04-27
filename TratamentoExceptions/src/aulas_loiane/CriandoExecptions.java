package aulas_loiane;
/*Neste classe eu vou representar a criação de uma exception, de maneira generica*/

public class CriandoExecptions {
	public static void main(String[] args) {
		int vetor1[] = {15, 1,2,3,4,5,3}; 
		int vetor2[] = {2, 1,2,0,4,0};
	     
		for (int i=0; i<vetor1.length; i++) {
			try {
				if (vetor1[i] % vetor2[i] != 0) {
					//Criando uma excetion, caso ...E ela vai ser disparada como uma exception
					throw new DivisaoNaoExata (vetor1[i], vetor2[i]); 
				}
				System.out.printf("%d / %d = %d\n", vetor1[i],  vetor2[i], vetor1[i] / vetor2[i]);
			}

			catch (ArrayIndexOutOfBoundsException exe) {
				exe.printStackTrace();
			}
			catch ( DivisaoNaoExata exe) { //Usando minha propria exception
				exe.printStackTrace();
			}
		}
	}
}
