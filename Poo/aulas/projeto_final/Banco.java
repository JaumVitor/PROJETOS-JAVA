package projeto_final;

import java.util.Scanner;

public class Banco {
	private static Process exec;

	public static void main(String[] args) {
		boolean resp = true; 
		menuPrincipal();
		
		do {
			int escolha = pegarEscolhaPrincipal("DIGITE SUA ESCOLHA: ");
			switch (escolha) {
			case 1: 
				resp = false; break;
			case 2: 
				resp = false; break;
			case 3: 
				resp = false; break;
			case 4: 
				resp = false; break;
			case 5: 
				resp = false; break;
			case 6: 
				resp = false; break;
			case 7: 
				resp = false; break;
			case 9: 
				resp = false; break;
			case 0: 
				resp = false; break;
			default:
				System.err.println("O valor digitado não esta no menu!");
				break;
			}
		}while (resp);
		
	}
	
	public static void limpar(){
        for (int i=0; i<10; i++) {
        	System.out.println();
        }
    }
	
	public static int pegarEscolhaPrincipal (String msg) {
		Scanner input = new Scanner (System.in);

		do {
			System.out.print(msg);
			String valor = input.nextLine();
			
			try {
				int valorInt = Integer.parseInt(valor);
				return valorInt;
			} catch (Exception e) {
				System.err.println("valor invalido");
			}
				
		}while(true);
	}
	
	public static void menuPrincipal () {
		System.out.println("-----MENU PRINCIPAL------");
		System.out.println("1.Cadastrar Cliente");
		System.out.println("2.Modificar Cliente");
		System.out.println("3.Cadastrar Conta");
		System.out.println("4.Alterar Conta");
		System.out.println("5.Remover Conta");
		System.out.println("6.Mostrar Saldo");
		System.out.println("7.Deposito");
		System.out.println("8.Saque");
		System.out.println("0.ENCERRAR PROGAMA\n");
	}
}
