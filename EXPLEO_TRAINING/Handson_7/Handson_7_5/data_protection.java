package Handson_7_5;
import java.util.Scanner;
public class data_protection {
  static String masking(String log) {
	  log = log.replaceAll("Password=[^;]*", "Password= *********");
	  log=log.replaceAll("\\d+\\.\\d+\\.\\d+\\.\\d+", "xxx.xxx.xxx.xxx");
	  return log;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println((masking(sc.nextLine())));
	}

}
