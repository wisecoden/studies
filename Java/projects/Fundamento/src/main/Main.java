package main;

public class Main {
	public static void main(String[] args) {
		Pessoa aluno = new Pessoa();
        
		aluno.nome = "João";
		aluno.idade = 12;
		aluno.MostrarDados(aluno.nome, aluno.idade);
	}

}
