package filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class softlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Path existingFilePath = Paths.get("C:\\Users\\Krishnaprasath\\Desktop\\c++ programs");
   Path symLinkPath = Paths.get("C:\\c++ programs");
    try {
    	Files.createSymbolicLink(symLinkPath, existingFilePath);
    	
    } catch (IOException x) {
    	System.out.println(x);
    } catch (UnsupportedOperationException x) {
    	System.out.println(x);
    }
	}

}
