package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import Controlador.Controlador;
import Controlador.Jogadores;
import peças.bispo;
import peças.cavalo;
import peças.peao;
import peças.rainha;
import peças.rei;
import peças.torre;

import javax.swing.Icon;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class Tabuleiro {
	Controlador c = new Controlador();
	Jogadores j = new Jogadores();
	peao p = new peao();
	torre t= new torre();
	rei r= new rei();
	rainha Q= new rainha();
	bispo B= new bispo();
	cavalo C= new cavalo();
	
	int vez=1;
	int move_x,move_y;
	int peca;
	int valor=0;
	int controle =0;
	private JButton[][] botoes = new JButton[8][8];
	private int[][] T_fantasma= new int[8][8];
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabuleiro window = new Tabuleiro();
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
	public Tabuleiro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		
		JButton btnNewButton = new JButton("MENU");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu back = new Menu();
                frame.setVisible(false);
                back.main(null);
			}
		});
		
	
	
		
		
		
		
		
		JLabel fundotela = new JLabel("");
		fundotela.setBounds(20, 50, 400, 400);
		frame.getContentPane().add(fundotela);
		
	
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnNewButton.setBounds(419, 0, 115, 53);
		frame.getContentPane().add(btnNewButton);

		JLabel branco = new JLabel(j.getJogador1());
		branco.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		branco.setHorizontalAlignment(SwingConstants.CENTER);
		branco.setBounds(20, 0, 400, 53);
		branco.setOpaque(true);
		branco.setForeground(Color.BLACK);
		branco.setBackground(Color.white);
		branco.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(branco);
		
		JLabel preto = new JLabel(j.getJogador2());
		preto.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		preto.setHorizontalAlignment(SwingConstants.CENTER);
		preto.setBounds(20, 468, 400, 53);
		preto.setOpaque(true);
		preto.setForeground(Color.white);
		preto.setBackground(Color.BLACK);
		frame.getContentPane().add(preto);
		
		
	
///////////////////////////COLUNAS///////////////
		JLabel l1 = new JLabel("a");
		l1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(20, 450, 50, 20);
		frame.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("b");
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		l2.setBounds(70, 450, 50, 20);
		frame.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("c");
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		l3.setBounds(120, 450, 50, 20);
		frame.getContentPane().add(l3);
		
		JLabel l4 = new JLabel("d");
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		l4.setBounds(170, 450, 50, 20);
		frame.getContentPane().add(l4);
		
		JLabel l5 = new JLabel("e");
		l5.setHorizontalAlignment(SwingConstants.CENTER);
		l5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		l5.setBounds(220, 450, 50, 20);
		frame.getContentPane().add(l5);
		
		JLabel l6 = new JLabel("f");
		l6.setHorizontalAlignment(SwingConstants.CENTER);
		l6.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		l6.setBounds(270, 450, 50, 20);
		frame.getContentPane().add(l6);
		
		JLabel l7 = new JLabel("g");
		l7.setHorizontalAlignment(SwingConstants.CENTER);
		l7.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		l7.setBounds(320, 450, 50, 20);
		frame.getContentPane().add(l7);
		
		JLabel l8 = new JLabel("h");
		l8.setHorizontalAlignment(SwingConstants.CENTER);
		l8.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		l8.setBounds(370, 450, 50, 20);
		frame.getContentPane().add(l8);
		///////////////////////////LINHAS///////////////
		JLabel c1 = new JLabel("8");
		c1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		c1.setHorizontalAlignment(SwingConstants.CENTER);
		c1.setBounds(0, 50, 20, 50);
		frame.getContentPane().add(c1);
		
		JLabel c2 = new JLabel("7");
		c2.setHorizontalAlignment(SwingConstants.CENTER);
		c2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		c2.setBounds(0, 100, 20, 50);
		frame.getContentPane().add(c2);
		
		JLabel c3 = new JLabel("6");
		c3.setHorizontalAlignment(SwingConstants.CENTER);
		c3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		c3.setBounds(0, 150, 20, 50);
		frame.getContentPane().add(c3);
		
		JLabel c4 = new JLabel("5");
		c4.setHorizontalAlignment(SwingConstants.CENTER);
		c4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		c4.setBounds(0, 200, 20, 50);
		frame.getContentPane().add(c4);
		
		JLabel c5 = new JLabel("4");
		c5.setHorizontalAlignment(SwingConstants.CENTER);
		c5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		c5.setBounds(0, 250, 20, 50);
		frame.getContentPane().add(c5);
		
		JLabel c6 = new JLabel("3");
		c6.setHorizontalAlignment(SwingConstants.CENTER);
		c6.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		c6.setBounds(0, 300, 20, 50);
		frame.getContentPane().add(c6);
		
		JLabel c7 = new JLabel("2");
		c7.setHorizontalAlignment(SwingConstants.CENTER);
		c7.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		c7.setBounds(0, 350, 20, 50);
		frame.getContentPane().add(c7);
		
		JLabel c8 = new JLabel("1");
		c8.setHorizontalAlignment(SwingConstants.CENTER);
		c8.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		c8.setBounds(0, 400, 20, 50);
		frame.getContentPane().add(c8);
		
		JButton btnDeesistir = new JButton("DESISTIR");
		btnDeesistir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(vez==1) {
					JOptionPane.showMessageDialog(null,j.jogador1+" desistiu");
				}
				else JOptionPane.showMessageDialog(null,j.jogador2+" desistiu");
			}
		});
		btnDeesistir.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnDeesistir.setBounds(419, 50, 115, 53);
		frame.getContentPane().add(btnDeesistir);
		
		

		////CONSTROI MATRIZ DOS BOTOES/////
		boolean white=true;
		
		for(int x=0;x<8;x++) {
			for(int y=0;y<8;y++) {
				
				JButton b = new JButton();
				b.setBounds(x*50,y*50,50,50);
				
				if(white){
				
					b.setBackground(Color.white);
				}else{

					b.setBackground(new Color(139,0,0));
				}
				
				fundotela.add(b);
				
				white=!white;
				botoes[x][y] = b;
			}
			white=!white;
			
			
		
		}

		//inicializar peças no tabuleiro
				c.inicializa_peca(T_fantasma, botoes);
		//int black=1, w =2;
		
		for(int x=0;x<8;x++) {
			for(int y=0;y<8;y++) {
				int m=x;
				int n=y;
				botoes[x][y].addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						
						valor++;
						System.out.println(valor);
						if(valor==1) {
							if(vez==1) {
								if(T_fantasma[m][n]>0) {
									c.seleciona_borda(T_fantasma,botoes,m,n);
								botoes[m][n].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,0), 4));
								move_x=m;
								move_y=n;
								vez=2;
								}
								else 
									valor=0;	
							}
							else{
								if(T_fantasma[m][n]<0) {
									c.seleciona_borda(T_fantasma,botoes,m,n);
								botoes[m][n].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,0), 4));
								move_x=m;
								move_y=n;
								vez=1;
								}
								else 
									valor=0;	
							}
						}
						if(valor==2) {
							if(T_fantasma[m][n]==T_fantasma[move_x][move_y]) {
								c.tira_borda(botoes);
								if(vez==1) 
									vez=2;
								else vez=1;
								valor=0;
							}
							
							c.movimentacoes_pecas(T_fantasma,botoes,move_x, move_y,m,n,valor);
							valor=0;
							
						}
						
					}
					
					});
				
				}		
			}
		
	//////////////////////////////////////////////////////////////////////////
	}
}
