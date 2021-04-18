import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
public class smileyface extends Frame {
	
	Frame f;
	
	public void paint(Graphics g) {
		  
		  g.setColor(Color.yellow);
		  g.fillOval(150,150,200,200);   // For face
		  
		  g.setColor(Color.black);
		  g.fillOval(210,200,15,25);     // Left Eye 
		  g.fillOval(270,200,15,25);    // Right Eye
		 
		  g.setColor(Color.white);
		  g.fillOval(237,220,20,50); //Nose
		  g.fillOval(226,245,40,30); //Nose
		  
		  g.setColor(Color.black);
		  g.fillOval(240,254,4,8); 
		  g.fillOval(250,254,4,8);
		  
		  g.drawLine(247,255,247,220);//Nose
		  g.drawArc(210,260,78,50,0,-180);  // Smile
		  
		 
		 }

	
	smileyface()
    {

        this.setVisible(true);
        this.setSize(500,500);
        this.setTitle("smileyface");
        this.setLocation(100,200);
        this.setBackground(Color.lightGray);
        
        

        fclose c = new fclose(this);
        this.addWindowListener(c);
    }


class fclose extends WindowAdapter
{
	smileyface f;
    fclose(smileyface f)
    {
        this.f=f;
    }
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}

	

public static void main(String[] args)
{
	smileyface f = new smileyface();

}
}

