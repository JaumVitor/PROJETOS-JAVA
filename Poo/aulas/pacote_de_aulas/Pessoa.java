package pacote_de_aulas;

public class Pessoa {
	//Atributos da classe Pessoa
	int a;
	float b;
	int c; 
	
	public Pessoa(int valorA,  float valorB, String palavra) { //Criando um contrutor da classe Pessoa
		//Inicializando os valores da classe
		System.out.println("Inicializado pelo contrutor 1");
		a = valorA; 
		b = valorB; 
		System.out.println(palavra);
	}
	
	public Pessoa () { //Criando um contrutor para instancias sem parametros informados
		a = 1; 
		b = 2; 
	}
	
	public Pessoa (int a, int b, int c) {
		System.out.println("Inicializado pelo contrutor 2");
		this.a = a; //Usando this, pois tenho o a variavel 'a' do paretro igual a da classe
		this.b = b; //Se o this não estivesse especificando a variavel da classe, caso eu me referi-se a var 'a', seria a do paremetro do metodo 
		this.c = c; 
	}
}

