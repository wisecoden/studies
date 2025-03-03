package main;
import model.Alunos;
import model.Alunos.MATRICULADO;
import model.Alunos.STATUS;

public class Main {

	public static void main(String[] args) {
		Alunos aluno = new Alunos(8, 8, 8);
        double mediaAluno = aluno.calcularMedia();
        
        if(mediaAluno >= 7) {
        	aluno.situacaoAluno = STATUS.APROVADO;
        } else {
        	aluno.situacaoAluno = STATUS.REPROVADO;
        }
        
        System.out.println( "A média do Aluno é: " + mediaAluno + " está " + aluno.situacaoAluno);
        
        aluno.situacaoMatriculado = MATRICULADO.PENDENTE;
        
        System.out.print("A matricula do aluno se encontra: " + aluno.situacaoMatriculado);
	}
	
}
