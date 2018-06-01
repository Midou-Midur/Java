package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {


	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g){
		try {
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
    		

    		System.out.println("xDDDDDDDDD");

       		   System.out.println(ViewFacade.non);
       		  String haha = null;
       		String[] splitArray = null;
    		splitArray = ViewFacade.non.split(" ");
    		for (int i = 0; i <= 240; i++) {

    			haha = splitArray[i];

    		
       		   
    			switch (haha)
    				{
    				case "bone" :

    			 		System.out.println(ViewFacade.oui);
    					g.drawImage(img1, ViewFacade.a, ViewFacade.b,null);
    					ViewFacade.a+=32;
    					System.out.println(ViewFacade.a);
    			 		System.out.println(ViewFacade.b);
    					break;
    				
    				case "hbone":
    					System.out.println(ViewFacade.oui);
    					g.drawImage(img2, ViewFacade.a, ViewFacade.b, this);
    					ViewFacade.a+=32;
    					break;
    					
    				case "vbone" :
    					System.out.println(ViewFacade.oui);
      					 g.drawImage(img3, ViewFacade.a, ViewFacade.b, this);
      					 ViewFacade.a+=32;
      					break;
      					
    				case "cball" :
      					 g.drawImage(img4, ViewFacade.a, ViewFacade.b, this);
      					 ViewFacade.a+=32;
      					break;
      					
    				case "gate" :
      					 g.drawImage(img5, ViewFacade.a, ViewFacade.b, this);
      					 ViewFacade.a+=32;
      					break;
      					
    				case "purse" :
      					 g.drawImage(img6, ViewFacade.a, ViewFacade.b, this);
      					 ViewFacade.a+=32;
      					break;
      					
    				case "monster1" :
      					 g.drawImage(img7, ViewFacade.a, ViewFacade.b, this);
      					 ViewFacade.a+=32;
      					break;
      					
    				case "monster2" :
     					 g.drawImage(img8, ViewFacade.a, ViewFacade.b, this);
     					 ViewFacade.a+=32;
     					break;
     					
    				case "monster3" :
     					 g.drawImage(img9, ViewFacade.a, ViewFacade.b, this);
     					 ViewFacade.a+=32;
     					break;
     					
    				case "monster4" :
     					 g.drawImage(img10, ViewFacade.a, ViewFacade.b, this);
     					 ViewFacade.a+=32;
     					break;
       					
    				case "void" :
    					System.out.println(ViewFacade.oui);
    					 
    					 ViewFacade.a+=32;
    					break;
    			} 
       	 
    			this.repaint();
    			if (ViewFacade.a>609)
    			{
    				ViewFacade.a=0;
    				ViewFacade.b+=32;
    				
    			}
    		}
    	}
	 catch (IOException e) {
    e.printStackTrace();
  } 
		ViewFacade.a = 0;
		ViewFacade.b = 0;
	 
}
}

