package main;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Main {

	public static void main(String[] args) {
		int opcao;
		
		Scanner scan = new Scanner(System.in);
		Logger.getLogger(Main.class.getName()).log(Level.INFO, "Digite uma opção: ");
		opcao = scan.nextInt();
		
				switch(opcao) {
				case 1:
					Logger.getLogger(Main.class.getName()).log(Level.INFO, "Primeira Opção: ");
					break;
				case 2:
					Logger.getLogger(Main.class.getName()).log(Level.INFO, "Segunda Opção: ");
					break;
				case 3:
					Logger.getLogger(Main.class.getName()).log(Level.INFO, "Terceira Opção: ");
					break;
					
					default: Logger.getLogger(Main.class.getName()).log(Level.INFO, "Valor inválido !");				
				}

		scan.close();
	}

}
