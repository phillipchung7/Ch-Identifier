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
		file_reader info = new file_reader("0x2dd");
		
		System.out.println(info.getAlphaEntity());
		System.out.println(info.getDescription());
	}

}
