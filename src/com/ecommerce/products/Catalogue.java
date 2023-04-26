package com.ecommerce.products;

public class Catalogue {
	private Product[] listofAllProducts;
	private Product[] sellerProducts;
	private Category[] listofCategory;
	private Product[] listofSamsung;
	private Product[] listofApple;
	private Product[] listofNokia;
	private Product[] listofTable;
	private Product[] listofChair;
	private Product[] listofSofa;
	private Product[] addSellerProduct;

	public Product[] getAddSellerProduct() {
		return addSellerProduct;
	}

	public void setAddSellerProduct(Product[] addSellerProduct) {
		this.addSellerProduct = addSellerProduct;
	}

	public Product[] getListofSamsung() {
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("samsung galaxy s10");
		product1.setCost("10000");
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("samsung galaxy s20");
		product2.setCost("20000");
		listofSamsung = new Product[2];
		listofSamsung[0] = product1;
		listofSamsung[1] = product2;
		return listofSamsung;
	}

	public void setListofSamsung(Product[] listofSamsung) {
		this.listofSamsung = listofSamsung;
	}

	public Product[] getListofApple() {
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("apple iphone 12");
		product1.setCost("30000");
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("apple iphone 13");
		product2.setCost("35000");
		listofApple = new Product[2];
		listofApple[0] = product1;
		listofApple[1] = product2;
		return listofApple;
	}

	public void setListofApple(Product[] listofApple) {
		this.listofApple = listofApple;
	}

	public Product[] getListofNokia() {
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("nokia c20");
		product1.setCost("15000");
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("nokia s93");
		product2.setCost("20000");
		listofNokia = new Product[2];
		listofNokia[0] = product1;
		listofNokia[1] = product2;
		return listofNokia;
	}

	public void setListofNokia(Product[] listofNokia) {
		this.listofNokia = listofNokia;
	}

	public Product[] getListofTable() {
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("round table");
		product1.setCost("5000");
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("glass table");
		product2.setCost("8000");
		listofTable = new Product[2];
		listofTable[0] = product1;
		listofTable[1] = product2;
		return listofTable;
	}

	public void setListofTable(Product[] listofTable) {
		this.listofTable = listofTable;
	}

	public Product[] getListofChair() {
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("plastic chair");
		product1.setCost("4000");
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("wood chair");
		product2.setCost("8000");
		listofChair = new Product[2];
		listofChair[0] = product1;
		listofChair[1] = product2;
		return listofChair;
	}

	public void setListofChair(Product[] listofChair) {
		this.listofChair = listofChair;
	}

	public Product[] getListofSofa() {
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("7 seater sofa");
		product1.setCost("20000");
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("4 seater sofa");
		product2.setCost("15000");
		listofSofa = new Product[2];
		listofSofa[0] = product1;
		listofSofa[1] = product2;
		return listofSofa;
	}

	public void setListofSofa(Product[] listofSofa) {
		this.listofSofa = listofSofa;
	}

	public Category[] getListofCategory() {
		Category category1 = new Category();
		category1.setCategoryId("1");
		category1.setCategoryName("Mobile");
		Category category2 = new Category();
		category2.setCategoryId("2");
		category2.setCategoryName("Furniture");
		listofCategory = new Category[2];
		listofCategory[0] = category1;
		listofCategory[1] = category2;
		return listofCategory;
	}

	public void setListofCategory(Category[] listofCategory) {
		this.listofCategory = listofCategory;
	}

	public Product[] getSellerProducts() {
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("seller product1");
		product1.setCost("100");
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("seller product2");
		product2.setCost("200");
		sellerProducts = new Product[2];
		sellerProducts[0] = product1;
		sellerProducts[1] = product2;
		return sellerProducts;
	}

	public void setSellerProducts(Product[] sellerProducts) {
		this.sellerProducts = sellerProducts;
	}

	public Product[] getListofAllProducts() {
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("samsung galaxy s10");
		product1.setCost("10000");
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("samsung galaxy s20");
		product2.setCost("20000");
		Product product3 = new Product();
		product3.setProductId("3");
		product3.setProductName("apple iphone 12");
		product3.setCost("30000");
		Product product4 = new Product();
		product4.setProductId("4");
		product4.setProductName("apple iphone 13");
		product4.setCost("35000");
		Product product5 = new Product();
		product5.setProductId("5");
		product5.setProductName("nokia c20");
		product5.setCost("15000");
		Product product6 = new Product();
		product6.setProductId("6");
		product6.setProductName("nokia s93");
		product6.setCost("20000");
		Product product7 = new Product();
		product7.setProductId("7");
		product7.setProductName("round table");
		product7.setCost("5000");
		Product product8 = new Product();
		product8.setProductId("8");
		product8.setProductName("glass table");
		product8.setCost("8000");
		Product product9 = new Product();
		product9.setProductId("9");
		product9.setProductName("plastic chair");
		product9.setCost("4000");
		Product product10 = new Product();
		product10.setProductId("10");
		product10.setProductName("wood chair");
		product10.setCost("8000");
		Product product11 = new Product();
		product11.setProductId("11");
		product11.setProductName("7 seater sofa");
		product11.setCost("20000");
		Product product12 = new Product();
		product12.setProductId("12");
		product12.setProductName("4 seater sofa");
		product12.setCost("15000");

		listofAllProducts = new Product[12];
		listofAllProducts[0] = product1;
		listofAllProducts[1] = product2;
		listofAllProducts[2] = product3;
		listofAllProducts[3] = product4;
		listofAllProducts[4] = product5;
		listofAllProducts[5] = product6;
		listofAllProducts[6] = product7;
		listofAllProducts[7] = product8;
		listofAllProducts[8] = product9;
		listofAllProducts[9] = product10;
		listofAllProducts[10] = product11;
		listofAllProducts[11] = product12;
		return listofAllProducts;
	}

	public void setListofAllProducts(Product[] listofAllProducts) {
		this.listofAllProducts = listofAllProducts;
	}

}
