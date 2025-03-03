package model;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Canino implements InterfacesAnimal{

	@Override
	public void animalLatir() {		
    Logger.getLogger(Canino.class.getName()).log(Level.INFO, "Au Au Au");
	}

}
