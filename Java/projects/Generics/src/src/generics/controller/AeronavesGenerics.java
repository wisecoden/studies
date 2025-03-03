package src.generics.controller;
import java.util.ArrayList;
import java.util.List;

public class AeronavesGenerics<T> {
	private List<T> listaAeronaves = new ArrayList<>();
	
	public void addVoo(T nrVoo) {
		listaAeronaves.add(nrVoo);
	}
      
	public T primeiroVoo(){
		if(listaAeronaves.isEmpty()) {
			throw new IllegalStateException("Lista Está vazia");
		}
		return listaAeronaves.get(0);
	}
	 public void listaVoos(){
	    	System.out.print("[");
	    	if(!listaAeronaves.isEmpty()){
	    		System.out.print(listaAeronaves.get(0));
	    	}
	    	for(int i = 1; i < listaAeronaves.size(); i++) {
	    		System.out.print(" - " + listaAeronaves.get(i));
	    	}
	    	System.out.print("]");
	    }
}
