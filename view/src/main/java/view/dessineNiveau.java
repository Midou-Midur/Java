package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class dessineNiveau extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public dessineNiveau(final Graphics g, final String oui) throws IOException {
    	new Fenetre();
    		
    		Image img1 = ImageIO.read(new File("C:\\Users\\alexa\\Desktop\\JAVA\\Nouveau dossier\\JAVA\\sprite\\bone.png"));
    		Image img2 = ImageIO.read(new File("C:\\Users\\alexa\\Desktop\\JAVA\\Nouveau dossier\\JAVA\\sprite\\horizontal_bone.png"));
    		Image img3 = ImageIO.read(new File("C:\\Users\\alexa\\Desktop\\JAVA\\Nouveau dossier\\JAVA\\sprite\\vertical_bone.png"));
    		Image img4 = ImageIO.read(new File("C:\\Users\\alexa\\Desktop\\JAVA\\Nouveau dossier\\JAVA\\sprite\\crystal_ball.png"));
    		Image img5 = ImageIO.read(new File("C:\\Users\\alexa\\Desktop\\JAVA\\Nouveau dossier\\JAVA\\sprite\\gate_closed.png"));
    		Image img6 = ImageIO.read(new File("C:\\Users\\alexa\\Desktop\\JAVA\\Nouveau dossier\\JAVA\\sprite\\purse.png"));
    		Image img7 = ImageIO.read(new File("C:\\Users\\alexa\\Desktop\\JAVA\\Nouveau dossier\\JAVA\\sprite\\monster_1.png"));
    		Image img8 = ImageIO.read(new File("C:\\Users\\alexa\\Desktop\\JAVA\\Nouveau dossier\\JAVA\\sprite\\monster_2.png"));
    		Image img9 = ImageIO.read(new File("C:\\Users\\alexa\\Desktop\\JAVA\\Nouveau dossier\\JAVA\\sprite\\monster_3.png"));
    		Image img10 = ImageIO.read(new File("C:\\Users\\alexa\\Desktop\\JAVA\\Nouveau dossier\\JAVA\\sprite\\monster_4.png"));
    		
   
    		
    		int a = 0;
    		int b = 0;
    		g.drawImage(img1, a, b,this);
    		for(int i = 0; i <240; i++) {
    		
    			switch (oui)
    				{
    				case "bone" :
    			 		System.out.println(oui);
    					g.drawImage(img1, a, b,this);
    					a+=32;
    					
    					break;
    				
    				case "hbone":
    					g.drawImage(img2, a, b, this);
    					a+=32;
    					break;
    					
    				case "vbone" :
      					 g.drawImage(img3, a, b, this);
      					 a+=32;
      					break;
      					
    				case "cball" :
      					 g.drawImage(img4, a, b, this);
      					 a+=32;
      					break;
      					
    				case "gate" :
      					 g.drawImage(img5, a, b, this);
      					 a+=32;
      					break;
      					
    				case "purse" :
      					 g.drawImage(img6, a, b, this);
      					 a+=32;
      					break;
      					
    				case "monster1" :
      					 g.drawImage(img7, a, b, this);
      					 a+=32;
      					break;
      					
    				case "monster2" :
     					 g.drawImage(img8, a, b, this);
     					 a+=32;
     					break;
     					
    				case "monster3" :
     					 g.drawImage(img9, a, b, this);
     					 a+=32;
     					break;
     					
    				case "monster4" :
     					 g.drawImage(img10, a, b, this);
     					 a+=32;
     					break;
       					
    				case "vide" :
    					 
    					 a+=32;
    					break;
    					
    					
    			} 
    			if (a>609)
    			{
    				a=0;
    				b+=32;
    			}
    		}

    	}
}
