package main;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger; 

public class Main {

	public static void main(String[] args) {
	
		int idade;
		final int maiorIdade = 18;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 1; i <= 2; i++) {
		 Logger.getLogger(Main.class.getName()).log(Level.INFO, "Digite sua Idade: ");
		   idade = scan.nextInt();
			
		  if(idade >= maiorIdade) {
				 Logger.getLogger(Main.class.getName()).log(Level.INFO, "Maior de idade");			  
		  } else {
				 Logger.getLogger(Main.class.getName()).log(Level.INFO, "Menor de idade");
		  }
		  
		}
		
		scan.close();
	}
}


