package main;

import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		int idade;
		String nome = "Codre";
		char sexo = 'F';
		byte ponto = 0;
		boolean cadastrado = false;
		
		JOptionPane.showMessageDialog(null, nome);
		JOptionPane.showMessageDialog(null, sexo);

		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade ?"));
		JOptionPane.showMessageDialog(null, idade);
	
		JOptionPane.showMessageDialog(null, ponto);
		
		JOptionPane.showConfirmDialog(null, cadastrado);
	}
}