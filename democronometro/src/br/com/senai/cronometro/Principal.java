package br.com.senai.cronometro;

import javax.swing.SwingUtilities;

public class Principal {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Cronometro();
			}

		}

		);

	}

}
