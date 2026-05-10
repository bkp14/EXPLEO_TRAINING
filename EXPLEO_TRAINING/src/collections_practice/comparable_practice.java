package collections_practice;

import java.util.*;

class mobile implements Comparable<mobile> {
	private String name;
	private int ram;
	private int price;

	public mobile(String name, int ram, int price) {
		this.name = name;
		this.ram = ram;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getRam() {
		return ram;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public int compareTo(mobile o) {
		return Integer.compare(this.ram, o.getRam());
	}
}

// 🔹 Comparator for Price
class PriceCompare implements Comparator<mobile> {
	@Override
	public int compare(mobile m1, mobile m2) {
		return Integer.compare(m1.getPrice(), m2.getPrice());
	}
}

// 🔹 Comparator for Name
class NameCompare implements Comparator<mobile> {
	@Override
	public int compare(mobile m1, mobile m2) {
		return m1.getName().compareTo(m2.getName());
	}
}

public class comparable_practice {
	public static void main(String[] args) {

		List<mobile> mobileList = new ArrayList<>();

		mobileList.add(new mobile("RedMe", 16, 800));
		mobileList.add(new mobile("apple", 8, 100));
		mobileList.add(new mobile("samsung", 4, 600));

		// 🔹 Sort by RAM (Comparable)
		Collections.sort(mobileList);
		System.out.println("Sorted by RAM");
		System.out.println("name\t ram\t price");

		for (mobile m : mobileList) {
			System.out.println(m.getName() + "\t" + m.getRam() + "\t" + m.getPrice());
		}

		System.out.println();

		// 🔹 Sort by Price
		Collections.sort(mobileList, new PriceCompare());
		System.out.println("Sorted by Price");
		for (mobile m : mobileList) {
			System.out.println(m.getName() + "\t" + m.getRam() + "\t" + m.getPrice());
		}

		System.out.println();

		// 🔹 Sort by Name
		Collections.sort(mobileList, new NameCompare());
		System.out.println("Sorted by Name");

		for (mobile m : mobileList) {
			System.out.println(m.getName() + "\t" + m.getRam() + "\t" + m.getPrice());
		}
	}
}