package filehandling;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class charioistream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  char b[] = new char[125];
		  try {
			  FileReader fr = new FileReader(args[0]);
		  
				  FileWriter fw = new FileWriter(args[1]);
				  
					  int count =0;int read =0;
					  while((read = fr.read(b))!=-1) {
						  fw.write(b);
						 // System.out.println(Ar)
						  count+=read;
					  }
					  System.out.println("Total count"+ count);
				  } catch(FileNotFoundException f) {
					  System.out.println("FileNotFound"+ f);

				  }
				  catch(IOException e) {
					  System.out.println("IOException"+ e);

				  }
	}

}
