package br.com.alura.model.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.alura.model.Cliente;
import br.com.alura.model.Conta;
import br.com.alura.model.ContaCorrente;
import br.com.alura.model.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);	
		
		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		
		System.out.println("------------------------");
		
//		ComparadorNumeroConta comparador = new ComparadorNumeroConta();
//		lista.sort(comparador);
		
		//Classes anônimas, o java gera uma classe para método		
		lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
		
		Comparator<Conta> comp = (Conta c1, Conta c2) -> {
			return c1.getTitular().getNome().compareTo(c2.getTitular().getNome());
		};
		
		lista.forEach(conta -> System.out.println(conta));
	}
		
		
}
//	class ComparadorNumeroConta implements Comparator<Conta> {
//
//		@Override
//		public int compare(Conta c1, Conta c2) {
//			
//			return Integer.compare(c1.getNumero(), c2.getNumero());
//			
//			Qualquer método que retorne -1, 0 ou 1 serve como comparador para o sort.			
//			return c1.getNumero() - c2.getNumero();
//			if (c1.getNumero() < c2.getNumero()) {
//				return -1;
//			}
//			if (c1.getNumero() > c2.getNumero()) {
//				return 1;
//			}
//			return 0;
//		}
//	}	
//class ComparadorNomeConta2 implements Comparator<Conta>{
//
//	@Override
//	public int compare(Conta c1, Conta c2) {
//		return c1.getTitular().getNome().compareTo(c2.getTitular().getNome());
//	}
//	
//}