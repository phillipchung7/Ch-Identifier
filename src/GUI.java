import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class GUI {
	
	JTextField textField = new JTextField();
	JButton button = new JButton("Get Info"); 
	JLabel output = new JLabel ("");
	
	public CopyPasteArea() {
		GUI();
	}
	
public void GUI() {
	
	JFrame frame = new JFrame();  //makes a frame
	frame.setVisible(true); // The pop up window is now visible.
	frame.setSize(700,200); // The pop up window has these dimensions.
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //The pop up window can be closed now by clicking close.
	
	JPanel panel = new JPanel();
	textField.setPreferredSize(new Dimension(100, 50));
	panel.add(textField);
	panel.add(button);
	panel.add(output);

	frame.add(panel);
	
	
	button.addActionListener(new ActionListener () { //When the button is clicked...
		public void actionPerformed (ActionEvent e) {
			String characterInput = textField.getText();	// Obtain the input in the text field as a string.		
			
			char firstCharacter = characterInput.charAt(0);
			int decimal = firstCharacter;
			String decimalEntity = " &#38#"+ decimal;
			String hexstring = Integer.toHexString(decimal);
			String hex_with_padded_zeroes = ("0000" + hexstring).substring(hexstring.length());
			String hex = "0x"+ hex_with_padded_zeroes;
			String hexEntity = "&#38#x"+ hex_with_padded_zeroes;
			String unicode = "\\u"+ hex_with_padded_zeroes;
			
			String info = "<html>" //html code allows to have line breaks in a single string
					+"Decimal: "+ decimal +"<br>"
					+"Decimal Entity: "+ decimalEntity +"<br>"
					+"Hex: "+ hex +"<br>"
					+"Hex Entity: "+ hexEntity +"<br>"
					+"Unicode : "+ unicode +"<br>"
					+ "</html>";
		
		
			output.setText(info); //Update the JLabel
		}
	});
 
}
	

public static void main(String[] args)
	{
	new CopyPasteArea();
	}
}