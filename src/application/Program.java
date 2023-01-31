package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV",900.00));
		list.add(new Product("Phone",1100.00));
		list.add(new Product("Watch", 50.00));
		list.add(new Product("Mouse",89.90));
		
		//Traditional solution
		list.removeIf(new ProductPredicate());
		
		for(Product p:list) {
			System.out.println(p);
		}
	}

}
