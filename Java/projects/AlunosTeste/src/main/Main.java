package main;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Aluno;

public class Main {

	public static void main(String[] args) {
	Aluno aluno = new Aluno("Pedro", 6.73 , 6.43);	
	 Logger.getLogger(Main.class.getName()).log(Level.INFO, aluno.getNome());
		System.out.println("Valor:" + aluno.getNota1());
		System.out.println("Valor:" + aluno.getNota2());
		System.out.println(calcularMedia(aluno.getNota1() , aluno.getNota2()));
		
	
		  
	}
public static double calcularMedia(double valor1, double valor2){
		return (valor1 + valor2)/2;
	}
  
}

