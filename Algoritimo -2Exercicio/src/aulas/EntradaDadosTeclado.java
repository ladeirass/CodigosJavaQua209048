package aulas;

import java.util.Scanner;

public class EntradaDadosTeclado {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade = 0;
		char genero;
		double saldo = 0;
		
		System.out.print("Digite seu nome: ");
		nome = leia.next();
		
		System.out.print("Quantos anos você tem: ");
		idade = leia.nextInt();
		
		System.out.print("Gênero que se indentifica: ");
		genero = leia.next().charAt(0);
		
		System.out.print("Qual é o seu saldo: ");
		saldo = leia.nextDouble();
		
		System.out.println(nome + ", " + idade +" anos de idade, possui em sua "
				+ "conta um total de " + saldo + " reais.");
		
		
		
		leia.close();
		
	}
}
