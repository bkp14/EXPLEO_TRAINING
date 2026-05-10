package HandsOn4;
import java.util.*;
public class ProductCartManagement {
	private int proid;
	private String proname;
	private double proprice;
	private int proquan;
	
	
	ProductCartManagement(int proid,String proname,
			double proprice,int proquan){
		this.proid = proid;
		this.proname = proname;
		this.proprice = proprice;
		this.proquan = proquan;
	}
	
	public int getProint() {
		return proid;
	}

	public void setProint(int proint) {
		this.proid = proint;
	}

	public String getProname() {
		return proname;
	}


	public void setProname(String proname) {
		this.proname = proname;
	}

	public double getProprice() {
		return proprice;
	}

	public void setProprice(double proprice) {
		this.proprice = proprice;
	}

	public int getProquan() {
		return proquan;
	}

	public void setProquan(int proquan) {
		this.proquan = proquan;
	}

	
	public void setquan(int newquan) {
		if(newquan>=0) {
			this.proquan = newquan;
		}
		else {
			System.out.println("Invalid quantity");
		}
	}
	
	

	public void getpro() {
		System.out.println("Product Id: "+proid);
		System.out.println("Product name : "+proname);
		System.out.println("Product price : "+proprice);
		System.out.println("Product Quantity : "+proquan);
	}
	
	public double caltotal() {
		return proprice*proquan;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
