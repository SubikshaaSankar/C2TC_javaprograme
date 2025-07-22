package Day2;
import java.io.BufferedReader;
import java.net.URL;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		URL resource = FileReaderDemo.class.getResource("SUBI.txt");
		if(resource == null) {
			System.err.println("File not found");
			return;
		} 
		
		File file= new File(resource.getFile());
		
		FileReader fileReader= new FileReader(file);
		
		BufferedReader reader= new  BufferedReader(fileReader);
		
		String line;
		
		while((line = reader.readLine()) !=null) {
				
			System.out.println(line);
		}
			reader.close();
			

	}

}