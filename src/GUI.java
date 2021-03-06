import java.awt.*;
import javax.swing.*;
import java.awt.event.*; // needed for event handling
 
public  class GUI extends JPanel {  //makes class
	
	public String hex;     //creates the string hex
	JPanel topPanel = new JPanel();     //creates the panel above in the frame the user sees
	JButton button = new JButton("Get Character Info"); // make button object
	JTextField textField = new JTextField();  //creates the text field
	
	JPanel middlePanel = new JPanel();    //creates the other panel that the user sees within the frame
	JTextField characterDisplay = new JTextField();  //creates text field for the character
	JLabel descriptionLabel = new JLabel("Character Description: ");  //creates label for character description
	JLabel descriptionText = new JLabel("");    //creates description text

	JPanel infoPanel = new JPanel(new GridLayout(0,4));    //makes the panel and cleans it up nicely like a grid
	JLabel decimalLabel = new JLabel("Decimal:");    //creates label and text field for all the values that we need to show the user
	JTextField decimalDisplay = new JTextField();  
	JLabel decimalEntityLabel = new JLabel("Decimal Entity:");
	JTextField decimalEntityDisplay = new JTextField();
	JLabel hexLabel = new JLabel("Hex:");
	JTextField hexDisplay = new JTextField();
	JLabel hexEntityLabel = new JLabel("Hex Entity:");
	JTextField hexEntityDisplay = new JTextField();
	JLabel alphaEntityLabel = new JLabel("Alpha Entity:");
	JTextField alphaEntityDisplay = new JTextField();
	JLabel javaLabel = new JLabel("Java Representation:");
	JTextField javaDisplay = new JTextField();


public GUI() {   //creates the GUI, its dimensions, and adds panels and buttons to it
	
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	this.add(topPanel);
    topPanel.add(textField);
    textField.setFont(new java.awt.Font("Default", Font.PLAIN,16));
	textField.setPreferredSize(new Dimension(100, 50));
	textField.setHorizontalAlignment(SwingConstants.CENTER);
	topPanel.add(button);
	this.add(new JSeparator(SwingConstants.HORIZONTAL));

	this.add(middlePanel);
	Box box1 = Box.createVerticalBox();
	box1.add(characterDisplay);
	characterDisplay.setPreferredSize(new Dimension(100, 125));
	characterDisplay.setEditable(false);  // prevents the user from editing it.
	characterDisplay.setFont(new java.awt.Font("Default", Font.PLAIN,60));
	characterDisplay.setHorizontalAlignment(SwingConstants.CENTER);
	middlePanel.add(box1);
	box1.add(descriptionLabel);
	descriptionLabel.setFont(new java.awt.Font("Default", Font.BOLD,15));
	box1.add(descriptionText);
	this.add(new JSeparator(SwingConstants.HORIZONTAL));
	
	this.add(infoPanel);        //adds all the labels and text fields in the frame
	infoPanel.add(decimalLabel);
	decimalLabel.setHorizontalAlignment(JLabel.RIGHT);
	infoPanel.add(decimalDisplay);
	decimalDisplay.setEditable(false);  // prevents the user from editing it.
	infoPanel.add(decimalEntityLabel);
	decimalEntityLabel.setHorizontalAlignment(JLabel.RIGHT);
	infoPanel.add(decimalEntityDisplay);
	decimalEntityDisplay.setEditable(false);  // prevents the user from editing it.
	infoPanel.add(hexLabel);
	hexLabel.setHorizontalAlignment(JLabel.RIGHT);
	infoPanel.add(hexDisplay);
	hexDisplay.setEditable(false);  // prevents the user from editing it.
	infoPanel.add(hexEntityLabel);
	hexEntityLabel.setHorizontalAlignment(JLabel.RIGHT);
	infoPanel.add(hexEntityDisplay);
	hexEntityDisplay.setEditable(false);  // prevents the user from editing it.
	infoPanel.add(alphaEntityLabel);
	alphaEntityLabel.setHorizontalAlignment(JLabel.RIGHT);
	infoPanel.add(alphaEntityDisplay);
	alphaEntityDisplay.setEditable(false);  // prevents the user from editing it.
	infoPanel.add(javaLabel);
	javaLabel.setHorizontalAlignment(JLabel.RIGHT);
	infoPanel.add(javaDisplay);
	javaDisplay.setEditable(false);  // prevents the user from editing it.
	
	button.addActionListener(new ActionListener () { //When the button is clicked...
		   public void actionPerformed(ActionEvent e) { 
			     if (e.getSource() == button) {
			    	 String characterInput = textField.getText();	// Obtain the input in the text field as a string.		
			    	 char firstCharacter = characterInput.charAt(0);
			    	 int decimal = firstCharacter;
			    	 String decimalEntity = "&#"+decimal;
			    	 String hexstring = Integer.toHexString(decimal);
			    	 hex = "0x"+ hexstring;
			    	 String hex_with_padded_zeroes = ("0000" + hexstring).substring(hexstring.length());   //puts in strings for different values required
			    	 String hex_with_padded_zeroes_with_0x = "0x" + hex_with_padded_zeroes;  //padded zeroes makes sure that there are always 4 digits after the x.
			    	 String hexEntity = "&#x"+ hex_with_padded_zeroes;
			    	 String javaCode = "\\u"+ hex_with_padded_zeroes;
			    	 characterDisplay.setText(Character.toString(firstCharacter));

			    	 decimalDisplay.setText(String.valueOf(decimal));
			    	 decimalEntityDisplay.setText(decimalEntity);
			    	 hexDisplay.setText(hex_with_padded_zeroes_with_0x);
			    	 hexEntityDisplay.setText(hexEntity);
			    	 javaDisplay.setText(javaCode);
			 		try
					{
						file_reader info = new file_reader(hex);    //transfers the data for the alpha entity and the description of the character from file_reader
				    	alphaEntityDisplay.setText(info.getAlphaEntity());
				    	descriptionText.setText(info.getDescription());
					}
					catch (Exception e1)
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
				    	alphaEntityDisplay.setText("None");
				    	descriptionText.setText("None");
					}
			     }
			 	}		   
		});
	}
 }