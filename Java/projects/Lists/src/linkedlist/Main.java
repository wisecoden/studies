package linkedlist;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<>();
		
		cars.add("Volkswagen");
		cars.add("Porsche");
		
		//Adicionar no inicio
		cars.addFirst("Volvo");
		//add no final, default 
		cars.addLast("Ford");
		
		System.out.println(cars);
		
		//remove 1° posição  
		cars.removeFirst();
		System.out.println(cars);
		
		//remove última posição
		cars.removeLast();
		System.out.println(cars);
		
		
		System.out.println(cars.getFirst());
		System.out.println(cars.getLast());

	}

}
