package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			String nome;
			float nOTA1 = 0.0f;
			float nOTA2 = 0.0f;
			float nOTA3 = 0.0f;
			double media;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite seu nome: ");
		      nome = scan.next();
		      
		    System.out.println("Digite a 1° nota : ");
		       nOTA1 = scan.nextFloat();
		      
		    System.out.println("Digite a 2° nota: ");
		      nOTA2= scan.nextFloat();
		      
		      System.out.println("Digite a 3° nota: ");
		      nOTA3 = scan.nextFloat();
		      
		      
		  media = (nOTA1 + nOTA2 + nOTA3) / 3;
		  
		  System.out.println("Nome :" + nome);
		  
		     if(media >= 7f) {
		    	 System.out.println("Mensão: Aprovado");
		    	 
		     } else if(media == 6.5f ) {
		    	 System.out.println("Mensão:Recuperação");
		     } else {
		    	 System.out.println("Mensão: Reprovado");
		     }
		scan.close();    	 
	  }  
}
