package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestePerformance {

	public static void main(String[] args) {
		Collection<Integer> numeros = new ArrayList<>();
		
		long inicio = System.currentTimeMillis();
		
		long inicioInsert = System.currentTimeMillis();
		for (int i = 0; i <= 100000; i++) {
			numeros.add(i);
		}
		long fimInsert = System.currentTimeMillis();
		
		long inicioBusca = System.currentTimeMillis();
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
		long fimBusca = System.currentTimeMillis();
		
		System.out.println("Insercao: " + (fimInsert - inicioInsert));
		System.out.println("Busca: " + (fimBusca - inicioBusca));
		
		long fim = System.currentTimeMillis();
		
		long tempoDeExecucao = fim - inicio;
		
		System.out.println("Tempo Gasto: " + tempoDeExecucao);
		
		Collection<Integer> numeros2 = new HashSet<>();
		
		long inicio2 = System.currentTimeMillis();
		
		long inicioInsert2 = System.currentTimeMillis();
		for (int i = 0; i <= 100000; i++) {
			numeros2.add(i);
		}
		
		long fimInsert2 = System.currentTimeMillis();
		
		long inicioBusca2 = System.currentTimeMillis();
		
		for (Integer numero : numeros2) {
			numeros2.contains(numero);
		}
		long fimBusca2 = System.currentTimeMillis();
		
		
		System.out.println("Insercao: " + (fimInsert2 - inicioInsert2));
		System.out.println("Busca: " + (fimBusca2 - inicioBusca2));
		
		long fim2 = System.currentTimeMillis();
		
		long tempoDeExecucao2 = fim2 - inicio2;
		
		System.out.println("Tempo Gasto: " + tempoDeExecucao2);

	}

}
