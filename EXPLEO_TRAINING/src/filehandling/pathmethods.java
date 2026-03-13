package filehandling;

import java.nio.file.Path;
import java.nio.file.Paths;

public class pathmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Path p1 = Paths.get("C:\\Users\\Krishnaprasath\\Desktop\\c++ programs");
  Path normalizedPath= p1.normalize();
  
  Path p2 = Paths.get("C:\\Users\\Krishnaprasath\\Desktop\\c++ programs");
  System.out.println("normalizedpath"+ normalizedPath);
  Path subpath = p1.subpath(1, 3);
  System.out.println("subpath: "+ subpath);
  
  System.out.println("getFileName: "+ p1.getFileName());
  System.out.println("getParent: "+ p1.getParent());
  System.out.println("getNameCount: "+ p1.getNameCount());
  System.out.println("getRoot: "+ p1.getRoot());
  
  System.out.println("isAbsolute: "+ p1.isAbsolute());
  System.out.println("toAbsolutePath: "+ p1.toAbsolutePath());
  System.out.println("toURI: "+ p1.toUri());

  if(p1.equals(p2)) {
	  System.out.println("both equal");

  }
  else {
	  System.out.println("both not equal");

  }


  
  

  

	}

}
