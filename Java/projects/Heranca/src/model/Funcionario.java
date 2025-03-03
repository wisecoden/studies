package model;

import java.util.Date;

public class Funcionario {
		private String nome;
		private String cpf;
		private Date dataDeNascimento;
		private float salario;



public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public Date getDataDeNascimento() {
	return dataDeNascimento;
}

public void setDataDeNascimento(Date dataDeNascimento) {
	this.dataDeNascimento = dataDeNascimento;
}

public float getSalario() {
	return salario;
}

public void setSalario(float salario) {
	this.salario = salario;
	}
}