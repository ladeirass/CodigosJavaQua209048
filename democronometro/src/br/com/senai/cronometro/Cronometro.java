package br.com.senai.cronometro;

import java.awt.*; // gerenciador de layout		
import java.awt.event.*; // acesso aos eventos (ouvintes)
import javax.swing.*; // componentes visuais
import java.util.*; // Calendar - utilizado para obter a hora do sistema

/**
 * 
 * 
 * 
 * @author Felipe ladeira
 * @category Desktop Development
 * 
 *
 */

public class Cronometro implements ActionListener {
	JLabel jlab;
	long start; // contém a hora inicial em milissegundos

	// Criando os dois botões
	JButton btnStart = new JButton("Start");
	JButton btnStop = new JButton("Stop");

	// Adicionando ouvintes de ação
	public Cronometro() {
		// Criar um contêiner JFrame
		// Um componente que pode receber outro componente
		JFrame jfrm = new JFrame("SENAI - Escola Java");
		
		//Intânciando o JLabel
		jlab = new JLabel("Pressione Start para iniciar o tempo");
		
		
		
		// Adicionar os ouvintes de ação
		btnStart.addActionListener(this);
		btnStop.addActionListener(this);

		// Especificar FlowLayout como gerenciador de layout
		jfrm.setLayout(new FlowLayout());

		// Adicionar os componentes dentro do container
		jfrm.add(btnStart);
		jfrm.add(btnStop);
		jfrm.add(jlab);
		
		// Fornecer um tamanho inicial para o quadro (frame)
		jfrm.setSize(230, 90);
		jfrm.setVisible(true);

		// Encerrar quando o usuário fecha o aplicativo
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		//Item A - Obter a hora atual do sistema  
		Calendar cal = Calendar.getInstance();
		
		//Item B -Armazenar a hora inicial  
		if (e.getActionCommand().equals("Start")) {
			start = cal.getTimeInMillis();
			jlab.setText("Cronômetro esta em execução!");
		}else {
		//Item  caucular o tempo decorrido
			jlab.setText("O tempo decorrido foi:" + (double)(cal.getTimeInMillis()-start)/1000);
		}
		
		 
	}

}
