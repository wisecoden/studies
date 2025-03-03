package main;
import java.util.Date;

import model.Motorista;
import model.Vendedor;

public class Main {

	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor();
		vendedor.setNome("Eduardo");
		vendedor.setCpf("8228282");
		vendedor.setSalario(1000.0f);
		vendedor.setTotalVendas(10);
		vendedor.setComissaoVendas(10.0f);
		vendedor.setDataDeNascimento(new Date());
	
	System.out.println("O salario eh: " + vendedor.calcularsalario());
	
	Motorista motor = new Motorista();
	motor.setCpf("191839478");
	motor.setNome("Eduardo");
	}

}
