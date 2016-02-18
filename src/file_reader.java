import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class file_reader {
	
	public file_reader(String hex) throws Exception {
		
		String lines = "";
		String[] info = null;
		ArrayList<String> myArray = new ArrayList<String>();

		FileReader fr = new FileReader("entityfacts.csv");
		BufferedReader br =  new BufferedReader(fr);
		while ((lines = br.readLine()) != null) {
			myArray.add(lines);
		}
		br.close();
		int index = 0;
		for (String myArrayItems : myArray) {
			  if (myArrayItems.contains(hex)) {
				  index = myArray.indexOf(myArrayItems);
				  break;
			  }
		}
		
		info = myArray.get(index).split(",\\s\\s");
		String alphaEntity = info[3].trim();
		String description = info[4].trim();
		System.out.println(alphaEntity);
		System.out.println(description);
		
	}
}	
		

 
