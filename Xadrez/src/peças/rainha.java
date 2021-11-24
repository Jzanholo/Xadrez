package peças;

import javax.swing.ImageIcon;

public class rainha {
	
	ImageIcon Qb = new ImageIcon(this.getClass().getResource("/qw.png"));
	ImageIcon Qp = new ImageIcon(this.getClass().getResource("/Qb.png"));
	
	int posX;
	int posY;
	int valor=5;
	
	public ImageIcon rainha_branco()
	{
		return Qb;
	}
	public ImageIcon rainha_preto()
	{
		return Qp;
	}
	
	public void mover()
	{
		
	}

}
