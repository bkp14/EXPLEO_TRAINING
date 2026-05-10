package filehandling;
import java.io.FileInputStream;
import java.io.IOException;
public class fileinputstream {
    public static void main(String[] args) {
int j=0;
        try {
            FileInputStream input = new FileInputStream("C:\\Users\\Krishnaprasath\\Downloads\\sample.txt");
          System.out.println("Data in the File: ");
          int i = input.read();
          while(i != -1) {
        	  System.out.print((char)i);
        	  j++;
        	  i=input.read();
          }
          input.close();
        } 
        catch (Exception e) {
      	  System.out.println(e);

        }
        System.out.println("length: "+j);
    }
}