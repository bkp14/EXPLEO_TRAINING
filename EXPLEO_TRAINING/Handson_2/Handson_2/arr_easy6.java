package Handson_2;

import java.util.Scanner;

public class arr_easy6 {

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
			for (int j = i + 1; j < n; j++) {
				if (visited[i]) {
					continue;
				}
				if (arr[i] == arr[j]) {
					visited[i] = true;
					System.out.println("duplicate: " + arr[i]);
				}
			}
		}

	}

}
