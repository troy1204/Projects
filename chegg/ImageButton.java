import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class ImageButton extends JPanel{
    JButton imgButton = new JButton();
    ImageIcon clickImage = new ImageIcon();
    ImageIcon image3 = new ImageIcon();

    public ImageButton(){
        imgButton.setToolTipText("Lab Button");
        Icon image1 = new ImageIcon(getClass().getResource("img1.png"));
        Icon image2 = new ImageIcon(getClass().getResource("img2.png"));
        image3 = new ImageIcon(getClass().getResource("img3.gif"));
        imgButton = new JButton(image1);
        imgButton.setRolloverIcon(image2);
        ButtonClickEventHandler buttonEventHandler = new ButtonClickEventHandler();
        imgButton.addActionListener(buttonEventHandler);
        add(imgButton);
    }

    private class ButtonClickEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            //imgButton.setRolloverIcon(clickImage);
            clickImage.setImage(image3.getImage());
            imgButton.setRolloverEnabled(false);  
        }
    }
    
}