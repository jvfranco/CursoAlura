package br.com.alura;

public class Aluno {

	private String nome;
	private String numeroMatricula;
	
	public Aluno(String nome, String numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "Nome do Aluno: " + this.nome + ", Matricula: " + this.numeroMatricula;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroMatricula == null) ? 0 : numeroMatricula.hashCode());
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
		if (numeroMatricula == null) {
			if (other.numeroMatricula != null)
				return false;
		} else if (!numeroMatricula.equals(other.numeroMatricula))
			return false;
		return true;
	}
	
}
