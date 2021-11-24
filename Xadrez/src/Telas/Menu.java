package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 545, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel_1 = new JLabel("Chess Masters");

		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("Showcard Gothic", Font.BOLD, 40));
		lblNewLabel_1.setBounds(104, 21, 334, 63);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("PLAY");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		
		btnNewButton.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
		
	       
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroPlayers back = new CadastroPlayers();
                frame.setVisible(false);
                back.main(null);
			}
		});
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		btnNewButton.setBounds(186, 128, 154, 54);
		frame.getContentPane().add(btnNewButton);
		
		ImageIcon img = new ImageIcon(this.getClass().getResource("/telax.png"));
		
		JLabel fundotela = new JLabel("");
        fundotela.setIcon(img);
		
		fundotela.setBounds(0, 0, 544, 261);
		frame.getContentPane().add(fundotela);
		
		
	}
}
