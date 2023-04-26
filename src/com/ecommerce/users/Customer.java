package com.ecommerce.users;

import com.ecommerce.store.Cart;

public class Customer extends User {
	private Cart cart;

	@Override
	public boolean verifyUser() {
		return true;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
