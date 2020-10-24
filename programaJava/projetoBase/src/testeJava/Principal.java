package testeJava;

import javax.swing.JOptionPane;

public class Principal {
	
	
	public static void main (String [] args){
		
		Aluno a1= new Aluno();//instancia objeto 
		String nome = JOptionPane.showInputDialog("Entre c o nome");
        a1.setNome(nome);
		
        //tornando nota dinamica das disciplinas
        
		for (int i = 1; i <= 4; i++) {
			String nomeDisciplina = JOptionPane.showInputDialog("NOME da disciplina"+i+"?");
			String notaDisciplina = JOptionPane.showInputDialog("NOTA disciplina"+i+"?");
			Disciplina disciplina = new Disciplina();
			//seta a disciplina e informa o que o usuário digitou
			disciplina.setDisciplina(nomeDisciplina);
			//pega a disciplina e seta a nota
			//faz a conversão do tipo double
			disciplina.setNota(Double.valueOf(notaDisciplina));
			//pega a diciplina add
			a1.getDisciplina().add(disciplina);
			
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		if(escolha == 0){ // public static final int YES_OPTION = 0;
			//Pega a String do disciplinaRemover e converte para o indice a ser removido e passa o disciolinaRemover
			String disciplinaRemover = 
					JOptionPane.showInputDialog("QUal é a disciplina? 1 ao 4");
			a1.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue()-1);//intValue() - recebe o index
		}
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
