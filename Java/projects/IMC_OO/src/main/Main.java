package main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
          Pessoa pessoa = new Pessoa(7.0f, 1.70f);
          Scanner scan = new Scanner(System.in);
          
               System.out.println("Digite o peso da pessoa");
               pessoa.setPeso(scan.nextFloat());
               System.out.println("Digite a altura da pessoa");
               pessoa.setAltura(scan.nextFloat());
               
               System.out.println("IMC= " + pessoa.calcularIMC());
               
               
               scan.close();
	}

}

