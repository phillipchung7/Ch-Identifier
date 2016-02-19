import java.awt.*;
import javax.swing.*;
import java.awt.event.*; // needed for event handling
 
public  class GUI extends JPanel implements ActionListener {
	JPanel topPanel = new JPanel();
	JButton button = new JButton("Get Character Info"); // make button object
	JTextField textField = new JTextField();
	
	JPanel middlePanel = new JPanel();
	JLabel characterLabel = new JLabel("Character Label");
	JTextField characterDisplay = new JTextField();
	
	JPanel infoPanel = new JPanel(new GridLayout(0,4));
	JLabel decimalLabel = new JLabel("Decimal:");
	JTextField decimalDisplay = new JTextField();
	JLabel decimalEntityLabel = new JLabel("Decimal Entity:");
	JTextField decimalEntityDisplay = new JTextField();
	JLabel hexLabel = new JLabel("Hex:");
	JTextField hexDisplay = new JTextField();
	JLabel hexEntityLabel = new JLabel("Hex Entity:");
	JTextField hexEntityDisplay = new JTextField();
	JLabel alphaEntityLabel = new JLabel("Alpha Entity:");
	JTextField alphaEntityDisplay = new JTextField();
	JLabel javaLabel = new JLabel("Java Character:");
	JTextField javaDisplay = new JTextField();

public GUI() {
	
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	this.add(topPanel);
    topPanel.add(textField);
	textField.setPreferredSize(new Dimension(100, 50));
	topPanel.add(button);
	this.add(new JSeparator(SwingConstants.HORIZONTAL));

	this.add(middlePanel);
	Box box1 = Box.createVerticalBox();
	box1.add(characterLabel);
	box1.add(characterDisplay);
	characterDisplay.setPreferredSize(new Dimension(125, 125));
	characterDisplay.setEditable(false);  // prevents the user from editing it.
	middlePanel.add(box1);
	this.add(new JSeparator(SwingConstants.HORIZONTAL));
	
	this.add(infoPanel);
	infoPanel.add(decimalLabel);
	decimalLabel.setHorizontalAlignment(JLabel.RIGHT);
	infoPanel.add(decimalDisplay);
	decimalDisplay.setPreferredSize(new Dimension(125, 25));
	decimalDisplay.setEditable(false);  // prevents the user from editing it.
	infoPanel.add(decimalEntityLabel);
	decimalEntityLabel.setHorizontalAlignment(JLabel.RIGHT);
	infoPanel.add(decimalEntityDisplay);
	decimalEntityDisplay.setPreferredSize(new Dimension(125, 25));
	decimalEntityDisplay.setEditable(false);  // prevents the user from editing it.
	infoPanel.add(hexLabel);
	hexLabel.setHorizontalAlignment(JLabel.RIGHT);
	infoPanel.add(hexDisplay);
	hexDisplay.setPreferredSize(new Dimension(125, 25));
	hexDisplay.setEditable(false);  // prevents the user from editing it.
	infoPanel.add(hexEntityLabel);
	hexEntityLabel.setHorizontalAlignment(JLabel.RIGHT);
	infoPanel.add(hexEntityDisplay);
	hexEntityDisplay.setPreferredSize(new Dimension(125, 25));
	hexEntityDisplay.setEditable(false);  // prevents the user from editing it.
	infoPanel.add(alphaEntityLabel);
	alphaEntityLabel.setHorizontalAlignment(JLabel.RIGHT);
	infoPanel.add(alphaEntityDisplay);
	alphaEntityDisplay.setPreferredSize(new Dimension(125, 25));
	alphaEntityDisplay.setEditable(false);  // prevents the user from editing it.
	infoPanel.add(javaLabel);
	javaLabel.setHorizontalAlignment(JLabel.RIGHT);
	infoPanel.add(javaDisplay);
	javaDisplay.setPreferredSize(new Dimension(125, 25));
	javaDisplay.setEditable(false);  // prevents the user from editing it.
}
 
   public void actionPerformed(ActionEvent e) { 
     if (e.getSource() == button) {
    	 String characterInput = textField.getText();	// Obtain the input in the text field as a string.		
    	 char firstCharacter = characterInput.charAt(0);
    	 int decimal = firstCharacter;
    	 String decimalEntity = "&#"+decimal;
    	 
    	 characterDisplay.setText(Character.toString(firstCharacter));

    	 decimalDisplay.setText(String.valueOf(decimal));
    	 decimalEntityDisplay.setText(decimalEntity);
    	 
     }
   }
 }