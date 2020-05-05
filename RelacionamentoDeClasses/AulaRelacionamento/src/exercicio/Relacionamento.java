package exercicio;
/*vale resaltar que nesse progama esta sendo usado maneiras não tao eficases...Mas estao sendo implementadas para 
 servir como pratica de conhecimentos adquiridos*/

public class Relacionamento {
	public static void main (String[] args) {
		//Criando um objeto do tipo Dados, onde esta o array que vou guardar as alterções
		DadosLutadores dadosLutadores = new DadosLutadores(); 

		dadosLutadores.cadastrarLutador("Maicon", "Brasil", 18, 1.89, 80, new Lutadores.StatusLutador(1,3,4));
		dadosLutadores.cadastrarLutador("Maicon", "Brasil", 18, 1.89, 80, new Lutadores.StatusLutador(1,5,4));
//		dadosLutadores.arrayLutadores[0].apresentar(); 
//		dadosLutadores.arrayLutadores[1].apresentar();
		
		Combate c = new Combate (dadosLutadores.arrayLutadores[0], dadosLutadores.arrayLutadores[1]); 
		c.marcarLuta();
		c.lutar();
	}
}

