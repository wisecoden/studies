package main;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		String nome;
		float nota1;
	    float nota2;
		float nota3;
		float  media;
			
	Scanner scan = new Scanner(System.in);
		Logger.getLogger(Main.class.getName()).log(Level.INFO, "Insira seu nome: ");

			nome =  scan.nextLine();
		Logger.getLogger(Main.class.getName()).log(Level.INFO, "Insira a nota das 3 avaliações: ");

			nota1 = scan.nextFloat(); 
			nota2 = scan.nextFloat();
			nota3 = scan.nextFloat();
			media  = (nota1 + nota2 + nota3)/ 3;
		
		System.out.println(nome);
		System.out.printf( "%.2f", media);
	scan.close();

	}
}

   