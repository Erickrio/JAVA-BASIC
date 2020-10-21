package testeJava;

import javax.swing.JOptionPane;

public class Principal {
	
	
	public static void main (String [] args){
		
		Aluno a1= new Aluno();//instancia objeto 
		String nome = JOptionPane.showInputDialog("Entre c o nome");
		
	    a1.setNome(nome);
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(90);

		//cria objeto
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matemática");
		disciplina2.setNota(80);
		
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(97);
		
		//add o objeto na lista	
		a1.getDisciplina().add(disciplina1);
		a1.getDisciplina().add(disciplina2);
		a1.getDisciplina().add(disciplina3);
		
		
		System.out.println("A média é:"+a1.getMediaNota());
		System.out.println("resultado....:"+ (a1.getAlunoAprovado() ? "aprovado" : "reprovado"));
		System.out.println("resultado....:"+  a1.getAlunoAprovado2());
		
		System.out.println(a1.toString());
		
		
		//diferenciar e comparar objetos - Equals e HashCode 
		Aluno a2 = new Aluno();
		a2.setNome("joão");
		a1.setNome("joão");
		
		//para comparar sobscreva método hashcode e equals - class ALuno
		if (a1.equals(a2)){
			System.out.println("nomes iguais");
		} else {
			System.out.println("nomes diferentes");
		}
		
		
		
	}

}
