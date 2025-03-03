package main;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		int mes;
		
		Scanner scan = new Scanner(System.in);
		Logger.getLogger(Main.class.getName()).log(Level.INFO, "Digite o número do mês: ");
	      mes = scan.nextInt();
	
		  switch (mes) {
		  case 1: 
			  Logger.getLogger(Main.class.getName()).log(Level.INFO, "Janeiro");
			   break;
			  
		  case 2:
			  Logger.getLogger(Main.class.getName()).log(Level.INFO, "Fevereiro");
			  break;
			  
		  case 3:
			  Logger.getLogger(Main.class.getName()).log(Level.INFO, "Março");
			  break;
			  
		  case 4:
			  Logger.getLogger(Main.class.getName()).log(Level.INFO, "Abril");
			  break;
			  
		  case 5: 
			  Logger.getLogger(Main.class.getName()).log(Level.INFO, "Maio");
			  break;
		  
		  case 6:
			  Logger.getLogger(Main.class.getName()).log(Level.INFO, "Junho");
			  break;
			  
		  case 7:
			  Logger.getLogger(Main.class.getName()).log(Level.INFO, "Julho");
			  break;
		  
		  case 8:
			  Logger.getLogger(Main.class.getName()).log(Level.INFO, "Agosto");
			  break;
		  
		  case 9: 
			  Logger.getLogger(Main.class.getName()).log(Level.INFO, "Setembro");
			  break;
		
		  case 10:
			  Logger.getLogger(Main.class.getName()).log(Level.INFO, "Outubro");
			  break;
				
		  case 11: 
			  Logger.getLogger(Main.class.getName()).log(Level.INFO, "Novembro");
			  break;
		
		  case 12:
			  Logger.getLogger(Main.class.getName()).log(Level.INFO, "Dezembro");
			  break;
		
				default: Logger.getLogger(Main.class.getName()).log(Level.INFO, "Inválido");
		  		}
		scan.close();
	}
}
