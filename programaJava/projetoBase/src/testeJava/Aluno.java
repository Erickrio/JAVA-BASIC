package testeJava;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

private String nome;

//referencia disciplina  - Lista disciplina
private List<Disciplina> disciplinas = new ArrayList();


	public List<Disciplina> getDisciplina() {
	return disciplinas;
}


public void setDisciplina(List<Disciplina> disciplina) {
	this.disciplinas = disciplina;
}


	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//pega itém por item e percorre a lista 
	public double getMediaNota() {
		double somaNotas = 0.0;
		for (Disciplina disciplina : disciplinas) {

			somaNotas += disciplina.getNota();
		}
		//torna dinâmico p quantos objetos estiver na lista
		return somaNotas / disciplinas.size();
	}
	
	
	public boolean getAlunoAprovado(){
		double media = this.getMediaNota();
		if (media >= 70){
			return true;
		}else{
			return false;
		}
	}
	
	public String getAlunoAprovado2(){
		double media = this.getMediaNota();
		if (media >= 70){
			return "Aprovado";
		}else{
			return "reprovado";
		}
	}






	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", disciplina=" + disciplinas + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	
	
	
	
	
}
