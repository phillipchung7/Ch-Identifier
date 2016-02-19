import javax.swing.JFrame;

public class Identifier_Main
{
	public static void main(String[] args) throws Exception
	{
		GUI panel = new GUI();
		JFrame frame = new JFrame();
		frame.setVisible(true); 
		frame.setSize(600,500); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setTitle("Character Identifier");
		frame.add(panel);
	}

}
