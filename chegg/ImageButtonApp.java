import javax.swing.*;
public class ImageButtonApp{
    public static void main(String[] a){
        ImageButton i1 = new ImageButton();
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(i1);
        f.setSize(500,500);
        f.setVisible(true);
    }
}