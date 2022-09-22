package br.com.senaibrasilia.projetoinicial;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Testando Terminal Java..vamos abrir um JFrame");
//		Aqui eu crio o objeto
		Login l = new Login("Turma Java");
//		O JFrame ficará visível
		l.setVisible(true);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		Vetor

		int[] numeros = new int[4]; // estático
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 20;
		numeros[3] = 20;

		int soma = 0;
		for (int i = 0; i < 4; i++) { // estático - vc já sabe o valor
			System.out.println(i); // indice
			System.out.println(numeros[i]); // vetor[i] - indexado a i
		soma += numeros[i];
		}
		System.out.println(soma);
	}
}
