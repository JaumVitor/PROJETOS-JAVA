package exercicio;

import java.util.Random;

public class Combate {
	//ATRIBUTOS
	private Lutadores lutador1;
	private Lutadores lutador2; 
	//private int rouds; 
	protected boolean statusLuta; 

	public Combate (Lutadores lutador1, Lutadores lutador2) {
		this.lutador1 = lutador1; 
		this.lutador2 = lutador2; 
		this.statusLuta = false; 
	}
	
	//METODOS DA CLASSE
	public void exibir() {
		System.out.println(this.lutador1.toString());
		System.out.println(this.lutador2.toString());
	}
	
	public void marcarLuta () {	
		//Metodo chamado antes da luta, e é responsavel por validar se a luta vai ocorrer ou não
		if (lutador1.equals(lutador2) == false) { 
			//Novo metodo equals só retorna falso quando todos os atributos são diferentes
			//Caso tenha um atributo igual, ele vai pra outra condição....Se todas forem iguais ele retorna true
			this.statusLuta = true; 
		}
	}
	
	//Usando exception que eu criei para exibir uma mensagem, caso os lutadors sejam iguais
	public void lutar () {
		try { 
			if (statusLuta != true) {
				//Dispara a exception, e sera usada no catch
				throw new LutaNaoAceita (this.lutador1, this.lutador2); 
			}else {
				//Se não for disparada a exception, vai exibir os lutadores
				System.out.println("\t***LUTA FOI ACEITA!***");
				analiseAtributos (); //Cada lutador vai ter seus atrbutos aprimorados
				iniciarCombate (); 
				//System.err.println(this.toString());
			}
		}catch (LutaNaoAceita exception) {
			System.err.println(exception.getMessage());
		}
	}
	
	//Responsavel pela analise dos lutadores, pra ver quem tem mais vantagem na luta
	public void analiseAtributos () {

		//EXPERICIA: (Tem que ser o primeiro caso analisado, pois vai definir quem vai ter vantagem)
		System.out.println("\t***Analisando os atributos dos lutadores***");
		if (this.lutador1.getStatusLutador().getVariacao() > this.lutador2.getStatusLutador().getVariacao()) {
			System.out.println(" * Lutador 1 tem mais experiencia");
			lutador1.setaExp(lutador1.getaExp() + 1);
			
		}else if (this.lutador2.getStatusLutador().getVariacao() > this.lutador1.getStatusLutador().getVariacao()){
			System.out.println(" * Lutador 2 tem mais experiencia");
			lutador2.setaExp(lutador2.getaExp() + 1);
		}else {
			System.out.println(" * Nenhum dos lutadores tem vantagem de experiencia");
		}
		
		//MOBILIDADE: 
		if (this.lutador1.getAltura() < this.lutador2.getAltura()) {
			System.out.println(" * Lutador 1 tem mais MOBILIDADE");
			lutador1.setaMob(lutador1.getaMob() + 1);
		}else if (this.lutador2.getAltura() < this.lutador1.getAltura()) {
			System.out.println(" * Lutador 2 tem mais MOBILIDADE");
			lutador2.setaMob(lutador2.getaMob() + 1);
		}else {
			System.out.println(" * Nenhum dos lutadores tem MOBILIDADE");
		}
		
		//FORÇA: 
		if (this.lutador1.getPeso() > this.lutador2.getPeso()) {
			System.out.println(" * Lutador 1 tem mais FORÇA");
			lutador1.setaFor(lutador1.getaFor() + 1);
		}else if (this.lutador2.getPeso() > this.lutador1.getPeso()) {
			System.out.println(" * Lutador 2 tem mais FORÇA");
			lutador2.setaFor(lutador2.getaFor() + 1);
		}else {
			System.out.println(" * Nenhum dos lutadores tem mais força");
		}
		
		//Distribuindo os pontos extras de vantagem: 
		if (lutador1.getaExp() > lutador2.getaExp()) {
			lutador1.setaFor(lutador1.getaFor() + 1);
			lutador1.setaMob(lutador1.getaMob() + 1);
		}else if (lutador2.getaExp() > lutador1.getaExp()){
			lutador2.setaFor(lutador2.getaFor() + 1);
			lutador2.setaMob(lutador2.getaMob() + 1);
		}
	}
	public String criarValores (Random random, int tentativa) { //Cria valores aleatórios diferentes, recebendo como parametro a quant
		StringBuilder valores = new StringBuilder (); 
		StringBuilder aux = new StringBuilder (); 
		int cont = 0; 
		
		//Se aux não estiver contida em valores, vamos add aux 
		while (cont < tentativa) {
			aux.append(random.nextInt(9) + 1); 
			if (!(valores.toString().contains(aux))) { 
				valores.append(aux); 
				cont ++;
			}
		}
		return valores.toString(); //Retorna String com a quantidade de valores sorteados e não repetidos
	}
	
	//Numerador -> Parte de cima da fração, Denominador -> Parte de baixo 
	public void verificarAtk (int tentativa) {  
		Random random = new Random (); 
		
		StringBuilder valorSorte = new StringBuilder (); 
		valorSorte.append(random.nextInt(9) + 1); //Sorteando valor entre 1 e 10
		
		String valores = criarValores (random, tentativa); //Cria os valores que serão usados para comparar se houve acerto
		
		if (valores.contains(valorSorte)) {
			System.out.println("Acertou ataque!");
		}else {
			System.out.println("Não acertou ataque");
		}
	}
	
	public void iniciarCombate(){
		//Iniciando chance de acertar o ataque
		System.out.println("\t***Iniciando combate***".toUpperCase());
		verificarAtk (5); //Neste caso seria 20% de chance
	}
	
	//SOBREESCREVENDO METODOS
	public String toString () {
		System.out.println("----------A SERÁ ENTRE OS LUTADORES----------");
		return String.format("%s VS %s", this.lutador1, this.lutador2);
	}
}



