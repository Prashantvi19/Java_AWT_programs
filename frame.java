
import java.awt.*;
public class frame extends Frame
{

    frame()
    {

        this.setVisible(true);
        this.setSize(500,300);
        this.setTitle("Assignment complete");
        this.setLocation(100,200);
        this.setBackground(Color.red);
    }

    public static void main(String[] args)
    {
        frame f = new frame();

    }
}
