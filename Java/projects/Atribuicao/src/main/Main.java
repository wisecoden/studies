package main;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		  Scanner scan = new Scanner(System.in);
		 
		   Logger.getLogger(Main.class.getName()).log(Level.INFO, "Insira um valor A: ");
		    a = scan.nextInt();
		   Logger.getLogger(Main.class.getName()).log(Level.INFO, "Insira um valor B: ");
		    b = scan.nextInt();
		    
		   c = a;
		   a = b;
		   b = c;
		   System.out.println("");
		   System.out.println(a);
		   System.out.println(b);
		  scan.close();
		
	}

}
