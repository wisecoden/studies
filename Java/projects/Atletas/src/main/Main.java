package main;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		int idade;
	 
		Scanner scan = new Scanner(System.in);
		Logger.getLogger(Main.class.getName()).log(Level.INFO, "Insira sua idade: ");
		 idade = scan.nextInt();
         
		if(idade >= 5 && idade <= 7 ) {
			Logger.getLogger(Main.class.getName()).log(Level.INFO, "Infantil A");
		}else if(idade >= 8 && idade < 11){
			Logger.getLogger(Main.class.getName()).log(Level.INFO, "Infantil B");
		}else if(idade >= 11 && idade <= 13){
			Logger.getLogger(Main.class.getName()).log(Level.INFO, "Juvenil A");
		}else if(idade >= 14 && idade <= 17){
			Logger.getLogger(Main.class.getName()).log(Level.INFO, "Juvenil B");
		}else if(idade >= 18 && idade <= 25){
			Logger.getLogger(Main.class.getName()).log(Level.INFO, "Sênior");
			
		}else {  
			Logger.getLogger(Main.class.getName()).log(Level.INFO, "Fora da faixa etária");
		       
		      }
	scan.close();
  }
}
