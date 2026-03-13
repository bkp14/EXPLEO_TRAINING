package filehandling;

import java.io.FileOutputStream;

public class fileoutputstreamdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String data ="Welcome to java portal!!! have a happy learning";
     try {
    	 FileOutputStream output= new FileOutputStream("E:\\backend\\sample.txt");
    	 byte[] array = data.getBytes();
    	 output.write(array);
    	 output.close();
     }
     catch(Exception e){
    	 System.out.println(e);
     }
	}

}
