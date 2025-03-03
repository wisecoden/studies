package main;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	public static void main(String[] args) {
		int value1;
		int value2;
		int soma;
		int sub;
		int multi;
		float div;
		
		Scanner scan = new Scanner(System.in);
		Logger.getLogger(Main.class.getName()).log(Level.INFO, "insire dois valores: ");
		    
	      value1 = scan.nextInt();
	      value2 = scan.nextInt();
	      
	      soma = value1 + value2;
	      sub = value1 - value2;
	      multi = value1 * value2;
	      div = (float) value1 / value2;
	      
	      System.out.println("Soma: " + soma);
	      System.out.println("Subtração: " + sub);
	      System.out.println("Multiplicação: " + multi);
	      System.out.println("Divisão: " + div);
	    scan.close();
	}
}
