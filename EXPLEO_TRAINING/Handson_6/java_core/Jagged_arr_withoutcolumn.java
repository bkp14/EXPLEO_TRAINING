package java_core;

public class Jagged_arr_withoutcolumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][0];
		arr[0] = new int[]{1,2,3};
		arr[1] = new int[]{4,5};
		arr[2] = new int[]{6};
		arr[3] = new int[]{7,8,9,10};
		for(int i=0;i<4;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
