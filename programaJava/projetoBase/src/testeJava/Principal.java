package testeJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.constantes.StatusAluno;

public class Principal {

	public static void main (String [] args){
		
		//instancia uma lista de alunos - aprovado,recuperação e reprovado
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		//Lista que dentro dela temos uma chave que identifica uma sequência de valores
		HashMap<String, List<Aluno>> maps = new HashMap();
		
		
		
		for(int qtd =1 ; qtd <=5;qtd++) {
		
		Aluno a1= new Aluno();//instancia objeto 
		String nome = JOptionPane.showInputDialog("Entre c o nome" +qtd);
        a1.setNome(nome);
		
        //tornando nota dinamica as disciplinas
        
		for (int i = 1; i <= 1; i++) {
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
			int continuarRemover = 0; // 0 - p entrar na condição do while
			int posicao = 1;
			while(continuarRemover ==0){
			//Pega a String do disciplinaRemover e converte para o indice a ser removido e passa o disciolinaRemover
			String disciplinaRemover = 
					JOptionPane.showInputDialog("QUal é a disciplina? 1 ao 4");
			a1.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue()-posicao );//intValue() - recebe o index
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "continuar remover");
		  } 
		}
		//final do for add esse aluno
		alunos.add(a1);
		
    }
		//inicializa os valores - HashMap
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
		for(Aluno aluno:alunos){
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)){
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else if (aluno.getAlunoAprovado2().equals(StatusAluno.RECUPERACAO)){
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else{
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
			
		}
		
		
		System.out.println("Lista dos Aprovados.");
		for(Aluno aluno: maps.get(StatusAluno.APROVADO)){
			System.out.println("Resultado"+aluno.getAlunoAprovado2() + "media de"+ aluno.getMediaNota() + "Nome"+ aluno.getNome());
		}
		
		
		System.out.println("Lista dos Reprovados.");
		for(Aluno aluno: maps.get(StatusAluno.REPROVADO)){
			System.out.println("Resultado"+aluno.getAlunoAprovado2() + "media de"+ aluno.getMediaNota());
		}
		
		
		System.out.println("Lista dos Recuperação.");
		for(Aluno aluno: maps.get(StatusAluno.RECUPERACAO)){
			System.out.println("Resultado"+aluno.getAlunoAprovado2() + "media de"+ aluno.getMediaNota());
		}
		
	}

}
