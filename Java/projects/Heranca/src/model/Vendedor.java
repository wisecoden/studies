package model;


public class Vendedor extends Funcionario{

	  private int totalVendas;
	  private float comissaoVendas;
  


public Vendedor() {
	super();
}

public float calcularsalario() {
  return super.getSalario() + (this.comissaoVendas + totalVendas);
}

public int getTotalVendas() {
	return totalVendas;
}

public void setTotalVendas(int totalVendas) {
	this.totalVendas = totalVendas;
}

public float getComissaoVendas() {
	return comissaoVendas;
}

public void setComissaoVendas(float comissaoVendas) {
	this.comissaoVendas = comissaoVendas;
	}
}