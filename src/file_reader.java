import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class file_reader {     //creates and the necessary strings and ints for use
	private String alphaEntity;
	private String description;

	public file_reader(String hex) throws Exception {
		String lines = "";
		String unparsedFile = "";
		String[] info;
		int index;
		ArrayList<String> myArray = new ArrayList<String>();

		FileReader fr = new FileReader("entityfacts.csv");     //buffered reader that will split up all the lines that we will ultimately make use of to 
		BufferedReader br =  new BufferedReader(fr);
		while ((lines = br.readLine()) != null) {
			unparsedFile += lines;
		}
		br.close();
		info = unparsedFile.split(",\\s\\s");
		
		for (String items : info) {
			myArray.add(items.trim());    //removes all the unnecessary spaces
		}
		index = myArray.indexOf(hex);    //gets the alpha entity and the description
		if (index != -1) {
			alphaEntity = myArray.get(index+2);    
			description = myArray.get(index+3);
		}
		else {
			alphaEntity = "Not found in CSV";
			description = "Not found in CSV";
		}
	}
	
	public String getAlphaEntity() {     //creates the method that we can use to get the alpha entity in GUI.java
		return alphaEntity;
	}
	public String getDescription() {     //creates the method that we can use to get the alpha entity in GUI.java
		return description;
	}
}	
		

 
