package heranca_animal;

public class Animal {
        private int idade; 
        private String nome; 

        public void comer() {
	     System.out.println("Comendo");
        }
        
        public void fazerBarulho() {
	     System.out.println("Fazendo barulho");
        }

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
