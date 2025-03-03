package main;

public class Main {

	public static void main(String[] args) {
		int[] vetorNumeros = new int[] {1, 2, 3, 4, 5, 6, 7,8, 9, 10};

		
		System.out.println("Sem For each");
			for(int i = 0; i < vetorNumeros.length; i++){
			System.out.println("Nr: " + vetorNumeros[i]);
		}
		
		System.out.println("Com For each");
			for(int listaNumeros : vetorNumeros){
			System.out.println("Nr: " + listaNumeros);
		}
		
	}

}
