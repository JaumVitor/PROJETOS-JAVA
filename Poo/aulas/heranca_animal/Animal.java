package heranca_animal;

public abstract class Animal {
        private int idade; 
        private String nome; 

        public void comer() {
	     System.out.println("Comendo");
        }
        
        public void fazerBarulho() {
	     System.out.println("Fazendo barulho");
        }

        public void todoAnimalHerda (){ //para fazer o polimorfismo
            System.out.println("Todo animal herda");
        }
        
        public abstract void todoAnimalImplementa (); //Criando declaracao do meotdo

        //Metodos modificadores:
        public int getIdade() {
                return idade;
        }

        public void setIdade(int idade) {
                this.idade = idade;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }
}
