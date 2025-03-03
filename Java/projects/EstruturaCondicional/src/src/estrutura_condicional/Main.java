package src.estrutura_condicional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite sua nota: ");
		int median = scan.nextInt();
	
		if (median == 10){System.out.print("Parabens, fechou com 10 !");
		}else if(median >= 7)
         {
        	 System.out.print("Aprovado");
        	 
         }  
         else if(median <= 6){ System.out.print("Recuperação"); }
         else {
        	 System.out.print("Reprovado");
         }
		  
  scan.close();
      }
}