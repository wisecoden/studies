package main;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		int celcius;
		double fahreint;
		
	    Scanner scan = new Scanner(System.in);
	      Logger.getLogger(Main.class.getName()).log(Level.INFO, "Insira o valor em Celcius: ");
	      celcius = scan.nextInt();
	      
	      fahreint =  celcius * 1.8 + 32;
	     
	      System.out.println(fahreint);
	    scan.close();
	}

}
