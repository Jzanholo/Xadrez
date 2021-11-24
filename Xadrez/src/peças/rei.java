package peças;

import javax.swing.ImageIcon;

public class rei {
	
	ImageIcon Rb = new ImageIcon(this.getClass().getResource("/rei-branco.png"));
	ImageIcon Rp = new ImageIcon(this.getClass().getResource("/rei-preto.png"));
	
	int posX;
	int posY;
	int valor=6;
	
	public ImageIcon rei_branco()
	{
		return Rb;
	}
	public ImageIcon rei_preto()
	{
		return Rp;
	}
	
	public void mover()
	{
		
	}

}
