package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  byte b[] = new byte[125];
  try {
	  FileInputStream fis = new FileInputStream("E:\\backend\\sample.txt");
  
		  FileOutputStream fos = new FileOutputStream("E:\\backend\\op.txt");
		  
			  System.out.println("Bytes Avaialable: "+fis.available());
			  int count =0;int read =0;
			  while((read = fis.read(b))!=-1) {
				  fos.write(b);
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
