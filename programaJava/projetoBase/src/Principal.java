package testeJava;

import javax.swing.JOptionPane;

public class Principal {
	
	
	public static void main (String [] args){
		
		Aluno a1= new Aluno();//instancia objeto 
		String nome = JOptionPane.showInputDialog("Entre c o nome");
		String nota1 = JOptionPane.showInputDialog("Entre c a primeira nota");
		String nota2 = JOptionPane.showInputDialog("Entre c a segunda nota");
		String nota3 = JOptionPane.showInputDialog("Entre c a terceira nota");
		String nota4 = JOptionPane.showInputDialog("Entre c a quarta nota");
		String disciplina1 = JOptionPane.showInputDialog("Entre c a disciplina1");

	
	    a1.setNome(nome);
		a1.getDisciplina().setNota1(Double.parseDouble(nota1));
		a1.getDisciplina().setNota2(Double.parseDouble(nota2));
		a1.getDisciplina().setNota3(Double.parseDouble(nota3));
		a1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		a1.getDisciplina().setDisciplina1(disciplina1);
		
	
		
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
