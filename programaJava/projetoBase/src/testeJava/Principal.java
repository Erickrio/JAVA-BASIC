package testeJava;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main (String [] args){
		
		//instancia uma lista de alunos
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for(int qtd =1 ; qtd <=1;qtd++) {
		
		Aluno a1= new Aluno();//instancia objeto 
		String nome = JOptionPane.showInputDialog("Entre c o nome" +qtd);
        a1.setNome(nome);
		
        //tornando nota dinamica das disciplinas
        
		for (int i = 1; i <= 4; i++) {
			String nomeDisciplina = JOptionPane.showInputDialog("NOME da disciplina"+i+"?");
			String notaDisciplina = JOptionPane.showInputDialog("NOTA disciplina"+i+"?");
			Disciplina disciplina = new Disciplina();
			//seta a disciplina e informa o que o usu�rio digitou
			disciplina.setDisciplina(nomeDisciplina);
			//pega a disciplina e seta a nota
			//faz a convers�o do tipo double
			disciplina.setNota(Double.valueOf(notaDisciplina));
			//pega a diciplina add
			a1.getDisciplina().add(disciplina);
			
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		if(escolha == 0){ // public static final int YES_OPTION = 0;
			int continuarRemover = 0; // 0 - p entrar na condi��o do while
			int posicao = 1;
			while(continuarRemover ==0){
			//Pega a String do disciplinaRemover e converte para o indice a ser removido e passa o disciolinaRemover
			String disciplinaRemover = 
					JOptionPane.showInputDialog("QUal � a disciplina? 1 ao 4");
			a1.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue()-posicao );//intValue() - recebe o index
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "continuar remover");
		  } 
		}
		//final do for add esse aluno
		alunos.add(a1);
		
    }
		//percorrendo listas pelas posi��es.[0 a 1]
		for (int pos =0;pos < alunos.size();pos++){
			//pega a lista de alunos e recupera(get por posi��o)
			Aluno aluno = alunos.get(pos);//p cada posi��o do tamanho da lista,pega o aluno.
			System.out.println("ALuno"+aluno.getNome());
			System.out.println("media do aluno"+aluno.getMediaNota());
			System.out.println("media do aluno"+aluno.getAlunoAprovado2());
			System.out.println("*******************************************************************************");
			
			//aluno da posi��o para a disciplina
			for (Disciplina disc : aluno.getDisciplina().size()) {
				System.out.println("Mat�ria = "+disc.getDisciplina()+"Nota="+disc.getDisciplina());
				
			}
		}
		
		
/*	
 * 
 * 
 * 
 * //percorre a lista de alunos
		for (Aluno a1 : alunos) {

			// procurando um aluno na lista e calcula a m�dia
			if (a1.getNome().equalsIgnoreCase("erick")) {
				alunos.remove(a1);//procura e remove o aluno da lista
				break;//condi��o sendo verdadeira,sai imediatamente
			} else {
				System.out.println("A m�dia �:" + a1.getMediaNota());
				System.out.println("resultado....:" + (a1.getAlunoAprovado() ? "aprovado" : "reprovado"));
				System.out.println("resultado....:" + a1.getAlunoAprovado2());
				System.out.println(a1.toString());
			}
		}
		
		
		for (Aluno a1 : alunos) {
			System.out.println("Alunos que sobraram na Lista");
			System.out.println(a1.getNome());
			System.out.println("Suas mat�rias s�o");
			//percorre disciplina por aluno
			for (Disciplina disciplina : a1.getDisciplina() ) {
				System.out.println(disciplina.getDisciplina());
			}
		}
		
 * 
 * 
 * 
 * //para comparar sobscreva m�todo hashcode e equals - class ALuno
		if (a1.equals(a2)){
			System.out.println("nomes iguais");
		} else {
			System.out.println("nomes diferentes");
		}
		
		//diferenciar e comparar objetos - Equals e HashCode 
		Aluno a2 = new Aluno();
		a2.setNome("jo�o");
		a1.setNome("jo�o");
		
		System.out.println("A m�dia �:"+a1.getMediaNota());
			System.out.println("resultado....:"+ (a1.getAlunoAprovado() ? "aprovado" : "reprovado"));
			System.out.println("resultado....:"+  a1.getAlunoAprovado2());	
			System.out.println(a1.toString());
		

   */
		
		
	}

}
