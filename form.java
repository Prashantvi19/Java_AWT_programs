
import java.awt.*;
import java.awt.Button;
import java.awt.event.*;
public class form extends Frame implements ActionListener
{


    //for button,row label and textfield
    Label l,l1,l2,l3,l4,l5;
    TextField t,t1,t2,t3,t4,t5;
    Button a,b;
    form()
    {


        setVisible(true);
        setSize(500,800 );
        setResizable(false);
        setTitle("Form");
        setLocation(500, 10);
        setBackground(Color.lightGray);
        //Object Create


        l=new Label("Enter First Name");
        l.setBackground(Color.lightGray);
        l1=new Label("Enter Last Name");
        l1.setBackground(Color.lightGray);
        l2=new Label("Enter Enroll. No.");
        l2.setBackground(Color.lightGray);
        l3=new Label("Enter Program");
        l3.setBackground(Color.lightGray);
        l4=new Label("Enter Branch");
        l4.setBackground(Color.lightGray);
        l5=new Label("Enter Section");
        l5.setBackground(Color.lightGray);

        t=new TextField();
        t.setBackground(Color.white);
        t1=new TextField();
        t1.setBackground(Color.white);
        t2=new TextField();
        t2.setBackground(Color.white);
        t3=new TextField();
        t3.setBackground(Color.white);
        t4=new TextField();
        t4.setBackground(Color.white);
        t5=new TextField();
        t5.setBackground(Color.white);

        a=new Button("Submit");
        a.setBackground(Color.white);
        b=new Button("Clear");
        b.setBackground(Color.white);

        setLayout(null);
        // setLayout(new FlowLayout());

        // layout for labels
        l.setBounds(100,100,100,30);
        l1.setBounds(100,200,100,30);
        l2.setBounds(100,300,100,30);
        l3.setBounds(100,400,100,30);
        l4.setBounds(100,500,100,30);
        l5.setBounds(100,600,100,30);
        // layout for textarea
        t.setBounds(120,100,200,30);
        t1.setBounds(120,200,200,30);
        t2.setBounds(120,300,200,30);
        t3.setBounds(120,400,200,30);
        t4.setBounds(120,500,200,30);
        t5.setBounds(120,600,200,30);

        // layout for button
        a.setBounds( 150,660,60,40);
        b.setBounds(250,660,70,40);

        add(l);
        add(t);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(a);
        add(b);
        Mywindow c=new Mywindow(this);
        this.addWindowListener(c);

    }

    public static void main(String[] args)
    {
        form f = new form();
    }
 public void actionPerformed(ActionEvent e)
 {

 }
}
 class Mywindow extends WindowAdapter
{
    form f;
    Mywindow(form f)
    {
        this.f=f;
    }
 public void windowClosing(WindowEvent e)
 {
        System.exit(0);
        }
}