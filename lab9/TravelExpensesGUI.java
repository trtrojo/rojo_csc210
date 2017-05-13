/*TravelExpenses.java
 * TravelExpenses -- Calculate Travel Expenses GUI
 *
 * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 *
 * Follow the instructions on page 846-847
 *
 * This is just the loader, the rest of the app will be in separate
 * modules
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TravelExpensesGUI extends JFrame {

	private GreetingPanel banner; //greeting
	private ExpensesPanel expensesPanel; //left panel, show data entry.
	private ReimbursementPanel reimbursementPanel; //right panel, display data.
	private JPanel buttonPanel; //hold buttons
	private JButton calcButton; //Calculate total expenses
	private JButton clearButton; //Clears data and reset everything.


	private final int WINDOW_WIDTH = 800;
	private final int WINDOW_HEIGHT = 800;

	//constants based on assignment, base credits to offer user.
	private final double MEAL_CREDIT = 37.00;
	private final double PARK_CREDIT = 10.00;
	private final double TAXI_CREDIT = 20.00;
	private final double LODGING_CREDIT = 95.00;
	private final double PV_MILE_CREDIT = 0.27;

	private double daysTrip;
	private double airfareAmount;
	private double carRentalFees;
	private double milesDriven;
	private double parkingFees;
	private double taxiFees;
	private double confRegFees;
	private double lodgingCharges;

	public TravelExpensesGUI() {
		
		/*
 		 * Unknown where to put this. Please advise.
 		 */
		setTitle("Travel Expenses");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		banner = new GreetingPanel(); //reference GreetingPanel.java
		expensesPanel = new ExpensesPanel(); //reference ExpensesPanel.java
		reimbursementPanel = new ReimbursementPanel(); //reference ReimbursementPanel.java

		buildButtonPanel(); //Create button panel?????

		//Add the components to the main content panel.
		add(banner, BorderLayout.NORTH);
		add(expensesPanel, BorderLayout.WEST);
		add(reimbursementPanel, BorderLayout.EAST);
		add(buttonPanel, BorderLayout.SOUTH);

		pack();
		setVisible(true);
		

	}

	private void buildButtonPanel() {
		//create a panel for the buttons.
		buttonPanel = new JPanel();

		calcButton = new JButton("Calculate");
		clearButton = new JButton("Clear");

		buttonPanel.add(calcButton);
		buttonPanel.add(clearButton);

		//register action listeners
		calcButton.addActionListener(new CalcButtonListener());
		clearButton.addActionListener(new ClearButtonListener());
	}


	private class ClearButtonListener implements ActionListener {
		public ClearButtonListener() {
			//intentionally left blank
		}

		public void actionPerformed(java.awt.event.ActionEvent e) {
			expensesPanel.clearForm();
			reimbursementPanel.clearForm();
		}
	}

	private class CalcButtonListener implements ActionListener {
		public CalcButtonListener() {
			//intentionally left blank
		}

		public void actionPerformed(java.awt.event.ActionEvent e) {
			try {		
				reimbursementPanel.setTotalExpenses("$");
				System.out.println(expensesPanel.getDaysTrip());
			} catch (NumberFormatException ex) {
				System.out.println("Exception Caught -- Number format exception");
				JOptionPane.showMessageDialog(null,"Error, Please only enter numbers","Error",JOptionPane.ERROR_MESSAGE);
			}
			
			

		}
	}



	public static void main(String args[]) {
		new TravelExpensesGUI();
	}

}
