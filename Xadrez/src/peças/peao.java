package peças;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import Telas.Menu;

public class peao {
	
	
	ImageIcon Pb = new ImageIcon(this.getClass().getResource("/peao-branco.png"));
	ImageIcon Pw = new ImageIcon(this.getClass().getResource("/Pb.png"));
	int valor=1;
	
	
	public int getValor() {
		return valor;
	}
	public ImageIcon peao_branco()
	{
		return Pb;
	}
	public ImageIcon peao_preto()
	{
		return Pw;
	}
	public void seleciona_borda(int matriz[][],JButton botao[][], int x, int y)
	{
		if(matriz[x][y]==1) {
			if(y+1<8) {
			if(matriz[x][y+1]==0) { 
				botao[x][y+1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				if(y+2<8) {
					if(matriz[x][y+2]==0)
						botao[x][y+2].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
			}
			if(y+1<8&&x+1<8) {
				if(matriz[x+1][y+1]<0)
					botao[x+1][y+1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
			if(y+1<8&&x-1>=0) {
				if(matriz[x-1][y+1]<0)
					botao[x-1][y+1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
			
		}
		if(matriz[x][y]==-1) {
			if(y-1>=0) {
			if(matriz[x][y-1]==0) { 
				botao[x][y-1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				if(y-2>=0) {
				if(matriz[x][y-2]==0&&y-2>=0)
					botao[x][y-2].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
				if(y-1>=0&&x-1>=0) {
					if(matriz[x-1][y-1]>0)
						botao[x-1][y-1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
				if(y-1>=0&&x+1<8) {
					if(matriz[x+1][y-1]>0)
						botao[x+1][y-1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			
			}
			
		}
		
	}
	
	public void mata(int matriz[][], int move_x, int move_y, JButton botao[][], int x, int y) {
		if(matriz[move_x][move_y]==1) {
			if(move_x+1<8&&move_y+1<8) {
				if(matriz[move_x+1][move_y+1]<0 && move_x+1==x && move_y+1==y) {
					matriz[x][y]=1;
					matriz[move_x][move_y]=0;
					botao[x][y].setIcon(peao_branco());
					botao[move_x][move_y].setIcon(null);
					botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
				}
			}
			if(move_x-1>=0&&move_y+1<8) {
				if(matriz[move_x-1][move_y+1]<0 && move_x-1==x && move_y+1==y) {
					matriz[x][y]=1;
					matriz[move_x][move_y]=0;
					botao[x][y].setIcon(peao_branco());
					botao[move_x][move_y].setIcon(null);
					botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
				}
			}
		}
		if(matriz[move_x][move_y]==-1) {
			if(move_x+1<8&&move_y-1>=0) {
				if(matriz[move_x+1][move_y-1]>0 && move_x+1==x && move_y-1==y) {
					matriz[x][y]=-1;
					matriz[move_x][move_y]=0;
					botao[x][y].setIcon(peao_preto());
					botao[move_x][move_y].setIcon(null);
				}
			}
			if(move_x-1>=0&&move_y-1>=0) {
				if(matriz[move_x-1][move_y-1]>0 && move_x-1==x && move_y-1==y) {
					matriz[x][y]=-1;
					matriz[move_x][move_y]=0;
					botao[x][y].setIcon(peao_preto());
					botao[move_x][move_y].setIcon(null);
				}
			}
		}
	}

	public void move(int matriz[][], int x, int y, JButton botao[][], int move_x, int move_y, int valor) {
		
		if(matriz[move_x][move_y]==1) {
			
				if(matriz[move_x][move_y+1]==0) {
					if(matriz[x][y]==0) {
						matriz[x][y]=1;
						matriz[move_x][move_y]=0;
						botao[x][y].setIcon(peao_branco());
						botao[move_x][move_y].setIcon(null);
						botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
						
						}
					else 
						valor=0;
				}
				else {
					botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
					valor=0;
				}
		}
		
		
		if(matriz[move_x][move_y]==-1) {
			if(matriz[move_x][move_y-1]==0) {
				if(matriz[x][y]==0) {
					matriz[x][y]=-1;
					matriz[move_x][move_y]=0;
					botao[x][y].setIcon(peao_preto());
					botao[move_x][move_y].setIcon(null);
					botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
					
					}
				else 
					valor=0;
			}
			else {
				botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
				valor=0;
			}
		}
		
		
		
			}
			
			 
		}