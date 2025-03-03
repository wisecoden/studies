package model;
public class Alunos {
	private double nota1;
	private double nota2;
	private double nota3;
	public STATUS situacaoAluno;
 	public MATRICULADO situacaoMatriculado;
	
  public Alunos(){  
  }
  
  public Alunos(double nota1, double nota2, double nota3){
	 this.nota1 = nota1;
	 this.nota2 = nota2;
	 this.nota3 = nota3;
  }
  
public enum MATRICULADO{
	MATRICULADO,
	PENDENTE,
	RECUSADO
}
  
  public enum STATUS{
	  APROVADO,
	  REPROVADO
  }	
  
  public double calcularMedia(){ 
	  double mediaAluno = 0;
	  mediaAluno = (this.nota1 + this.nota2 + this.nota3) / 3;
	  
	  return mediaAluno;	  
  }
  
}
