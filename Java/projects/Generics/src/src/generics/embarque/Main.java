package src.generics.embarque;
import java.util.Scanner;

import src.generics.controller.Aeronaves;

public class Main {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
     
	Aeronaves air = new Aeronaves();
	System.out.println("Digite o n° de aeronaves: ");
	int nrAeronaves = scan.nextInt();
	
	for(int i = 0; i < nrAeronaves; i++) {
		int nrVoo = scan.nextInt();
		air.addVoo(nrVoo);
	}
	
	System.out.println("O primeiro que vai decolar é o n°: " + air.primeiroVoo());
	air.listaVoos();
	scan.close();
	
	
	
	}

}
