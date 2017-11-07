package premier.java.Fichiers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileAccess {
	public void readFile() {
		String path = "src/test.txt";
		
		try {
			FileReader reader = new FileReader(path);
			int currentChar = reader.read();
			while(currentChar != -1) {
				System.out.print((char)currentChar);
				currentChar = reader.read();
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
