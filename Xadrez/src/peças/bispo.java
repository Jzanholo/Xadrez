package peças;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class bispo {
	
	ImageIcon Bb = new ImageIcon(this.getClass().getResource("/B-branco.png"));
	ImageIcon Bp = new ImageIcon(this.getClass().getResource("/Bb.png"));
	
	int posX;
	int posY;
	int valor=3;
	

	public ImageIcon bispo_branco()
	{
		return Bb;
	}
	public ImageIcon bispo_preto()
	{
		return Bp;
	}
	
	public void seleciona_borda(int matriz[][],JButton botao[][], int x, int y)
	{
		int x1=0, y1=0;
		int flag=0;
		if(matriz[x][y]==4) {
			//diagonal 4 quadrante
			x1=x+1;
			y1=y+1;
			while(x1<8&&y1<8)
			{
				if(matriz[x1][y1]==0)
				{
					if(flag==0)
						botao[x1][y1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
				else flag=1;
				x1++;
				y1++;
			}
			////diagonal 2 quadrante
			flag=0;
			x1=x-1;
			y1=y-1;
			while(x1>=0&&y1>=0)
			{
				if(matriz[x1][y1]==0)
				{
					if(flag==0)
						botao[x1][y1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
				else flag=1;
				x1--;
				y1--;
			}
			//diagonal 1 quadrante 
			flag=0;
			x1=x+1;
			y1=y-1;
			while(x1<8&&y1>=0)
			{
				if(matriz[x1][y1]==0)
				{
					if(flag==0)
						botao[x1][y1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
				else flag=1;
				x1++;
				y1--;
			}
			//diagonal 3 quadrante 
			flag=0;
			x1=x-1;
			y1=y+1;
			while(x1>=0&&y1<8)
			{
				if(matriz[x1][y1]==0)
				{
					if(flag==0)
						botao[x1][y1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
				else flag=1;
				x1--;
				y1++;
			}
			
			}
			else {
			//diagonal 4 quadrante
			x1=x+1;
			y1=y+1;
			while(x1<8&&y1<8)
			{
				if(matriz[x1][y1]==0)
				{
					if(flag==0)
						botao[x1][y1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
				else flag=1;
				x1++;
				y1++;
			}
			////diagonal 2 quadrante
			flag=0;
			x1=x-1;
			y1=y-1;
			while(x1>=0&&y1>=0)
			{
				if(matriz[x1][y1]==0)
				{
					if(flag==0)
						botao[x1][y1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
				else flag=1;
				x1--;
				y1--;
			}
			//diagonal 1 quadrante 
			flag=0;
			x1=x+1;
			y1=y-1;
			while(x1<8&&y1>=0)
			{
				if(matriz[x1][y1]==0)
				{
					if(flag==0)
						botao[x1][y1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
				else flag=1;
				x1++;
				y1--;
			}
			//diagonal 3 quadrante 
			flag=0;
			x1=x-1;
			y1=y+1;
			while(x1>=0&&y1<8)
			{
				if(matriz[x1][y1]==0)
				{
					if(flag==0)
						botao[x1][y1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
				else flag=1;
				x1--;
				y1++;
			}
			
			}
		
	}
	public boolean verifica_mov(int matriz[][], int move_x, int move_y, int x, int y) {
		int x1=x+1;
		int y1=y+1;
		while(x1<8&&y1<8)
		{
			if(x1==x&&y1==y)
				return true;
			x1++;
			y1++;
		}
		return false;
	}
	public void move(int matriz[][], int x, int y, JButton botao[][], int move_x, int move_y, int valor) {
		
		if(matriz[move_x][move_y]==4) {
			if(matriz[x][y]==0&&verifica_mov(matriz,move_x,move_y,x,y)) {
				matriz[x][y]=4;
				matriz[move_x][move_y]=0;
				botao[x][y].setIcon(bispo_branco());
				botao[move_x][move_y].setIcon(null);
				botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
				
				}
			else 
				valor=0;
		}
		if(matriz[move_x][move_y]==-4) {
			if(matriz[x][y]==0) {
				matriz[x][y]=-4;
				matriz[move_x][move_y]=0;
				botao[x][y].setIcon(bispo_preto());
				botao[move_x][move_y].setIcon(null);
				botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
				
				}
			else 
				valor=0;
		}

	}

}
