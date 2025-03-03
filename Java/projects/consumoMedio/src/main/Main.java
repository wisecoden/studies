package main;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
	  float distancia;
      float gasoline;
      double consumoMedio;
      
      Scanner scan = new Scanner(System.in);
      	Logger.getLogger(Main.class.getName()).log(Level.INFO, "Insira a distância percorrida: ");

      distancia = scan.nextFloat();
      System.out.println("Total de combustivel gasto");
      
      Logger.getLogger(Main.class.getName()).log(Level.INFO, "Total de combustivel gasto: ");
      gasoline = scan.nextFloat();
	    
      consumoMedio = distancia / gasoline;
	 
      System.out.printf("Consumo médio em km/h é: %.2f", consumoMedio);
      scan.close();
	}

}
