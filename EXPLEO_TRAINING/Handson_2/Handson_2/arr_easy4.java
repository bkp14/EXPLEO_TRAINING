package Handson_2;

import java.util.Scanner;

public class arr_easy4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean visited[] = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				continue;
			}
			int c = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					c++;
				}
			}
			System.out.println(arr[i] + "->" + c);
		}
	}

}
