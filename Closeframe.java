
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Closeframe extends Frame
{

    Closeframe()
    {

        this.setVisible(true);
        this.setSize(500,300);
        this.setTitle("Assignment complete");
        this.setLocation(100,200);
        this.setBackground(Color.lightGray);

        fclose c = new fclose(this);
        this.addWindowListener(c);
    }

    public static void main(String[] args)
    {
        Closeframe f = new Closeframe();

    }

}
class fclose extends WindowAdapter
{
    Closeframe f;
    fclose(Closeframe f)
    {
        this.f=f;
    }
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}
