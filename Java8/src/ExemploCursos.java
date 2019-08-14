import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso {
	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
	
	@Override
	public String toString() {
		return "Curso: " + this.nome + ", Total de alunos: " + this.alunos;
	}

}

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("Javascript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));		
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		cursos.forEach(System.out::println);
		
		System.out.println("-------------------");
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.forEach(System.out::println);
		
		System.out.println("-------------------");
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.map(Curso::getAlunos) //mapeia pelo numeros de alunos
			.forEach(System.out::println);
		
		System.out.println("-------------------");
		int soma = cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.mapToInt(Curso::getAlunos)
				.sum();
		
		System.out.println(soma);
		
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
	
//		Qndo a stream utiliza o metodo find retorna um valor tipo Optional<>
//		no qual característica para tratamento de retornos null
//		utilizando o metodo ifpresente, casa haja algum retorno, o imprime,
//		caso não haja, não executará nada. Optional<Curso> optionalCurso = 
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.findAny()
			.ifPresent(System.out::println);
		System.out.println("---------------");
		
//		collect trasforma a stream novamente em um list, e devolve a uma variavel ou
//		para a própria lista
		
		List<Curso> collect = cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toList());
		
		
		collect.forEach(System.out::println);
		
		System.out.println("---------------");
		
//		Map<String, Integer> collect2 = 
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.collect(Collectors.toMap(
				c -> c.getNome(), 
				c -> c.getAlunos()))
		.forEach((nome, aluno) -> System.out.println(nome + " tem " + aluno + " alunos."));
		
		System.out.println("---------------");
		
		double average = cursos.stream()
			.mapToInt(c -> c.getAlunos())
			.average()
			.getAsDouble();
		
		System.out.println("A média de alunos é: " + average);
	}
}
