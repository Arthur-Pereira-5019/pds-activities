package art5019.telas.um;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Tela1 {

	private JFrame frame;
	private JTextField campoNome;
	private JLabel lblNewLabel;
	private JLabel mostrarNome;
	private JPasswordField senha;
	private JButton btnNewButton;
	
	private Character[] aSenha = {'A'};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 window = new Tela1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JLabel labelSenha = new JLabel("Senha:");
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		campoNome = new JTextField();
		campoNome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(campoNome.getText().equals("A")) {
						senha.setEnabled(true);
						btnNewButton.setEnabled(true);
						labelSenha.setEnabled(true);
						btnNewButton.requestFocus();
					}else {
						mostrarNome.setText("Usuário Inexistente");
					}
				}
			}
		});
		campoNome.setBounds(129, 65, 173, 23);
		frame.getContentPane().add(campoNome);
		campoNome.setColumns(10);
		
		lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(10, 45, 109, 54);
		frame.getContentPane().add(lblNewLabel);
		
		mostrarNome = new JLabel("");
		mostrarNome.setBounds(23, 189, 137, 23);
		frame.getContentPane().add(mostrarNome);
		
		senha = new JPasswordField();
		senha.setEnabled(false);
		senha.setBounds(129, 118, 173, 20);
		frame.getContentPane().add(senha);
		
		labelSenha.setEnabled(false);
		labelSenha.setFont(new Font("Tahoma", Font.PLAIN, 22));
		labelSenha.setBounds(10, 110, 109, 25);
		frame.getContentPane().add(labelSenha);
		
		btnNewButton = new JButton("MOSTRAR");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(senha.getText().equals("A")) {
					mostrarNome.setText("Acertou");
				}else {
					mostrarNome.setText("Senha Incorreta");
				}
			}
		});
		btnNewButton.setBounds(170, 189, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
