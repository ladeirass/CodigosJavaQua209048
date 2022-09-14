package aulas;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeIfElseSwitchcase {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		/*
		 * 
		 * String senhaSalva = "123321"; String usuarioSalvo = "Murica";
		 * 
		 * String senha; String usuario;
		 * 
		 * System.out.println("Entre com o nome do usuario: "); usuario =
		 * leia.nextLine();
		 * 
		 * System.out.println("Digite sua senha: "); senha = leia.nextLine();
		 * 
		 * 
		 * if (usuarioSalvo.equals(usuario)) {
		 * 
		 * } else {
		 * 
		 * }
		 * 
		 * if(senhaSalva.equals(senha)) {
		 * System.out.println("Login efetuado com sucesso"); }else {
		 * System.out.println("usuario e senha estão incorretos!"); }
		 * 
		 */

		/*
		 * Exercicio 2
		 * 
		 * double salarioBruto = 0.0; double salarioLiquido = 0.0; double irpf = 0.05;
		 * double inss = 0.11;
		 * 
		 * System.out.println("Verificando seu bônus");
		 * 
		 * System.out.println("Digite seu salario bruto: "); salarioBruto =
		 * leia.nextDouble();
		 * 
		 * salarioLiquido = salarioBruto - ((salarioBruto * inss) + (salarioBruto *
		 * irpf));
		 * 
		 * if(salarioLiquido < 1200.00) { salarioLiquido += salarioLiquido * 0.05; }else
		 * if(salarioLiquido > 3500.00) { salarioLiquido += salarioLiquido * 0.02; }
		 * 
		 * System.out.println("Salario atualizado: " + salarioLiquido);
		 */
		/*
		 * Exercício Switch/Case{
		 */

		int selecionado = 0;
		int quantidade = 0;

		System.out.println("CARDAPIO\n");

		System.out.println("1 - sanduiche natureba\n" + "2 - Sanduba Bomba\n" + "3 - Coxinha de Jaca\n"
				+ "4 - Feijoada vegetariana\n");

		System.out.print("Escolha o numero do seu lanche: ");
		selecionado = leia.nextInt();

		System.out.print("Entre com a quantidade: ");
		quantidade = leia.nextInt();

		switch (selecionado) {
		case 1:
			System.out.println("Opcão selecionada: Sanduiche natureba");
			System.out.println("Quantidade: " + quantidade);
			break;

		case 2:
			System.out.println("Opcão selecionada: Sanduba Bomba");
			System.out.println("Quantidade: " + quantidade);

		case 3:
			System.out.println("Opcão selecionada: Coxinha de Jaca");
			System.out.println("Quantidade: " + quantidade);
			break;

		case 4:
			System.out.println("Opcão selecionada: Feijoada vegetariana");
			System.out.println("Quantidade: " + quantidade);

		default:
			System.out.println("Opção não econtrada!");
			break;
		}

		/*
		 * Faça um programa que peça ao usuário para escolher o item de um menu e a
		 * quantidade: (apenas 1 item)
		 * 
		 * 1 - sanduiche natureba 2 - Sanduba Bomba 3 - Coxinha de Jaca 4 - Feijoada
		 * vegetariana
		 */
		/*
		 * int numero = 0;
		 * 
		 * System.out.print("entre com um número: "); numero = leia.nextInt();
		 * 
		 * switch (numero) { case 1: System.out.println("Você digitou o numero 1");
		 * break;
		 * 
		 * case 2: System.out.println("Voce digitou  o numero 2"); break;
		 * 
		 * default: System.out.println("Você digitou um numero maior que 2" +
		 * "ou voê digitou uma letra"); break; }
		 * 
		 * System.out.println("Saiu do Switch case!");
		 */
		leia.close();
	}
}
