package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV",900.00));
		list.add(new Product("Phone",1100.00));
		list.add(new Product("Watch", 50.00));
		list.add(new Product("Mouse",89.90));
		
		double max = 100.00;
		//Declared lambda expression
		Predicate<Product> pred = p ->p.getPrice() >=max;
		
		list.removeIf(pred);
		
		for(Product p:list) {
			System.out.println(p);
		}
	}

}
