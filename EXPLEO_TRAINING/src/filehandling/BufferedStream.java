package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try(BufferedReader bufinput = new BufferedReader(new FileReader(args[0]));
		  BufferedWriter bufoutput = new BufferedWriter(new FileWriter(args[1])))
		  {
			  String line ="";
			  while((line = bufinput.readLine())!= null) {
				  bufoutput.write(line);
				  bufoutput.newLine();
			  }
		  }
		  catch(FileNotFoundException f) {
			  System.out.println("FileNotFoundException: "+f);
		  }
  catch(IOException e) {
	  System.out.println("IOException: "+e);
  }
	}

}
