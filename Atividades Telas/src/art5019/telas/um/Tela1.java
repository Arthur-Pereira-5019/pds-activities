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

public class Tela1 {

	private JFrame frame;
	private JTextField campoNome;
	private JLabel lblNewLabel;
	private JLabel mostrarNome;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		campoNome = new JTextField();
		campoNome.setBounds(129, 60, 86, 20);
		frame.getContentPane().add(campoNome);
		campoNome.setColumns(10);
		
		JButton btnNewButton = new JButton("MOSTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostrarNome.setText(campoNome.getText());
			
			}
		});
		btnNewButton.setBounds(165, 161, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 45, 109, 54);
		frame.getContentPane().add(lblNewLabel);
		
		mostrarNome = new JLabel("");
		mostrarNome.setBounds(33, 189, 46, 14);
		frame.getContentPane().add(mostrarNome);
	}
}
