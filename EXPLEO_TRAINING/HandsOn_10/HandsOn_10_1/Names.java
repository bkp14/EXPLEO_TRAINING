package HandsOn_10_1;//ji

import java.util.*;

public class Names {

	// TODO Auto-generated method stub
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		List<String> name = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			name.add(s);
		}
		for (int i = 0; i < n; i++) {
			if (name.get(i).length() > 5) {

				System.out.println(name.get(i));
			}
		}
	}
}
