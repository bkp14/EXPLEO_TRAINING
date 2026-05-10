/** it implements an application thet illustrate the access of multidimensiional array elements*/
package java_core;

public class Arraydemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[][]= new int[][]{{1,2},{3,4},{5,6}};
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr[i].length;j++) {
    		System.out.print(arr[i][j]+"  ");
    	}
    	System.out.println("");
    }
	}

}
 