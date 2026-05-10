package oops;
import java.util.ArrayList;
import java.util.List;
public class cart {
   private List<String> products;
   cart(){
	   products =  new ArrayList<>();
   }
   void addproducts(String productname) {
	   products.add(productname);
   }
   void removeproducts(String productname) {
	   products.remove(productname);
   }
}
