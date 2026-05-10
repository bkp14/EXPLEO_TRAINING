package Handson_9_h_1;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class hard_1 {

    public static void main(String[] args) throws Exception {

    	  Path p = Paths.get("C:\\Users\\Krishnaprasath\\Desktop\\c++ programs");
    	  System.out.println("Files exists or not : "+Files.exists(p));
    	  System.out.println("Get Path : "+p);
    	  Path target = Paths.get("Add.txt");
    	  Path link = Paths.get("Add_link.txt");

    	  try {
    	      Files.createSymbolicLink(link, target);
    	      System.out.println("Soft link created");
    	   } 
    	  catch (Exception e) {
    	      System.out.println(e);
    	  }
    	  
    	  File f = new File("Add.txt");
    	  if(f.canRead()) {
    	   System.out.println("Readable");
    	  }
    	  else {
    	   System.out.println("not readable");
    	  }
    	 }

    	}