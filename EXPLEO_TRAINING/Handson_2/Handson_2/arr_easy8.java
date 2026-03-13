package Handson_2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class arr_easy8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[99];
		Random r = new Random();
		int miss = r.nextInt(100)+1;
		int in=0;
		for(int i=1;i<=100;i++) {
			if(i!=miss) {
				arr[in++]=i;
			}
		}
		Arrays.sort(arr);
		for(int i=0;i<100;i++) {
			if(arr[i]!=(i+1)) {
				System.out.print((i+1));
				break;
			}
		}
	}

}
