package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		String nomeProduto;
		float precoCusto;
		float precoVendas;
		float totalCusto = 0;
		float totalVendas = 0;
		double mediaCusto;
		double mediaVendas;
		final int number = 3;

		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < number; i++) {
		 System.out.println("Nome do produto: ");
		  nomeProduto = scan.next();		
		 System.out.println("Preço de custo: ");
		  precoCusto = scan.nextFloat();
		 System.out.println("Preço de Vendas: ");
		  precoVendas = scan.nextFloat();
		
		  totalCusto+= precoCusto;
		  totalVendas+= precoVendas;
		  
		  
		
		if(precoCusto == precoVendas) { 
			System.out.println("Empate");			
	}  else if(precoCusto > precoVendas) {
			System.out.println("Prejuízo");
			
		}else { System.out.println("Lucro");
		     }
		  
		  
		System.out.println(nomeProduto + ", Preço Custo = " + precoCusto + 
				", Preço Vendas = " + precoVendas);
		}
		
		mediaCusto = (totalCusto / number);
		mediaVendas = (totalVendas / number);
		
		System.out.printf("Média do preco de custo: %.2f ", mediaCusto);
		System.out.printf("Média de vendas: %.2f", mediaVendas);
		  scan.close();
	}
	
 
}

		
		
	