/* PropertyTax.java
 * PropertyTax -- Calculate the Property tax according to the spec
 *
 * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 *
 * Final Exam topic.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class PropertyTax extends JFrame {

	//DecimalFormat to make numbers look nice
	DecimalFormat df = new DecimalFormat("###.00");

	private JPanel panel;

	//Property Value (based on acres) -- ONLY THIS SHOULD BE EDITABLE
	private JLabel propertyAcreValueLabel;
	private JTextField propertyAcreValueTextField;

	//THIS SHOULD NOT BE EDITABLE, ONLY FOR DISPLAY
	private JLabel assessmentValueLabel;
	private JTextField assessmentValueTextField;

	//THIS SHOULD NOT BE EDITABLE, ONLY FOR DISPLAY
	private JLabel propertyTaxValueLabel;
	private JTextField propertyTaxValueTextField;

	private JButton calcButton;

	double propertyValue;
	double calcAssessedValue;
	double propertyTaxValue;

	//THIS IS DEFINED BY THE EXAM
	public final double PROPERTY_TAX = 0.64;
	public final double ASSESSED_VALUE = 0.60;


	/* This constructor needss to be setup like this to create the window
 	 */
	public PropertyTax() {
		setTitle("Property Tax Calculator");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		buildPanel();

		add(panel);

		pack();

		setVisible(true);

	}

	/*Builds the panel, making sure to not allow editing of the calculated values
 	 *
 	 */

	private void buildPanel() {

		panel = new JPanel();
	
		setLayout(new FlowLayout());

		//Border for added flair~
		panel.setBorder(BorderFactory.createTitledBorder("Property Tax"));

		propertyAcreValueLabel = new JLabel("Property Value");
		propertyAcreValueTextField = new JTextField(10);
	
		//THIS FIELD SHOULD NOT BE EDITABLE	
		assessmentValueLabel = new JLabel("Assessed Value");
		assessmentValueTextField = new JTextField(10);

		//THIS SHOULD NOT BE EDITABLE
		propertyTaxValueLabel = new JLabel("Property Tax Value:");
		propertyTaxValueTextField = new JTextField(10);

		calcButton = new JButton("Calculate");

		panel.add(propertyAcreValueLabel);
		panel.add(propertyAcreValueTextField);
		
		panel.add(assessmentValueLabel);
		panel.add(assessmentValueTextField);

		panel.add(propertyTaxValueLabel);
		panel.add(propertyTaxValueTextField);

		panel.add(calcButton);

		//need to disable buttons:
		assessmentValueTextField.setEditable(false);
		propertyTaxValueTextField.setEditable(false);

		//Listener class
		calcButton.addActionListener(new CalcButtonListener());
		
	}

	/*CalcButtonListener class
	 *
	 * Does all the math, making sure to not allow editing
	 */

	private class CalcButtonListener implements ActionListener {

		public CalcButtonListener() {
			//intentionally left blank
		}

		public void actionPerformed(java.awt.event.ActionEvent e) {
			try {
				propertyValue = Double.parseDouble(propertyAcreValueTextField.getText());
			}
			catch(NumberFormatException ex) {
				System.out.println("Error, text entered");
				JOptionPane.showMessageDialog(null,"Error - Please Enter a Valid number","Error",JOptionPane.ERROR_MESSAGE);
			}

			///////////////////////////DOING MATH NOW

			calcAssessedValue = propertyValue * ASSESSED_VALUE;
			propertyTaxValue = (calcAssessedValue * PROPERTY_TAX) / 100;

			assessmentValueTextField.setText("$" +df.format(calcAssessedValue));
			propertyTaxValueTextField.setText("$" + df.format(propertyTaxValue));


		}
	}

	//Starts the main GUI window
	public static void main(String[] args) {
		new PropertyTax();
	}

}

