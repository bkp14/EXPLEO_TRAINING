package Handson_9_3;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class path_exists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Path p1 = Paths.get("C:\\Users\\Krishnaprasath\\Desktop\\c++ programs");
		  System.out.println("isAbsolute : "+ p1.isAbsolute());
		  System.out.println("exists :  "+ Files.exists(p1));


	}

}
