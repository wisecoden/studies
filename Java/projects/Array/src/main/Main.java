package main;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		String[] paises = new String[4]; 
		
		for(int indice = 0; indice < paises.length; indice++) {
           paises[indice] = JOptionPane.showInputDialog("Informe um país");   
			
	}
		for(String listapaise: paises) {
			
			System.out.println(listapaise);
		}
  }
}
