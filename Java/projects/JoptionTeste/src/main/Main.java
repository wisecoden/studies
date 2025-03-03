package main;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Sua idade"));
		
		JOptionPane.showMessageDialog(null,"Sua idade: " + idade);
       
        JOptionPane.showMessageDialog(null, "Teste", "Atenção", 1, null);
	}

}
