package main;


public class Pessoa {
	private String nome;
	private int dataNascimento;
	private float altura;


public Pessoa(String nome,int dataNascimento, float altura) {
	this.nome = nome;
	this.dataNascimento = dataNascimento;
	this.altura = altura;
	
}


public int calcularIdade() {
	return 2022 - dataNascimento;
}
	
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getDataNascimento() {
	return dataNascimento;
}

public void setDataNascimento(int dataNascimento) {
	this.dataNascimento = dataNascimento;
}

public float getAltura() {
	return altura;
}

public void setAltura(float altura) {
	this.altura = altura;
}
}