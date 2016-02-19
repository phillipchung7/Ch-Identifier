import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class file_reader {
	private String alphaEntity;
	private String description;

	public file_reader(String hex) throws Exception {
		String lines = "";
		String unparsedFile = "";
		String[] info;
		int index;
		ArrayList<String> myArray = new ArrayList<String>();

		FileReader fr = new FileReader("entityfacts.csv");
		BufferedReader br =  new BufferedReader(fr);
		while ((lines = br.readLine()) != null) {
			unparsedFile += lines;
		}
		br.close();
		info = unparsedFile.split(",\\s\\s");
		
		for (String items : info) {
			myArray.add(items.trim());
		}
		index = myArray.indexOf(hex);
		if (index != -1) {
			alphaEntity = myArray.get(index+2);
			description = myArray.get(index+3);
		}
		else {
			alphaEntity = "Not found in CSV";
			description = "Not found in CSV";
		}
	}
	
	public String getAlphaEntity() {
		return alphaEntity;
	}
	public String getDescription() {
		return description;
	}
}	
		

 
