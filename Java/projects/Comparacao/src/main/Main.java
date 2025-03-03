package main;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
	
		int a = 0;
		int b = 0;
		
		Scanner scan = new Scanner(System.in);
		Logger.getLogger(Main.class.getName()).log(Level.INFO, "Insira dois valores: ");
          a = scan.nextInt();
          b = scan.nextInt();
          
          if (a == b) { 
        	  System.out.println("Os valores são iguais");
        	  
          }else if (a > b) { 
        	  System.out.println("Os valores são diferentes");
        	  System.out.println(a + " é maior que " + b);
        	  
          }else {System.out.println("Os valores são diferentes");
        	  System.out.println(b + " é maior que " + a);
        	  
          	}  
          
       scan.close();   
   }
}
