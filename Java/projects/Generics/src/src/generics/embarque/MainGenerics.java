package src.generics.embarque;

import java.util.Scanner;

import src.generics.controller.AeronavesGenerics;

public class MainGenerics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		AeronavesGenerics<Integer> air = new AeronavesGenerics<>();
		System.out.println("Digite o n° de de aeronaves: ");
		int nrAeronaves = scan.nextInt();
		
		for(int i = 0; i < nrAeronaves; i++) {
			Integer nrVoo = scan.nextInt();
			air.addVoo(nrVoo);
		}
		
		
		System.out.println( "O primeiro a Decolar é: " + air.primeiroVoo());
		air.listaVoos();
		scan.close();
	}

}
