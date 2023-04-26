package com.ecommerce.store;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.ecommerce.products.Catalogue;
import com.ecommerce.products.Category;
import com.ecommerce.products.Product;
import com.ecommerce.users.Customer;
import com.ecommerce.users.Seller;

/*
 * Ask which type of user are you? Customer, Seller, Administrator
 * User- Customer, Seller, Administrator
 * Customer- View products, View cart, Contact Us.
 * View products- Add the product to the cart, View cart- Checkout.
 * Seller- View your products, Add a product, Contact Us
 * View your products- delete this product. Add a product- Submit details of the product.
 * Administrator- ...
 * Product
 * Category
 * Cart
 * Order
 */
public class Store {
	public static void main(String[] args) {
		System.out.println("Welcome to the ecommerce store!");
		System.out.println("Which user are you? 1. Customer 2. Seller 3. Admin");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String typeOfUser;
		if (choice == 1) {
			typeOfUser = "Customer";
			Customer current = new Customer();
			System.out.println("What is your userId?");
			sc.nextLine();
			current.setUserid(sc.nextLine());
			System.out.println("What is your passWord?");
			sc.nextLine();
			current.setPassword(sc.nextLine());
			if (current.verifyUser() == true) {
				System.out.println("User verified!");
				while (true) {

					System.out.println(
							"Do you want to- 1. View products 2. View products by category 3. View Cart 4. Contact Us 5. Exit");
					choice = sc.nextInt();
					if (choice == 1) {
						Catalogue catalogue = new Catalogue();
						Product[] allProducts = catalogue.getListofAllProducts();
						for (int i = 0; i < allProducts.length; i++) {
							System.out.println(allProducts[i].getProductId() + " " + allProducts[i].getProductName()
									+ " " + allProducts[i].getCost());
						}
						System.out.println("Do you want to add any product to the cart? Y/N");
						sc.nextLine();
						String addToCart = sc.nextLine();
						if (addToCart.equals("Y")) {
							System.out.println("Input the product id of the product which you want to add to cart.");
							String productId = sc.nextLine();
							Product[] cartProducts = new Product[1];
							for (int i = 0; i < allProducts.length; i++) {
								if (allProducts[i].getProductId().equals(productId))
									cartProducts[0] = allProducts[i];
							}

							Cart cart = new Cart();
							cart.setCartId(current.getUserid());
							cart.setListOfProducts(cartProducts);
							current.setCart(cart);
							System.out.println("The product is successfully added to the cart");
						}
					} else if (choice == 2) {
						Catalogue catalogue = new Catalogue();
						Category[] allCategory = catalogue.getListofCategory();
						for (int i = 0; i < allCategory.length; i++) {
							System.out.println(allCategory[i].getCategoryId() + " " + allCategory[i].getCategoryName());
						}
						System.out.println("Input the category no. which you want to open");
						sc.nextLine();
						String categoryNo = sc.nextLine();
						if (categoryNo.equals("1")) {
							Category subCategory = new Category();
							Category[] subCategory1 = subCategory.getMobile();
							for (int i = 0; i < subCategory1.length; i++) {
								System.out.println(subCategory1[i].getSubcategoryId() + " "
										+ subCategory1[i].getSubcategoryName());
							}
							System.out.println("Input brand of mobile you want to buy?");
							String brand = sc.nextLine();
							if (brand.equals("1")) {
								Catalogue catalogue1 = new Catalogue();
								Product[] samsung = catalogue1.getListofSamsung();
								for (int i = 0; i < samsung.length; i++) {
									System.out.println(samsung[i].getProductId() + " " + samsung[i].getProductName()
											+ " " + samsung[i].getCost());
								}
							} else if (brand.equals("2")) {
								Catalogue catalogue1 = new Catalogue();
								Product[] apple = catalogue1.getListofApple();
								for (int i = 0; i < apple.length; i++) {
									System.out.println(apple[i].getProductId() + " " + apple[i].getProductName() + " "
											+ apple[i].getCost());
								}
							} else if (brand.equals("3")) {
								Catalogue catalogue1 = new Catalogue();
								Product[] nokia = catalogue1.getListofNokia();
								for (int i = 0; i < nokia.length; i++) {
									System.out.println(nokia[i].getProductId() + " " + nokia[i].getProductName() + " "
											+ nokia[i].getCost());
								}
							}
						} else if (categoryNo.equals("2")) {
							Category subCategory = new Category();
							Category[] subCategory2 = subCategory.getFurniture();
							for (int i = 0; i < subCategory2.length; i++) {
								System.out.println(subCategory2[i].getSubcategoryId() + " "
										+ subCategory2[i].getSubcategoryName());
							}
							System.out.println("Input type of furniture you want to buy?");
							String brand = sc.nextLine();
							if (brand.equals("1")) {
								Catalogue catalogue1 = new Catalogue();
								Product[] table = catalogue1.getListofTable();
								for (int i = 0; i < table.length; i++) {
									System.out.println(table[i].getProductId() + " " + table[i].getProductName() + " "
											+ table[i].getCost());
								}
							} else if (brand.equals("2")) {
								Catalogue catalogue1 = new Catalogue();
								Product[] chair = catalogue1.getListofChair();
								for (int i = 0; i < chair.length; i++) {
									System.out.println(chair[i].getProductId() + " " + chair[i].getProductName() + " "
											+ chair[i].getCost());
								}
							} else if (brand.equals("3")) {
								Catalogue catalogue1 = new Catalogue();
								Product[] sofa = catalogue1.getListofSofa();
								for (int i = 0; i < sofa.length; i++) {
									System.out.println(sofa[i].getProductId() + " " + sofa[i].getProductName() + " "
											+ sofa[i].getCost());
								}
							}
						}

					}

					else if (choice == 3) {
						try{
						File orderdetail = new File(current.getUserid());
						Product[] cartProducts = current.getCart().getListOfProducts();
						System.out.println("your cart Id: " + current.getCart().getCartId());
						for (int i = 0; i < cartProducts.length; i++) {
							System.out.println(cartProducts[i].getProductId() + " " + cartProducts[i].getProductName()
									+ " " + cartProducts[i].getCost());
						}
						System.out.println("Do you want to checkout? Y/N");
						sc.nextLine();
						String checkout = sc.nextLine();
						Order order = new Order();
						if (checkout.equals("Y"))
							order.setUser(current);
						order.setOrderId("1");
						if (current.getCart().checkOut())

							// Create an order object and assign this user to the order with an order id
							System.out.println("order is placed successfully" + " for user " + current.getUserid()
									+ " with order Id" + order.getOrderId());
						try {
							BufferedWriter bw = new BufferedWriter(new FileWriter(orderdetail));
							bw.write("order is placed successfully");
							bw.newLine();
							bw.write("For user with user Id: " + current.getUserid() + " and order Id is"
									+ order.getOrderId());
							System.out.println("File with order Id is created successfully");
							bw.close();
						} catch (IOException e) {
							System.out.println("writing to file is unsuccessfully");
							e.printStackTrace();
						}

					}catch(NullPointerException e) {
						System.out.println("The cart is Empty.");
					}
					}
					else if (choice == 4) {
						System.out.println("To contact us, please email on store@ecommerce.com");
					} else if (choice == 5)
						break;
					else
						System.out.println("Invalid choice, please try again.");

				}
			}
		} else if (choice == 2) {
			typeOfUser = "Seller";
			Seller current = new Seller();
			System.out.println("What is your userId?");
			sc.nextLine();
			current.setUserid(sc.nextLine());
			System.out.println("What is your passWord?");
			current.setPassword(sc.nextLine());
			if (current.verifyUser() == true) {
				System.out.println("User verified!");
				while (true) {

					System.out.println("Do you want to- 1. View your products 2. Add a product 3. add seller product 4. Contact Us 5. Exit ");
					choice = sc.nextInt();
					if (choice == 1) {
						Catalogue catalogue = new Catalogue();

						Product[] sellerProducts = catalogue.getSellerProducts();
						for (int i = 0; i < sellerProducts.length; i++) {
							System.out.println(sellerProducts[i].getProductId() + " "
									+ sellerProducts[i].getProductName() + " " + sellerProducts[i].getCost());
						}
					} else if (choice == 2) {
						System.out.println("Do you want to add any product to the Seller list? Y/N");
						sc.nextLine();
						String addToSeller = sc.nextLine();
						Catalogue catalogue = new Catalogue();
						Product[] sellerProducts = catalogue.getSellerProducts();
						if (addToSeller.equals("Y")) {
							System.out.println(
									"Input the product id of the product which you want to add to sellerlist.");
							String productId = sc.nextLine();
							Product[] addProducts = new Product[1];
							for (int i = 0; i < sellerProducts.length; i++) {
								if (sellerProducts[i].getProductId().equals(productId))
									addProducts[0] = sellerProducts[i];
							}

							Seller seller = new Seller();
							seller.setProductsListed(addProducts);
							current.setProductsListed(addProducts);
							System.out.println("The product is successfully added to the seller list");
						}
					} else if (choice == 3) {
						System.out.println("enter product details 1. productid 2. name 3. cost");
						sc.nextLine();
						String productid=sc.nextLine();
						String productname=sc.nextLine();
						String productcost=sc.nextLine();
						Product[] array =new Product[1];
						Product p =new Product();
						p.setProductId(productid);
						p.setProductName(productname);
						p.setCost(productcost);
						array[0]=p;
						Catalogue add =new Catalogue();
						add.setAddSellerProduct(array);
						Product[] sellerproduct=add.getAddSellerProduct();
						for(int i=0;i<sellerproduct.length;i++) {
							System.out.println(sellerproduct[i].getProductId()+" "+sellerproduct[i].getProductName()+" "+sellerproduct[i].getCost());
						}
						System.out.println("product is successfully add to the seller list.");
						
					}else if (choice == 4) {
						System.out.println("To contact us, please email on store@ecommerce.com");
					} else if (choice == 5) {
						break;
					}
					else {
						System.out.println("Invalid choice, please try again.");
					}
				}
			}
		} else if (choice == 3) {
			typeOfUser = "Admin";
			while (true) {

				System.out.println("Do you want to- 1. View all products 2. Contact us 3. Exit");
				int choiceAdmin = sc.nextInt();
				if (choiceAdmin == 1) {
					Catalogue catalogue = new Catalogue();
					Product[] show = catalogue.getListofAllProducts();
					System.out.println("List of all Products: ");
					for (int i = 0; i < show.length; i++) {
						System.out.println(
								show[i].getProductId() + " " + show[i].getProductName() + " " + show[i].getCost());
					}
					Product[] show2 = catalogue.getSellerProducts();
					System.out.println("Seller products: ");
					for (int i = 0; i < show2.length; i++) {
						System.out.println(
								show2[i].getProductId() + " " + show2[i].getProductName() + " " + show2[i].getCost());
					}
				} else if (choiceAdmin == 2) {
					System.out.println("To contact us, please email on store@ecommerce.com");
				} else if (choiceAdmin == 3) {
					break;
				} else {
					System.out.println("Invalid choice");
				}
			}
		} else {
			System.out.println("Invalid input. Try again");
		}
	}
}