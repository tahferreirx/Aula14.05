package Desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class ConjuntoDeNúmerosPositivos {
	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>(4);
		int numero = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for ( int i = 0; i <=4; i++) {
			System.out.println("Digite um número inteiro: ");
			numero = ler.nextInt();
			numeros.add(numero);
		}
		
		for ( int i = 0; i <= 4; i++) {
			if ( numeros.get(i) >= 0) {
				System.out.println(numeros.get(i) + " é positivo");
		}	else {
			System.out.println(numeros.get(i) + " é negativo");
		}
			
	}		
		ler.close();	
	}

	}


