package Handson_9_4;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class modified_time {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  Path p1 = Paths.get("C:\\Users\\Krishnaprasath\\Desktop\\c++ programs");
         System.out.println(Files.getLastModifiedTime(p1));
	}

}
