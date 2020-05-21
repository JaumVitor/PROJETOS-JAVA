package heranca_super_classes;

public class SuperClasse {
        public int a; 
        protected int b;

        public void print() {
	     System.out.println("Usando print da super Classe");
	     System.out.println(this.a);
	     System.out.println(this.b);
        }

        public SuperClasse(int a, int b) { //Contrutor da superClasse
	     this.a = a;
	     this.b = b;
        }

        public int getA() {
	     return a;
        }

        public void setA(int a) {
	     this.a = a;
        }

        public int getB() {
	     return b;
        }

        public void setB(int b) {
	     this.b = b;
        } 
}
