import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class GuiExample extends JFrame {
    private JPanel contentPane;
    JButton b1;
    ImageIcon img1;
	ImageIcon img2;
	ImageIcon img3;
	JLabel wIcon;
	int i;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GuiExample frame = new GuiExample();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public GuiExample() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
       	img1 = new ImageIcon("image1.png");
		img2 = new ImageIcon("image2.png");
		img3 = new ImageIcon("image3.png");
		wIcon = new JLabel(img1);
		contentPane.add(wIcon);
		b1 = new JButton("NEXT");
		i = 0;
		b1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(i == 0){
        			wIcon.setIcon(img2);	
        			i++;
        		}
        		else if(i == 1){
        			wIcon.setIcon(img3);	
        			i++;
        		}
        		else if(i == 2){
        			wIcon.setIcon(img1);
        			i = 0;
        		}
            	
        	}
    	});
		add(b1, BorderLayout.SOUTH);
		
    }
}