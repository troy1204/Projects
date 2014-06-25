import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import java.text.*;

public class FormattedTextFieldDemo extends JPanel{

    private JFormattedTextField num1; 
    private JFormattedTextField num2; 
    private JFormattedTextField out1; 
    private JFormattedTextField out2; 
    private JButton but; 

    private int gcd(int a, int b){
		while(b > 0){ 
			int c = a % b; 
			a = b;
			b = c;
		}
		return a;
	}            	

    public FormattedTextFieldDemo() {
    	super(new BorderLayout());
    	num1 = new JFormattedTextField();
    	num1.setPreferredSize(new Dimension(100,50));
    	num2 = new JFormattedTextField();
    	num2.setPreferredSize(new Dimension(100,50));
    	out1 = new JFormattedTextField();
    	out1.setPreferredSize(new Dimension(100,50));
    	out1.setEditable(false);
    	out2 = new JFormattedTextField();
    	out2.setPreferredSize(new Dimension(100,50));
    	out2.setEditable(false);
    	but = new JButton(" = ");
    	but.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					int g = 0;
					int n1 = Integer.parseInt(num1.getText());
					int n2 = Integer.parseInt(num2.getText());
					if(n1 > 0 && n2 > 0){
						g = gcd(n1, n2);
					}
					if(g > 1){
						out1.setText(Integer.toString(n1/g));
						out2.setText(Integer.toString(n2/g));
					}
					if(g == 1){
						out1.setText("1");
						out2.setText("1");
					}
				}
				catch(Exception ex){}
		  	}
		});

    	JPanel fieldPane1 = new JPanel();
    	JPanel fieldPane2 = new JPanel();
    	JPanel fieldPane3 = new JPanel();
    	JPanel fieldPane4 = new JPanel();
        fieldPane1.add(num1);
        fieldPane1.add(num2);
        fieldPane2.add(but);
        fieldPane3.add(out1);
        fieldPane3.add(out2);

	    add(fieldPane1);
	    add(fieldPane2);
	    add(fieldPane3);
	    setLayout(new GridLayout(0,3));
    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add contents to the window.
        frame.add(new FormattedTextFieldDemo());

        //Display the window.
        frame.pack();
        frame.setSize(350, 135);
        frame.setResizable(false);
        frame.setVisible(true);
 	}

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
