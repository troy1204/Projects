import java.util.Scanner;
import javax.swing.JOptionPane;

public class Comp274Wk1_1 {
    public static void main(String[] args) {
        // scanner example
        Scanner myIn;
        int n,m;
        System.out.println("please type an integer number");
        myIn = new Scanner(System.in);
        m = myIn.nextInt();
        System.out.println("please type an integer number");
        n = myIn.nextInt();
        // for verification
        System.out.printf("you typed the number %d\n", m);
        System.out.printf("you typed the number %d\n", n);

        String s1 = JOptionPane.showInputDialog("type a decimal number");
        String s2 = JOptionPane.showInputDialog("type a decimal number");
        float f1 = Float.parseFloat(s1);
        float f2 = Float.parseFloat(s2);
        String output = "the numbers you input were " + f1 + " and " + f2 +
        ",\nand their average is " + (f1+f2)/2;
        JOptionPane.showMessageDialog(null, output);
        System.exit(0);
    }
}
