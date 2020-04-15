package exercicio;
/*Clsse lutador, responsavel pelos dados de cada lutador*/ 
//@SuppressWarnings("unused")   ---> Usado para esconder as Warnings

public class Lutadores {
        static class StatusLutador{
	     //Classe interna, usada somente dentro de Lutadores
	     private int vitorias, derrotas, empates;
	     
	     //METODOS AUXILIARES DA CLASSE INTERNA
	     public int getVitorias() {
	             return vitorias;
	     }

	     public int getDerrotas() {
	             return derrotas;
	     }

	     public int getEmpates() {
	             return empates;
	     }
	     
	     public void setVitorias(int vitorias) {
	             this.vitorias = vitorias;
	     }

	     public void setDerrotas(int derrotas) {
	             this.derrotas = derrotas;
	     }

	     public void setEmpates(int empates) {
	             this.empates = empates;
	     }

	     //Contrutor da classe interna StatusLutador 
	     public StatusLutador (int vitorias, int derrotas, int empates){
		  this.vitorias = vitorias; 
		  this.derrotas = derrotas; 
		  this.empates = empates; 
	     }
        }
        
        static class DadosLutadores{
	     //Vetor que armazena os dados de todos os lutadores, eh global...pois precisa ter visibilidade em todas outras classes 
	     public static Lutadores[] arrayLutadores = new Lutadores[30]; 
        }
        //ATRIBUTOS ----<<<<<<>>>>>>
        private String nome;
        private String nacionalidade; 
        private char categoria;
        private int idade; 
        private double altura, peso; 
        StatusLutador statusLutador; 
        
        //METODOS -------<<<<<<<>>>>>
        public static Lutadores cadastrarLutador (String nome, String nacionalidade, int idade, double altura, 
		  				   double peso, char categoria, StatusLutador statusLutador) {
	     //Criando cadastro do lutador, e retornando pro local de chamamento.....(Retorno vai pro arrayLutadores):
	     Lutadores dados = new Lutadores (nome, nacionalidade, idade, altura, peso, categoria, statusLutador);
	     return dados; 
        }
        
        //Contrutor da classe Lutadores
        public Lutadores (String nome, String nacionalidade, int idade, double altura, double peso, char categoria, StatusLutador statusLutador ) {
	     this.nome = nome;
	     this.nacionalidade = nacionalidade; 
	     this.idade = idade; 
	     this.altura = altura; 
	     this.peso = peso; 
	     this.categoria = categoria; 
	     this.statusLutador = statusLutador;
        }

        //METOS AUXILIARES: 
        public String getNome() {
                return nome;
        }

        public String getNacionalidade() {
                return nacionalidade;
        }

        public char getCategoria() {
                return categoria;
        }

        public int getIdade() {
                return idade;
        }

        public double getAltura() {
                return altura;
        }

        public double getPeso() {
                return peso;
        }

        public StatusLutador getStatusLutador() {
                return statusLutador;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public void setNacionalidade(String nacionalidade) {
                this.nacionalidade = nacionalidade;
        }

        public void setCategoria(char categoria) {
                this.categoria = categoria;
        }

        public void setIdade(int idade) {
                this.idade = idade;
        }

        public void setAltura(double altura) {
                this.altura = altura;
        }

        public void setPeso(double peso) {
                this.peso = peso;
        }

        public void setStatusLutador(StatusLutador statusLutador) {
                this.statusLutador = statusLutador;
        }
        
}
