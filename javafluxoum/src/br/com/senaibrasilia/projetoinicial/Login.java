package br.com.senaibrasilia.projetoinicial;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

	private JLabel lblUsuario;
	private JLabel lblSenha;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;
	private JButton btnLogar;
	private FlowLayout layout;
	LocalDate localDate = LocalDate.now();
//	private Container container;

	public Login(String titulo) {
		super();
		layout = new FlowLayout();
//		container = getContentPane();
		btnLogar = new JButton("Logar");
		lblUsuario = new JLabel("Usuário");
		lblSenha = new JLabel("Senha");
		txtUsuario = new JTextField(40);
		txtSenha = new JPasswordField(40);

		add(lblUsuario);
		add(txtUsuario);
		add(lblSenha);
		add(txtSenha);

		add(btnLogar);
		setLayout(layout);
		btnLogar.addActionListener(this);
		setSize(800, 600);
		DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate hora = LocalDate.now();
		setTitle(titulo + "-" + localDate.format(formatadorBarra));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String usuario = "romulo";
		String senha = "123456";
		String strPass = new String(txtSenha.getPassword()).trim();
		
		if(txtUsuario.getText().equals(usuario) && strPass.equals(senha)){
			JOptionPane.showMessageDialog(null, "Usuário Logado");
		} else {
			JOptionPane.showMessageDialog(null, "Usuário Invalido");
		}
	}
}
