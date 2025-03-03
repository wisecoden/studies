package main;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	   Logger.getLogger(Main.class.getName()).log(Level.INFO, "Insira uma valor:: ");

	    
	  int numero = scan.nextInt();
	 
	 
	    if (numero >=100 && numero <= 200){
	     Logger.getLogger(Main.class.getName()).log(Level.INFO, "Está Dentro ! ");

	}  else { 
		 Logger.getLogger(Main.class.getName()).log(Level.INFO, "Está fora !");
			}
	    scan.close();
	}
}