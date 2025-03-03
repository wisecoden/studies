package main;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
	

public class Main {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	Logger.getLogger(Main.class.getName()).log(Level.INFO, "Digite dois Valores: ");
	
    int a = scan.nextInt();
    int b = scan.nextInt();
    
	if (a == b) {
		System.out.println("Inválido, os valores são iguais");
		
	}else if(a > b) {
		System.out.println("O A é maior " + a);
		
	}else {
		System.out.println("O B é maior" + b);
	}
	 scan.close();
	}

	
}
