package main;


import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		String[] nomes = {"Emanuelle", "Ronaldo", "Messias"};
		float[][] notas = new float [3][4];
		
		float somaNotas = 0;
		float mediaAluno = 0;
		
		String situacaoAluno;
		
		for(int indice = 0; indice < 3; indice++){
			    
			
				for(int column = 0; column < 4; column++) {
				    notas[indice][column] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota n° " + (column+1) + " aluno: " + nomes[indice]));
				    somaNotas = somaNotas + notas[indice][column];
			}
			
			mediaAluno =  somaNotas /4;
			
			if(mediaAluno < 5.5) {
				situacaoAluno = "Reprovado";
			} else if(mediaAluno >= 5.5 && mediaAluno <= 7.5) {
				situacaoAluno = "Recuperação";
				
			}else {
				situacaoAluno = "Aprovado";
			}
			System.out.println("\n<---------- BOLETIM ----------->");
			System.out.println("Aluno:" + nomes[indice]);
			System.out.println("Notas");
			
			 
			for(int column1 = 0; column1 < 4; column1++) {
				System.out.println((column1 + 1) + "- " + notas[indice][column1]);
			}
					
			System.out.println("\nMédia: " + mediaAluno + " = " + situacaoAluno);
		}

	}

}


