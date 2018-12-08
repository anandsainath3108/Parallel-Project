package com.capgemini.flp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_product")
public class Admin {
	   @Id
	   @Column(name="product_Id")
	   @GeneratedValue(strategy=GenerationType.AUTO)
		 private int product_Id;
		 private String product_Name;
		 private String product_Category;
		 private String product_Description;
		 private String product_Price;
		 private int product_Quantity;
		 private String seller_email_Id;
	     private int product_Discount;
		 private int timeForDiscount;
		 private String product_Promo;
		 private int timeForPromo;
		 private int numberOfProductSold;
		 private int numberOfProductExchanged;
	     private double sellingAmount;
	     private double exchangeAmount;
	     public Admin()
	     {
	    	 
	     }
		public int getProduct_Id() {
			return product_Id;
		}
		public void setProduct_Id(int product_Id) {
			this.product_Id = product_Id;
		}
		public String getProduct_Name() {
			return product_Name;
		}
		public void setProduct_Name(String product_Name) {
			this.product_Name = product_Name;
		}
		public String getProduct_Category() {
			return product_Category;
		}
		public void setProduct_Category(String product_Category) {
			this.product_Category = product_Category;
		}
		public String getProduct_Description() {
			return product_Description;
		}
		public void setProduct_Description(String product_Description) {
			this.product_Description = product_Description;
		}
		public String getProduct_Price() {
			return product_Price;
		}
		public void setProduct_Price(String product_Price) {
			this.product_Price = product_Price;
		}
		public int getProduct_Quantity() {
			return product_Quantity;
		}
		public void setProduct_Quantity(int product_Quantity) {
			this.product_Quantity = product_Quantity;
		}
		public String getSeller_email_Id() {
			return seller_email_Id;
		}
		public void setSeller_email_Id(String seller_email_Id) {
			this.seller_email_Id = seller_email_Id;
		}
		public int getProduct_Discount() {
			return product_Discount;
		}
		public void setProduct_Discount(int product_Discount) {
			this.product_Discount = product_Discount;
		}
		public int getTimeForDiscount() {
			return timeForDiscount;
		}
		public void setTimeForDiscount(int timeForDiscount) {
			this.timeForDiscount = timeForDiscount;
		}
		public String getProduct_Promo() {
			return product_Promo;
		}
		public void setProduct_Promo(String product_Promo) {
			this.product_Promo = product_Promo;
		}
		public int getTimeForPromo() {
			return timeForPromo;
		}
		public void setTimeForPromo(int timeForPromo) {
			this.timeForPromo = timeForPromo;
		}
		public int getNumberOfProductSold() {
			return numberOfProductSold;
		}
		public void setNumberOfProductSold(int numberOfProductSold) {
			this.numberOfProductSold = numberOfProductSold;
		}
		public int getNumberOfProductExchanged() {
			return numberOfProductExchanged;
		}
		public void setNumberOfProductExchanged(int numberOfProductExchanged) {
			this.numberOfProductExchanged = numberOfProductExchanged;
		}
		public double getSellingAmount() {
			return sellingAmount;
		}
		public void setSellingAmount(double sellingAmount) {
			this.sellingAmount = sellingAmount;
		}
		public double getExchangeAmount() {
			return exchangeAmount;
		}
		public void setExchangeAmount(double exchangeAmount) {
			this.exchangeAmount = exchangeAmount;
		}
	     
}
