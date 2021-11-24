package Controlador;

import java.awt.Color;

import javax.swing.JButton;

import peças.bispo;
import peças.cavalo;
import peças.peao;
import peças.rainha;
import peças.rei;
import peças.torre;
import Telas.Tabuleiro;

public class Controlador {
	
	Jogadores j = new Jogadores();
	peao p = new peao();
	torre t= new torre();
	rei r= new rei();
	rainha q= new rainha();
	bispo b= new bispo();
	cavalo c= new cavalo();
	int flag;
	boolean mexeu=false;
	

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	public void imprime(int matriz[][]) {
		for(int i=0; i<8;i++) {
			for(int j=0; j<8;j++) {
				System.out.printf("  "+matriz[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public boolean verifica_nomes() {
		if(j.getJogador1()!=null||j.getJogador2()!=null)
			return true;
		return false;
	}
	public void inicializa_peca(int T_fantasma[][], JButton botoes[][]) {
		for(int x1=0;x1<8;x1++) {
	        botoes[x1][6].setIcon(p.peao_preto());
	        T_fantasma[x1][6]=-1;
			}
		for(int x1=0;x1<8;x1++) {
			 botoes[x1][1].setIcon(p.peao_branco());
			 T_fantasma[x1][1]=1;
			}
		botoes[0][0].setIcon(t.torre_branco());
		T_fantasma[0][0]=2;
		botoes[7][0].setIcon(t.torre_branco());
		T_fantasma[7][0]=2;
		botoes[0][7].setIcon(t.torre_preto());
		T_fantasma[0][7]=-2;
		botoes[7][7].setIcon(t.torre_preto());
		T_fantasma[7][7]=-2;
		botoes[4][0].setIcon(r.rei_branco());
		T_fantasma[4][0]=6;
		botoes[4][7].setIcon(r.rei_preto());
		T_fantasma[4][7]=-6;
		botoes[3][0].setIcon(q.rainha_branco());
		T_fantasma[3][0]=5;
		botoes[3][7].setIcon(q.rainha_preto());
		T_fantasma[3][7]=-5;
		botoes[2][0].setIcon(b.bispo_branco());
		T_fantasma[2][0]=4;
		botoes[2][7].setIcon(b.bispo_preto());
		T_fantasma[2][7]=-4;
		botoes[5][0].setIcon(b.bispo_branco());
		T_fantasma[5][0]=4;
		botoes[5][7].setIcon(b.bispo_preto());
		T_fantasma[5][7]=-4;
		botoes[1][0].setIcon(c.cavalo_branco());
		T_fantasma[1][0]=3;
		botoes[1][7].setIcon(c.cavalo_preto());
		T_fantasma[1][7]=-3;
		botoes[6][0].setIcon(c.cavalo_branco());
		T_fantasma[6][0]=3;
		botoes[6][7].setIcon(c.cavalo_preto());
		T_fantasma[6][7]=-3;
	}
	public void seleciona_borda(int matriz[][], JButton botao[][], int x, int y)
	{
		switch(matriz[x][y]) {
			case 1:  p.seleciona_borda(matriz, botao, x, y);
					 break;
			case -1: p.seleciona_borda(matriz, botao, x, y);
					 break;
			case 2:  t.seleciona_borda(matriz, botao, x, y);
					 break;
			case -2: t.seleciona_borda(matriz, botao, x, y);
					 break;
			case 3:  c.seleciona_borda(matriz, botao, x, y);
				     break;
			case -3: c.seleciona_borda(matriz, botao, x, y);
		     		 break;
			case 4:  b.seleciona_borda(matriz, botao, x, y);
					 break;
			case -4: b.seleciona_borda(matriz, botao, x, y);
			 		 break;
		}
	}
	public void tira_borda(JButton botao[][]) {
		for(int x=0;x<8;x++) {
			for(int y=0;y<8;y++) {
				botao[x][y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
			}
		}
	}
	
	
	public void movimentacoes_pecas(int T_fantasma[][],JButton botoes[][],int move_x,int move_y,int m, int n, int valor)
	{
		switch(T_fantasma[move_x][move_y]) {
		case 1: 
			///Move_x = coluna e Move_y = linha
				p.mata(T_fantasma, move_x,  move_y, botoes,  m,  n);
				if((move_y+1==n ||move_y+2==n) && move_x==m ) {
					tira_borda(botoes);
					p.move(T_fantasma, m, n, botoes, move_x, move_y, valor);
					valor=0;
				}else {
					valor=0;
					tira_borda(botoes);
					botoes[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
				}
				break;
		
		case -1: 
			p.mata(T_fantasma, move_x,  move_y, botoes,  m,  n);
			if((move_y-1==n||move_y-2==n)&& move_x==m) {
				tira_borda(botoes);
				p.move(T_fantasma, m, n, botoes, move_x, move_y, valor);
				valor=0;
			}
			else {
				valor=0;
				tira_borda(botoes);
				botoes[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
			}
			break;
		
		case 2: 
					tira_borda(botoes);
					t.mata(T_fantasma, m, n, botoes, move_x, move_y, valor);
					t.move(T_fantasma, m, n, botoes, move_x, move_y, valor);
					botoes[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
					valor=0;
			
			break;
			
		case -2: 
			
					tira_borda(botoes);
					t.mata(T_fantasma, m, n, botoes, move_x, move_y, valor);
					t.move(T_fantasma, m, n, botoes, move_x, move_y, valor);
					botoes[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
					valor=0;
					break;
					
			case 3: tira_borda(botoes);
					c.matou(m, n, move_y, move_x, T_fantasma, botoes);
					c.move(T_fantasma, m, n, botoes, move_x, move_y, valor);
					valor=0;
					break;
					
			case -3:tira_borda(botoes);
					c.move(T_fantasma, m, n, botoes, move_x, move_y, valor);
					valor=0;
				    break;
				
			case 4: 
					tira_borda(botoes);
					b.move(T_fantasma, m, n, botoes, move_x, move_y, valor);
					valor=0;
					break;
					
			case -4:valor=0;
					tira_borda(botoes);
					break;
				
			case 5:
				break;
			case -5:
				break;
				
			case 6:
				break;
			case -6:
				break;	
			
			
			
		}
		
	}
	
	
}