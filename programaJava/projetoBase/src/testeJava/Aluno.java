package testeJava;

public class Aluno {

private String nome;

//referencia disciplina 
private Disciplina disciplina = new Disciplina();


public Disciplina getDisciplina() {
	return disciplina;
}


public void setDisciplina(Disciplina disciplina) {
	this.disciplina = disciplina;
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

	 
	public double getMediaNota(){
		return (disciplina.getNota1() + disciplina.getNota2() + 
				disciplina.getNota3() + disciplina.getNota4()) /4 ;
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
		return "Aluno [nome=" + nome + ", disciplina=" + disciplina + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
}
