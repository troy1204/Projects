import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

   public class RectangleTest extends JApplet implements ActionListener {
      private JLabel prompt1, prompt2;
      private JTextField inputField1, inputField2;
      private JLabel outputLabel;
      private JTextArea outputArea;
      private Rectangle rectangle;

      // set up GUI components and instantiate new Rectangle
      public void init()
      {
        prompt1 = new JLabel( "Length:" );
        prompt2 = new JLabel( "Width:" );
        inputField1 = new JTextField( 10 );
        inputField2 = new JTextField( 10 );
        inputField2.addActionListener( this );

        outputLabel = new JLabel( "Test Output" );
        outputArea = new JTextArea( 4, 10 );
        outputArea.setEditable( false );

        // add components to GUI
        Container container = getContentPane();
        container.setLayout( new FlowLayout() );
        container.add( prompt1 );
        container.add( inputField1 );
        container.add( prompt2 );
        container.add( inputField2 );
        container.add( outputLabel );
        container.add( outputArea );

        // create a new Rectangle with no initial values
        rectangle = new Rectangle();
      }   

      // create rectangle with user input
      public void actionPerformed( ActionEvent actionEvent )
      {
         double double1, double2;

         double1 = Double.parseDouble( inputField1.getText() );
         double2 = Double.parseDouble( inputField2.getText() );

         rectangle.setLength( double1 );
         rectangle.setWidth( double2 );
       
         // see the results of the test
         outputArea.setText( rectangle.toRectangleString() );
      }
} // end class RectangleTest