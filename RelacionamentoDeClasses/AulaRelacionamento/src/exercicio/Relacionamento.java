package exercicio;

import exercicio.Lutadores.DadosLutadores;
import exercicio.Lutadores.StatusLutador;
/*Essas importcoes nao sao necessarias, caso eu queira retira-las preciso mudar a forma de instanciamento*/

public class Relacionamento {
	public static void main (String[] args) {
	        //Declarando usnado as importacoes: 
	        DadosLutadores.arrayLutadores[0] = Lutadores.cadastrarLutador("Maicon", "Brasil", 18, 1.73, 50, 'A', 
	  											new StatusLutador());
	        /*Declarando sem udar importacoes: 
	        Lutadores.DadosLutadores.arraylutadores[0] = Lutadores.cadastrarLutador("Maicon", "Brasil", 18, 1.73, 50, 'A',
			  									new Lutadores.StatusLutador(5,1,3));*/
	         																	
	        DadosLutadores.arrayLutadores[0].apresentar(); 
	        DadosLutadores.arrayLutadores[0].ganharLuta();
	        DadosLutadores.arrayLutadores[0].perderLuta();
	        DadosLutadores.arrayLutadores[0].empatarLuta();
	        
	        DadosLutadores.arrayLutadores[0].status();
	        
	}
}

