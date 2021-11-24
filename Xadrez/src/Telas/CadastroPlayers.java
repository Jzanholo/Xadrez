package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import Controlador.Controlador;
import Controlador.Jogadores;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CadastroPlayers {
	Controlador c = new Controlador();
	Jogadores j = new Jogadores();
	private JFrame frame;
	private JTextField txtjogador1;
	private JTextField txtjogador2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPlayers window = new CadastroPlayers();
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
	public CadastroPlayers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 545, 294);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		ImageIcon img = new ImageIcon(this.getClass().getResource("/telax.png"));
		
		
		
		
		
		txtjogador2 = new JTextField();
		txtjogador2.setBorder(BorderFactory.createLineBorder(Color.black));
		txtjogador2.setColumns(10);
		txtjogador2.setBounds(318, 120, 111, 20);
		frame.getContentPane().add(txtjogador2);
		
		txtjogador1 = new JTextField();
		txtjogador1.setBorder(BorderFactory.createLineBorder(Color.black));
		txtjogador1.setBounds(83, 120, 111, 20);
		frame.getContentPane().add(txtjogador1);
		txtjogador1.setColumns(10);
		
		
		
		
		JLabel lblNewLabel_2_2 = new JLabel("Player 2");
		lblNewLabel_2_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(331, 76, 98, 49);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		
		JLabel lblNewLabel_2 = new JLabel("Player 1");
		lblNewLabel_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setBounds(96, 76, 98, 49);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Choose Players");
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(96, 11, 356, 72);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(0, 0, 529, 261);
		frame.getContentPane().add(lblNewLabel);
		
		JButton start = new JButton("Start Game");
		start.setBackground(Color.LIGHT_GRAY);
		start.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j.setJogador1(txtjogador1.getText());
				j.setJogador2(txtjogador2.getText());
				if(c.verifica_nomes()){
					System.out.print(j.getJogador1());
					Tabuleiro back = new Tabuleiro();
	                frame.setVisible(false);
	                back.main(null);
				}
				else { 
					txtjogador1.setText("");
					txtjogador2.setText("");
					JOptionPane.showMessageDialog(null,"Por favor, digite o nome para os dois jogadores");
				}
			}
		});
		start.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		start.setBounds(137, 181, 259, 43);
		frame.getContentPane().add(start);
		
		JLabel fundotela = new JLabel("");
		fundotela.setIcon(img);
		
		fundotela.setBounds(0, 0, 544, 261);
		frame.getContentPane().add(fundotela);
		
	}

}
