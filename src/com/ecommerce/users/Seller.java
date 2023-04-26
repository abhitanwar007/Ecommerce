package com.ecommerce.users;

import com.ecommerce.products.Product;

public class Seller extends User {
	Product[] productsListed;

	
	public boolean verifyUser() {
		return true;
	}

	public Product[] getProductsListed() {
		return productsListed;
	}

	public void setProductsListed(Product[] productsListed) {
		this.productsListed = productsListed;
	}

}
