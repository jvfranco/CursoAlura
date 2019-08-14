package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TesteCursosComAlunos {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Java Coleções", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com coleções", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Pedro", "1254");
		Aluno a2 = new Aluno("Luis", "5896");
		Aluno a3 = new Aluno("Joao", "5874");
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		javaColecoes.getAulas().forEach(aula -> System.out.println(aula));
		javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		
//		alunos.add(new Aluno("Thiago", "6985"));
//		
//		javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));
		
		System.out.println(a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
			
		
		Aluno pedro = new Aluno("Pedro", "1254");
		
		System.out.println("Pedro está matriculado: " + javaColecoes.estaMatriculado(pedro));
		
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) { //enquanto tiver um proximo
			Aluno proximo = iterador.next();//pega esse proximo
			System.out.println(proximo);
		}

	}

}
