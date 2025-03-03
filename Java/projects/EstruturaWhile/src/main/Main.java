package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int totalAlunos = 3;
		Scanner scan = new Scanner(System.in);
	 
			while (totalAlunos > 2) {
				System.out.println("Escreva o nome do aluno");
				String nome = scan.next();
				System.out.println("Escreva a idade do aluno");
				int idadeAluno = scan.nextInt();
				
				System.out.println("O nome do aluno eh: " + nome + " A idade do aluno eh: " + idadeAluno);
				totalAlunos--;
			
			}
	 
		scan.close(); 

   }
}