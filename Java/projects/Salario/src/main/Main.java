package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nome;
		int salariofixo;
		double vendas = 0;
		double comissao;
			
	 
	    Scanner scan = new Scanner(System.in);
	     System.out.println("Insire seu nome, por favor");
	      nome = scan.nextLine();
	     System.out.println("Insire seu salario, por favor ");
	      salariofixo = scan.nextInt();
	     System.out.println("Insire o total de vendas efetuadas no mês, por gentileza");
	      vendas = scan.nextInt();
     
	      vendas = vendas * 0.15; 
	      
	      comissao = salariofixo + vendas;
		     System.out.println("");
		     System.out.println(nome);
		     System.out.println(salariofixo);
		     System.out.println(comissao);
	     
     scan.close();
	}
}
