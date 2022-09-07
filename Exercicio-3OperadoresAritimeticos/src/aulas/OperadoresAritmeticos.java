package aulas;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		/*
		int numero1 = 0;
		int numero2 = 0;
		int soma = 0;
		double nota = 0;
		
		 * System.out.print("Digite um número: "); numero1 = leia.nextInt();
		 * 
		 * System.out.println("Digite um segundo número: "); numero2 = leia.nextInt();
		 * 
		 * soma = numero1 + numero2;
		 * 
		 * System.out.println("A soma dos dois números: "+ soma);
		 * 
		 * leia.close();
		 */
		/*
		
		//Exercicio 2		
		double nota1 = 0;
		double nota2 = 0.0;
		double nota3 = 0.0;
		double nota4 = 0.0;
		double media = 0.0;

		System.out.print("Digite a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = leia.nextDouble();
		System.out.print("Digite a quarta nota: ");
		nota4 = leia.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("Sua media final foi: " + media);
		*/
		
		//Exercicio 3
		/*double ganhoHora = 0.0; 
		int horasTrabalhadas = 0; 
		double salario = 0;
		
		System.out.print("Entre com o valor da hora trbalhada: ");
		ganhoHora = leia.nextDouble();
				 
		System.out.print("Quanta horas você trabalhou: ");
		horasTrabalhadas = leia.nextInt();
				  
		salario = ganhoHora * horasTrabalhadas;
		
		System.out.println("O valor do seu salrio foi de: " + salario);
		*/
		double tempF = 0.0;
		double tempC = 0.0;
		

		System.out.print("Digite a temperatura em Fahrenheit: ");
		tempF = leia.nextDouble();

		tempC = 5 * ((tempF - 32) / 9);

		System.out.printf("A temperatura em Celsius é de: %.2f", tempC);

		leia.close();
		 
	}

}
