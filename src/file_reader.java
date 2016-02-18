import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class file_reader {
	private String alphaEntity;
	private String description;

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
		alphaEntity = info[3].trim();
		description = info[4].trim();
	}
	
	public String getAlphaEntity() {
		return alphaEntity;
	}
	public String getDescription() {
		return description;
	}
}	
		

 
