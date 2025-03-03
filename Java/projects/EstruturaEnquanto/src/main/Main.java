package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 char desejaContinuar = 'S';
		 
		 while(desejaContinuar == 'S' || desejaContinuar == 's') {
			 System.out.println("Digite um numero");
		
		 int numeral = s.nextInt();
		
		 if(numeral == 0) {
			System.out.println("O numero eh zero");
		 } else{ 
			 if(numeral > 0){
				 System.out.println("O numero eh positivo ! ");
	
		}else {
			System.out.println("O numero eh negativo !");
			}
		 }
		
		System.out.println("Deseja continua ? S - Sim / N - Não");
		desejaContinuar = s.next().charAt(0);
				 }
		 s.close();
	}
}