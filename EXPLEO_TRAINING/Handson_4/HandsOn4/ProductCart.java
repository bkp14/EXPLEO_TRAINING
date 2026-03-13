package HandsOn4;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class ProductCart {

	private List<ProductCartManagement> products = new ArrayList<>();

	public void addPro(ProductCartManagement a) {
		products.add(a);
	}
	
	public void rempro(int proid) {
		for(ProductCartManagement b : products) {
			if(b.getProint()==proid) {
				products.remove(b);
			}
		}
	}
	public void calcutot(int tot) {
		int tota=0;
		for(ProductCartManagement b : products) {
			tota+=b.caltotal();
		}
		System.out.println("total : "+tota);
	}
	
	public void display() {
		for(ProductCartManagement b : products) {
			b.getpro();
		}
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
