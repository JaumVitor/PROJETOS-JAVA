package exercicio;

import exercicio.Lutadores.DadosLutadores;
import exercicio.Lutadores.StatusLutador;
/*Essas importcoes nao sao necessarias, caso eu queira retira-las preciso mudar a forma de instanciamento*/

public class Relacionamento {
	public static void main (String[] args) {
	        //Declarando usnado as importacoes: 
	        DadosLutadores.arrayLutadores[0] = Lutadores.cadastrarLutador("Maicon", "Brasil", 18, 1.73, 50, 'A', 
			  								new StatusLutador(5,1,3));
	        //Declarando sem udar importacoes: 
//	        Lutadores.DadosLutadores.arraylutadores[0] = Lutadores.cadastrarLutador("Maicon", "Brasil", 18, 1.73, 50, 'A',
//			  									new Lutadores.StatusLutador(5,1,3));
	        
	        System.out.println(DadosLutadores.arrayLutadores[0].statusLutador.getDerrotas());
	        System.out.println(DadosLutadores.arrayLutadores[0].getAltura());
	        System.out.println("Fazendo altera��o no codigo");
	        System.out.println("Criando mais uma alter��ao");
	        
	        
	        System.out.println("Fazendo alter��o no codigo, dentro do pc");
	}
}

