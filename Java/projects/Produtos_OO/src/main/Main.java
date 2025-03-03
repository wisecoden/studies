package main;

import model.Invoice;

public class Main {

	public static void main(String[] args) {
		Invoice produto = new Invoice(1, "Teclado Gamer", 10, - 10.0f);
		System.out.println("Valor: " + produto.getInvoiceAmount());
	}

}
