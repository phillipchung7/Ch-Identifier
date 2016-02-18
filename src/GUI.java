import java.awt.*;
import javax.swing.*;
import java.awt.event.*; // needed for event handling
 
public  class GUI extends JPanel implements ActionListener {
	int decimal;
	String decimalEntity;
	String hexstring;
	String hex_with_padded_zeroes;
	public static String hex;
	String hexEntity;
	String unicode;
	
	JButton button = new JButton("Get Character Info"); // make button object
	JTextField textField = new JTextField();
	JTextField characterDisplay = new JTextField();

public GUI() {
   
	Box topBox = Box.createHorizontalBox();
		topBox.add(textField);
		textField.setFont(new Font("Default", Font.PLAIN,20));
		textField.setPreferredSize(new Dimension(100, 50));
		textField.setHorizontalAlignment(JTextField.CENTER);
		topBox.add(button);  // place button in panel
		button.addActionListener(this); // panel is listener for button
    
    
	Box totalBox = Box.createVerticalBox();
		totalBox.add(topBox);
		totalBox.add(Box.createVerticalStrut(30));
		totalBox.add(characterDisplay);
		characterDisplay.setPreferredSize(new Dimension(90, 120));
		characterDisplay.setHorizontalAlignment(JTextField.CENTER);
		characterDisplay.setFont(new Font("Calibri", Font.PLAIN,80));
		characterDisplay.setEditable(false);  // prevents the user from editing it.
		
	this.add(totalBox);
}
 
   public void actionPerformed(ActionEvent e) { 
     if (e.getSource() == button) {
    	 String characterInput = textField.getText();	// Obtain the input in the text field as a string.
    	 char firstCharacter = characterInput.charAt(0);
    	 decimal = firstCharacter;
    	 decimalEntity = " &#38#"+decimal;
    	 hexstring = Integer.toHexString(decimal);
    	 hex_with_padded_zeroes = ("0000" + hexstring).substring(hexstring.length());
    	 hex = "0x"+ hex_with_padded_zeroes;
    	 hexEntity = "&#38#x"+ hex_with_padded_zeroes;
    	 unicode = "\\u"+ hex_with_padded_zeroes;

    	 System.out.println(hex);
    	 
    	 
    	 characterDisplay.setText(characterInput);

    	 
     }
   }
 }