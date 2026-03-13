/**
* The
MovieSeat class implements an application that illustrate the access of multidimensional array elements*/
package java_core;
import java.util.Scanner;
public class arrprac_jagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row size");
		int r = sc.nextInt();
		int vc=0,pc=0,rc=0;
		char arr[][]= new char[r][];
		for(int i=0;i<r;i++) {
			System.out.println("enter cloumn size");
			int c =sc.nextInt();
			arr[i] = new char[c];
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.next().charAt(0);
			}
		}
		for(int i=0;i<r;i++) {
			if(i ==0) {
				System.out.println("vip seat");
			}
			else if(i==1) {
				System.out.println("premium seat");

			}
			else {
				System.out.println("regular seat");

			}
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
				if (i==0&&arr[i][j]=='A') {
					vc++;
				}
				else if(i>0&& i<3  && arr[i][j]=='A') {
					pc++;
				}
				else if(i>=3  && arr[i][j]=='A') {
					rc++;
				}
			}
			System.out.println();
		}
		System.out.println("seat details:");
		System.out.println("vip avail "+vc);
		System.out.println("premium avail "+pc);
		System.out.println("regular avail "+rc);


	}

}
