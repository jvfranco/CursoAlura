package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrada com um arquivo
		//entrada do arquivo em bytes
		FileInputStream fis = new FileInputStream("lorem.txt");
		//transformação dos bytes em caracteres
		InputStreamReader isr = new InputStreamReader(fis);
		//junção dos caracteres para leitura
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		
		br.close();

	}

}
