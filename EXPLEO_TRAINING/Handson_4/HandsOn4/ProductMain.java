package HandsOn4;
import java.util.*;
public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ProductCartManagement p1 = new ProductCartManagement
				(1,"Biscuits",30,100);
		ProductCartManagement p2 = new ProductCartManagement
				(4,"Chocolates",100,13);
		
		ProductCart p = new ProductCart();
		p.addPro(p1);
		p.addPro(p2);
		p.display();
		p.rempro(1);
		p.display();
		
		
		

	}

}
