package main;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		char sexo;
		int totalHomens = 0 ;
		int totalMulheres = 0;
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.println("Qual é seu sexo: ");
			sexo = scan.next().charAt(0);
					
			if(sexo == 'F' || sexo =='f') {
				totalMulheres++;
			}else if (sexo == 'M'|| sexo =='m'){
				totalHomens++;
			}
		}
		System.out.println("Total de mulheres são: " + totalMulheres);
		System.out.print("Total de Homens são: " + totalHomens);
		scan.close();
	}
}

