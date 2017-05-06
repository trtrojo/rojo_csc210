//RetailPriceCalc.java
/* RetailPriceCalc.java
 *
 * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 * 
 * Follow the prompt on page (845/846)
 */


import javax.swing.*;
import java.awt.event.*;


public class RetailPriceCalc extends JFrame 
{

	private JPanel panel;

	private JLabel priceTextLabel;
	private JLabel percentageTextLabel;
	private JLabel totalTextLabel;

	private JTextField priceTextField;
	private JTextField percentageTextField;
	private JTextField totalTextField;

	private JButton calcButton;


	private final int WINDOW_WIDTH = 800;
	private final int WINDOW_HEIGHT = 100;

	/*Implements the code for actually modifying text boxes
 	 * TODO: Remember that performed is not performed. AAAAAAAAAAAAAAAAAAA
 	 */

	private class CalcButtonListener implements ActionListener {

		public CalcButtonListener() {
			//intentionally left blank
		}
		
		public void actionPerformed(java.awt.event.ActionEvent e) {
			String price, percentage;
			double total;
			price = priceTextField.getText();
			percentage = percentageTextField.getText();
			
			try {
				total = Double.parseDouble(price) + (Double.parseDouble(price) * (Double.parseDouble(percentage) / 100));
				System.out.println(total);
				totalTextField.setText(String.valueOf(total));
			} 
			 catch (NumberFormatException ex) {
				System.out.println("Exception -- Number not entered.");
				totalTextField.setText("Error.");
			}
		}
	}


	public RetailPriceCalc(){

		setTitle("Retail Price Calculator");

		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER));

		buildPanel();

		add(panel);

		pack();
		setVisible(true);


	}

	private void buildPanel() {

		priceTextLabel = new JLabel("Wholesale Price:");
		percentageTextLabel = new JLabel("Percentage:");
		totalTextLabel = new JLabel("Total Price:");
		calcButton = new JButton("Calculate");
		
		priceTextField = new JTextField(10);
		percentageTextField = new JTextField(10);
		totalTextField = new JTextField(10);
		totalTextField.setEditable(false);

		calcButton.addActionListener(new CalcButtonListener());


		panel = new JPanel();


		panel.add(priceTextLabel);
		panel.add(priceTextField);

		panel.add(percentageTextLabel);
		panel.add(percentageTextField);

		panel.add(totalTextLabel);
		panel.add(totalTextField);
		panel.add(calcButton);

		

	}

	public static void main(String[] args) {
		new RetailPriceCalc();
	}

}
