package org.deepa.soap.ws;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
	
	public List<String> getProductCategories()
	{
		List<String> productCategories = new ArrayList<String>();
		productCategories.add("Books");
		productCategories.add("movies");
		productCategories.add("music");
		return productCategories;
	}

}
