package filehandling;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Path p1 = Paths.get("C:\\Users\\Krishnaprasath\\Desktop\\c++ programs");
  Boolean res = Files.exists(p1);
  
  //Path p2 = p1.subpath(0, 2);
  
  System.out.println(res);
  
  //Path p =Files.createFile(C:\\Users\\Krishnaprasath\\Desktop\\filecreaTion);
  
  
 /* FileSystem fs = FileSystems.getDefault();
  Path p1 =fs.getPath("C:\\Users\\Krishnaprasath\\Desktop\\c++ programs");
  Path p2 = p1.subpath(0, 2);
  System.out.println(p2);  */
		
	}

}
 