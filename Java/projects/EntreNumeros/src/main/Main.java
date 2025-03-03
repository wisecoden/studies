package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
			int total= 0;
			int numeral;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		
			for(int i = 1; i <= 5; i++) {
				 numeral = scan.nextInt();
				 
				if(numeral >= 10 && numeral <= 150) {
					total++;
					}	
				}
	System.out.println("O total de numeros enre os numeros eh: " + total);
	scan.close();
  }
}
