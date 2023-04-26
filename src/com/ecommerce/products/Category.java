package com.ecommerce.products;

public class Category {
	private String categoryName;
	private String categoryId;
	private String subcategoryName;
	private String subcategoryId;
	private Category[] mobile;
	private Category[] furniture;

	public String getSubcategoryName() {
		return subcategoryName;
	}

	public void setSubcategoryName(String subcategoryName) {
		this.subcategoryName = subcategoryName;
	}

	public String getSubcategoryId() {
		return subcategoryId;
	}

	public void setSubcategoryId(String subcategoryId) {
		this.subcategoryId = subcategoryId;
	}

	public Category[] getMobile() {
		Category mobileBrand1 = new Category();
		mobileBrand1.setSubcategoryId("1");
		mobileBrand1.setSubcategoryName("Samsung");
		Category mobileBrand2 = new Category();
		mobileBrand2.setSubcategoryId("2");
		mobileBrand2.setSubcategoryName("Apple");
		Category mobileBrand3 = new Category();
		mobileBrand3.setSubcategoryId("3");
		mobileBrand3.setSubcategoryName("Nokia");
		mobile = new Category[3];
		mobile[0] = mobileBrand1;
		mobile[1] = mobileBrand2;
		mobile[2] = mobileBrand3;

		return mobile;
	}

	public void setMobile(Category[] mobile) {
		this.mobile = mobile;
	}

	public Category[] getFurniture() {
		Category furnitureType1 = new Category();
		furnitureType1.setSubcategoryId("1");
		furnitureType1.setSubcategoryName("Table");
		Category furnitureType2 = new Category();
		furnitureType2.setSubcategoryId("2");
		furnitureType2.setSubcategoryName("Chair");
		Category furnitureType3 = new Category();
		furnitureType3.setSubcategoryId("3");
		furnitureType3.setSubcategoryName("Sofa");
		furniture = new Category[3];
		furniture[0] = furnitureType1;
		furniture[1] = furnitureType2;
		furniture[2] = furnitureType3;
		return furniture;
	}

	public void setFurniture(Category[] furniture) {
		this.furniture = furniture;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
