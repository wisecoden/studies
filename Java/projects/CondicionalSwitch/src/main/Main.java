package main;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Main {
	
	public static void main(String[] args){ 
	Scanner scan = new Scanner(System.in);
	Logger.getLogger(Main.class.getName()).log(Level.INFO, "Insira um valor: ");

	 int codigoDoProduto = scan.nextInt();
	 
	  switch (codigoDoProduto) {
	  case 1:
		  Logger.getLogger(Main.class.getName()).log(Level.INFO, "Ok, i pull up");
		  break;
		  
	  case 2:
		  Logger.getLogger(Main.class.getName()).log(Level.INFO, "Capybara");
		  break;
		  
       default: Logger.getLogger(Main.class.getName()).log(Level.INFO, "Valor inválido");
	   }
	  scan.close();
	}
}	