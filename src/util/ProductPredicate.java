package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product> {//We implement an interface using a wrapper class!

	@Override
	public boolean test(Product p) {
		
		return p.getPrice()>=100.00;
	}
	
	

}
