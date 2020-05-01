package exercicio;
/*Clsse lutador, responsavel pelos dados de cada lutador*/ 
//@SuppressWarnings("unused")   ---> Usado para esconder as Warnings

public class Lutadores {
	public static class StatusLutador{
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
		//Construtor default
		public StatusLutador () { 
			this.vitorias = 0; 
			this.derrotas = 0; 
			this.empates = 0; 
		}
         }
        
        //ATRIBUTOS ----<<<<<<>>>>>>
        private String nome;
        private String nacionalidade; 
        private char categoria;
        private int idade; 
        private double altura, peso; 
        private StatusLutador statusLutador; 
        
        //METODOS -------<<<<<<<>>>>>
        public void apresentar() {
    		System.out.println("-----APRESENTANDO LUTADORES-----");
    		System.out.printf("NOME: %s\n", this.nome);
    		System.out.printf("NASCIONALIDADE: %s\n", this.nacionalidade);
    		System.out.printf("CATEGORIA: %c\n", this.categoria);
    		System.out.printf("IDADE: %d\n", this.idade);
    		System.out.printf("ALTURA: %.2f\n", this.altura);
    		System.out.printf("PESO: %.2f\n\n", this.peso);
        }
        
        public void status() {
        	System.out.println("------STATUS DO LUTADOR-------");
        	System.out.printf("|%d VITORIAS, ", statusLutador.vitorias);
        	System.out.printf("%d DERROTAS, ", statusLutador.derrotas);
        	System.out.printf("%d EMPATES|", statusLutador.empates);
        }
        
        public void ganharLuta() {
        	this.statusLutador.setVitorias (statusLutador.getVitorias() + 1);
        }
        
        public void perderLuta() {
        	this.statusLutador.setDerrotas (statusLutador.getDerrotas() + 1); 
        }
        
        public void empatarLuta() {
        	this.statusLutador.setEmpates(statusLutador.getEmpates() + 1);
        }
        
        //Contrutor da classe Lutadores
        public Lutadores (String nome, String nacionalidade, int idade, double altura, double peso, StatusLutador statusLutador ) {
        	this.nome = nome;
        	this.nacionalidade = nacionalidade; 
        	this.idade = idade; 
        	this.altura = altura; 
        	setPeso(peso);
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
        		
        		if (peso < 50) {
        			setCategoria ('N');
        		}else if (peso <= 70) {
        			setCategoria('A');
        		}else if (peso <= 80) {
        			setCategoria('B');
        		}else if (peso <= 120) {
        			setCategoria('C');
        		}else {
        			setCategoria('N');
        		}
        }

        public void setStatusLutador(StatusLutador statusLutador) {
                this.statusLutador = statusLutador;
        }
        
        //SOBREESCREVENDO METODOS 	
        public String toString () {
        	return String.format("%s [Categoria %s]", this.getNome(), this.getCategoria()); //Imprimindo o nome do lutador, servir� para o toString de combate
        }
        
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Lutadores other = (Lutadores) obj;
			if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
				return false;
			if (idade != other.idade)
				return false;
			if (nacionalidade == null) {
				if (other.nacionalidade != null)
					return false;
			} else if (!nacionalidade.equals(other.nacionalidade))
				return false;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
				return false;
			return true;
		}
}
