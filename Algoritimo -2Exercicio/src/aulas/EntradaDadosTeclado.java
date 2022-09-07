package aulas;

import java.util.Scanner;

public class EntradaDadosTeclado {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome;
		int idade = 0;
		char genero;
		double saldoConta = 0.0;

		System.out.print("Digite seu nome: ");
		nome = leia.next();

		System.out.print("Quantos anos você tem: ");
		idade = leia.nextInt();

		System.out.print("Gênero que se indentifica: ");
		genero = leia.next().charAt(0);

		System.out.print("Qual é o seu saldo: ");
		saldoConta = leia.nextDouble();

		System.out.println(
				nome + ", " + idade + " anos de idade, se indenfica com genêro " + genero + ", possui em sua " + "conta um total de " + "R$" + saldoConta);

		leia.close();

	}
}
