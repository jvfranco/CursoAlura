package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {

	public static void main(String[] args) {
		Set<String> nomes = Collections.EMPTY_SET;
		
		nomes.add("João");
		
		nomes.forEach(nome -> System.out.println(nome));

	}

}
