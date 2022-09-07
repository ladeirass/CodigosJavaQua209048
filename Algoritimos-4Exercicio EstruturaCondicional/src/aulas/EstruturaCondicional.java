package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		
//		Exercício 1 
		/*
		 * int num1 = 0; int num2 = 0;
		 * 
		 * System.out.print("Digite um numero: "); num1 = leia.nextInt();
		 * 
		 * System.out.print("Digite outro numero: "); num2 = leia.nextInt();
		 * 
		 * if (num1 > num2) { System.out.printf("O maior numero é %d: ", num1); } else {
		 * System.out.printf("O maior numero é %d: ", num2);
		 */
//		Exercício 2
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		System.out.print("Digite um número: ");
		num1 = leia.nextInt();

		System.out.print("Digite outro número: ");
		num2 = leia.nextInt();

		System.out.print("Digite o terceiro número: ");
		num3 = leia.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.print("O numero " + num1 + " é o maior");
		} else if (num2 > num3) {
			System.out.println("O numero " + num2 + " é o maior");
		}else {
			System.out.println("O número " + num3 + " é o maior");
		}

		leia.close();

	}

}
