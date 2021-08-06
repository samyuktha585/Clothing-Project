package com.clothing.model;

public class Cloth {
		private int id;
		private String type;
		private String brand;
		private double price;

		public Cloth(int id, String type, String brand, double price) {
			super();
			this.id = id;
			this.type = type;
			this.brand = brand;
			this.price = price;
		}

		@Override
		public String toString() {
			return "MaterialId=" + id + ",MaterialType=" + type + ", Brand=" + brand + ", Price=" + price;
		}

		public int getMaterialId() {
			return id;
		}

		public void setMaterialId(int mobileId) {
			this.id = mobileId;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

	}
	
	