import javax.swing.*;
import java.awt.event.*;
import java.lang.Math.*;

//This class inherits JFrame and implements MouseListener Interface
public class JLeftOrRight extends JFrame implements MouseListener
{
    public JLabel label;

    public static void main(String args[])
    {
        new JLeftOrRight();
    }

    JLeftOrRight()
    {
        setSize(500, 400);
        setTitle("Java Swing - JFrame  Detect Mouse Left/Right Click");

        label = new JLabel("No Mouse Left-Click Captured....", JLabel.CENTER);
        add(label);
        label.addMouseListener(this);
          
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Overridden Methods from MouseListener Interface
    //These methods are called automatically when corresponding mouse
    //event occurs 
    /////////////////////////////////////////////////
    public void mousePressed(MouseEvent e) 
    {
        if((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0)
        {
          label.setText("Detected Mouse Left Click!");
        } 
        else if((e.getModifiers() & InputEvent.BUTTON2_MASK) != 0)
        {
          label.setText("Detected Mouse Middle Click!");
        }     
        else if((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0)
        {
          label.setText("Detected Mouse Right Click!");
        }
    }
    
    public void mouseReleased(MouseEvent e)
    {}
    public void mouseEntered(MouseEvent e) 
    {}
    public void mouseExited(MouseEvent e) 
    {}
    public void mouseClicked(MouseEvent e) 
    {}
}