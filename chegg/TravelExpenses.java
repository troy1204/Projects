import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;


//Class name declaration
public class TravelExpenses extends JFrame

{

   private JPanel travelInfoPanel;

   private JPanel buttonPanel;

   // Labels

   private JLabel numDaysOnTripLabel;

   private JLabel amountAirfairLabel;

   private JLabel amountCarRentalLabel;

   private JLabel milesDrivenLabel;

   private JLabel parkingFeesLabel;

   private JLabel taxiFeesLabel;

   private JLabel confRegLabel;

   private JLabel lodgingChargesPerNightLabel;

    // Text Fields

   private JTextField numDaysOnTripTextField;

   private JTextField amountAirfairTextField;

   private JTextField amountCarRentalTextField;

   private JTextField milesDrivenTextField;

   private JTextField parkingFeesTextField;

   private JTextField taxiFeesTextField;

   private JTextField confRegTextField;

   private JTextField lodgingChargesPerNightTextField;

   // Buttons

   private JButton resetButton;

   private JButton calcButton;

   // Meals amount reimbursed by company per day.
   private double mealsAmount = 37.00;

   // Parking Fees amount reimbursed by company per day.
   private double parkingFeesReimbursed = 10.00;
   // Taxi Charges amount reimbursed by company per day.
   private double taxiChargesReimbursed = 20.00;

   // Lodging Charges amount reimbursed by company per day.
   private double lodgingChargesReimbursed = 95.00;

   // Private Vehicle per miles reimbursment rate.
   private double prVechiclePerMileReimbursed = 0.27;

   // Constructor
   public TravelExpenses( )
   {
      //set the title.
      super("TRAVEL EXPENSES");
      // Set the main window
      setLocationRelativeTo(null);
      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Create a BorderLayout manager for the content pane.
      setLayout(new BorderLayout());
      // Build the TravelInfo and Buttons panels
      buildTravelInfoPanel();
      buildButtonPanel();
      // Add the panels to the frame's content pane
      add(travelInfoPanel, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);
      // Pack the contents of the window and display it.
      pack();
      setVisible(true);
   }
   // The buildTravelInfoPanel method adds the labels
   //and text fiels to the TravelInfo panel.
   private void buildTravelInfoPanel()
   {
      // Create the labels for TravelInfo fields
      numDaysOnTripLabel = new JLabel("Number of days on trip: ");
      amountAirfairLabel = new JLabel("Amount of airfair: ");
      amountCarRentalLabel = new JLabel("Amount of car rental fees: ");
      milesDrivenLabel = new JLabel("Number of Miles driven: ");
      parkingFeesLabel = new JLabel("Amount of Parking fees: ");
      taxiFeesLabel = new JLabel("Amount of Tax charges: ");
      confRegLabel = new JLabel("Conference or Seminar registration fees: ");
      lodgingChargesPerNightLabel = new JLabel("Lodging charges per night: ");
      // Create the text boxes for TravelInfo user input
      numDaysOnTripTextField = new JTextField(3);
      amountAirfairTextField = new JTextField(8);
      amountCarRentalTextField = new JTextField(8);
      milesDrivenTextField = new JTextField(4);
      parkingFeesTextField = new JTextField(6);
      taxiFeesTextField = new JTextField(6);
      confRegTextField = new JTextField(8);
      lodgingChargesPerNightTextField = new JTextField(6);
      // Create a panel to hold labels and text fields.
      travelInfoPanel = new JPanel();
      // Create GridLayout manager
      travelInfoPanel.setLayout(new GridLayout(10, 2));
      // Add the labels and text fields to this panel.
      travelInfoPanel.add(numDaysOnTripLabel);
      travelInfoPanel.add(numDaysOnTripTextField);
      travelInfoPanel.add(amountAirfairLabel);
      travelInfoPanel.add(amountAirfairTextField);
      travelInfoPanel.add(amountCarRentalLabel);
      travelInfoPanel.add(amountCarRentalTextField);
      travelInfoPanel.add(milesDrivenLabel);
      travelInfoPanel.add(milesDrivenTextField);
      travelInfoPanel.add(parkingFeesLabel);
      travelInfoPanel.add(parkingFeesTextField);
      travelInfoPanel.add(taxiFeesLabel);
      travelInfoPanel.add(taxiFeesTextField);
      travelInfoPanel.add(confRegLabel);
      travelInfoPanel.add(confRegTextField);
      travelInfoPanel.add(lodgingChargesPerNightLabel);
      travelInfoPanel.add(lodgingChargesPerNightTextField);
      // Add an empty border around the panel for spacing.
      travelInfoPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 1, 10));
   }
      /*** The buildButtonPanel method creates and adds the Reset and Calculate
      * buttons to the TravelExpense panel as its own panel.
      */
   private void buildButtonPanel()
   {
         // Create the calcButton.
         calcButton = new JButton("CALCULATE");
         // Register an event listener
         calcButton.addActionListener(new CalcButtonListener());
         //Create the resetButton.
         resetButton = new JButton("RESET");
         // Create the Buttons panels.
         buttonPanel = new JPanel();
         // Create BorderLayout manager.
         buttonPanel.setLayout(new BorderLayout(5, 5));
         // Add the two buttons to the buttonPanel.
         buttonPanel.add(resetButton, BorderLayout.WEST);
         buttonPanel.add(calcButton, BorderLayout.CENTER);
         // Add an empty border around the panel for spacing.
         buttonPanel.setBorder(BorderFactory.createEmptyBorder(1, 10, 10, 10));
      }
      /*** Private inner class that handles the event when the user clicks
         * the Calculate button .
      */
   private class CalcButtonListener implements ActionListener
   {
      // Declare variables
      String input;
      int days;
      double air;
      double carRental;
      double miles;
      double parking;
      double taxi;
      double confReg;
      double lodging;
      double mealsAmount;
      public void actionPerformed(ActionEvent e)
      {
         //Declare variables
         double actualExpenses;
         double milesExpenses;
         double allowableExpenses;
         double excessAir;
         double excessCarRental;
         double excessParking;
         double excessTaxi;
         double excessLodging;
         double excessAmountTotal;
         double amountSaved=0;
         double paidBackAmount=0;
         // Create a DecimalFormat object to format the totals as dollar amounts.
         DecimalFormat dollar = new DecimalFormat("$#,##0.00");
         // Get Input Data the user entered in the text fields.
         days = Integer.parseInt(numDaysOnTripTextField.getText());
         air = Double.parseDouble(amountAirfairTextField.getText());
         carRental = Double.parseDouble(amountCarRentalTextField.getText());
         miles = Double.parseDouble(milesDrivenTextField.getText());
         parking = Double.parseDouble(parkingFeesTextField.getText());
         taxi = Double.parseDouble(taxiFeesTextField.getText());
         confReg = Double.parseDouble(confRegTextField.getText());
         lodging = Double.parseDouble(lodgingChargesPerNightTextField.getText());
         // Determine actualExpenses method.
         milesExpenses = miles * prVechiclePerMileReimbursed;
         actualExpenses = (carRental + parking + taxi + lodging +mealsAmount)
                                      *days+air+milesExpenses+ confReg ;
         // Calculate the allowableExpenses.
         allowableExpenses=(mealsAmount+parkingFeesReimbursed+taxiChargesReimbursed+lodgingChargesReimbursed)*days+milesExpenses+air+confReg;
         // Calculate the paidBackAmount.
         if(actualExpenses>allowableExpenses)
               paidBackAmount=actualExpenses-allowableExpenses;
         else
         amountSaved=allowableExpenses-actualExpenses;
         // Display the Totals message box.
         if(paidBackAmount>0)
            JOptionPane.showMessageDialog(null, "Total expenses: "
               + dollar.format(actualExpenses) +"\n" +"Allowable expenses: "
               + dollar.format(allowableExpenses)+"\n" +"\n" + "Amount to be paid back: "
               +dollar.format(paidBackAmount));
         else if(amountSaved>0)
        JOptionPane.showMessageDialog(null, "Total expenses: " + dollar.format(actualExpenses)
      +"\n" +"Allowable expenses: " + dollar.format(allowableExpenses)+"\n" +
       "\n" + "Amount Saved: "+dollar.format(amountSaved));
   else
      JOptionPane.showMessageDialog(null, "Total expenses: " + dollar.format(actualExpenses)
        +"\n" +"Allowable expenses: " + dollar.format(allowableExpenses)+"\n" );
   }
}
/*** Private inner class that handles the event when the user clicks
* the RESET button .
*/

private class ResetButtonListener implements ActionListener
{

   public void actionPerformed(ActionEvent e)

   {

      numDaysOnTripTextField.setText("");

      amountAirfairTextField.setText("");

      amountCarRentalTextField.setText("");

      milesDrivenTextField.setText("");

      parkingFeesTextField.setText("");

      taxiFeesTextField.setText("");

      confRegTextField.setText("");

      lodgingChargesPerNightTextField.setText("");

   }

}

// The main method
public static void main(String[] args)
{

   new TravelExpenses();

}

}