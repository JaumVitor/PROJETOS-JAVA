package heranca_super_classes;

public class TestesSuperClasse {
        public static void main(String[] args) {
	     SuperClasse superC = new SuperClasse(10,20); //Caso a superClasse seja abstract, não podemos estancia-la
	     SubClasse subC = new SubClasse(1, 2, 0, 0);  

	     subC.print();
	     superC.print();
        }
}
