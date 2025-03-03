package arraylist;

import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		ArrayList <String> carros = new ArrayList<>();
		//Adicionar elementos na ArrayList
			carros.add("Fox");
			carros.add("Gol");
		
			
	    System.out.println(carros.get(0));
	    
		System.out.println(carros);
	   //Substituição de elemento na posição x 
			carros.set(1, "Jetta");
		System.out.println(carros);
		//Eliminar Elemento 
			carros.remove("Fox");
		System.out.println(carros);
		//Adicionar com input 
			carros.add(JOptionPane.showInputDialog("Digite o nome do Carro"));
		System.out.println(carros);
		
	//Comando Limpar 
		
	// carros.clear();
	// System.out.println(carros);
	
	//Verificar se está vazio 
	// if(carros.isEmpty()) { 
	// System.out.println("Vetor está vazio, ora");
     
	//Verificar se contem, se sim varrer pelo tamanho, enocntrado substituir na posição e parar
    //senao, imprimir que não foi encontrado argumento 
     if (carros.contains("Jetta")) {
    	 for(int index = 0; index < carros.size(); index++) {
    		 if("Jetta".equals(carros.get(index))){
    			 carros.set(index, "Passat");
    			 break;
    		 } 
    	 }  	
     }else {
		 System.out.println("Argumento Não encontrado");
	 }
     	System.out.println(carros);
  }
	
}
     
