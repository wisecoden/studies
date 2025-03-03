package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	int anoVeiculo;
	float valorVeiculo;
	float porcentagemDesconto;
	float valorDesconto;
	float valorPagar;
	
	int totalCarros = 0;
	int totalCarrosSemiNovos = 0;
	
	Scanner scan = new Scanner(System.in);
	
	char desejaContinuar = 's'; 
	
	while (desejaContinuar == 's'||desejaContinuar == 'S') {
		
		System.out.println("Qual é o ano de fabricação do veículo ? ");
		 anoVeiculo = scan.nextInt();
		System.out.println("Qual é o valor do veículo ? ");
		valorVeiculo = scan.nextFloat();
		
		if(anoVeiculo <= 2000) {
		  porcentagemDesconto = 0.12f;
		}else {
	      porcentagemDesconto =  0.07f;
	      totalCarrosSemiNovos++;
		}
		
		totalCarros++;
		
		valorDesconto = valorVeiculo * porcentagemDesconto;
		valorPagar =  valorVeiculo - valorDesconto;
		

		System.out.println("O valor do desconto é: " + valorDesconto);
		System.out.println("O valor a pagar é de: " + valorPagar);
		
		System.out.println("Deseja fazer mais cadastros ? S - Sim / N - Não");
		 desejaContinuar = scan.next().charAt(0);

	}

	System.out.println("O total de Carros Semi novos é de: " + totalCarrosSemiNovos);
	System.out.println("O total de carros é: " + totalCarros);
	scan.close();
}
}