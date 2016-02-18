import javax.swing.JFrame;

public class Identifier_Main
{
	public static void main(String[] args) throws Exception
	{
		JFrame frame = new JFrame();
		frame.setVisible(true); 
		frame.setSize(650,550); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setTitle("Character Identifier");
		
		GUI panel = new GUI();
		frame.add(panel);
		new file_reader("0x5e");
	}

}
