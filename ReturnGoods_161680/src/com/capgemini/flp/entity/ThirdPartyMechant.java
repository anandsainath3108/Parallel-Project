package com.capgemini.flp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "3_party_merchant_product")
public class ThirdPartyMechant {
	
	@Id
	@Column(name = "3_party_product_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int third_party_product_Id;
	@Column(name = "3_party_product_Name")
	private String third_party_product_Name;
	@Column(name = "3_party_product_Type")
	private String third_party_product_Type;
	@Column(name = "3_party_product_Description")
	private String third_party_product_Description;
	@Column(name = "3_party_product_Price")
	private double third_party_product_Price;
	@Column(name = "3_party_product_Image")
	private String third_party_product_Image;
    @Column(name = "3_party_product_Quantity")
	private int third_party_product_Quantity;
	@Column(name = "3_party_merchant_email_Id")
	private String third_party_merchant_email_Id;
	@Column(name = "3_party_product_Discount")
	private String third_party_product_Discount;
	@Column(name = "3_party_timeForDiscount")
	private int third_party_timeForDiscount;
	@Column(name = "3_party_product_Promo")
	private String third_party_product_Promo;
	@Column(name = "3_party_timeForPromo")
	private int third_party_timeForPromo;
	@Column(name = "3_party_numberOfProductSold")
	private int third_party_numberOfProductSold;
	@Column(name = "3_party_sellingCost")
	private double third_party_sellingCost;
	@Column(name = "3_party_exchangeAmount")
	private double third_party_exchangeAmount;
	@Column(name = "3_party_product_Exchanged")
	private String party_product_Exchanged;
	
	public ThirdPartyMechant() {
		
    }

	public int getThird_party_product_Id() {
		return third_party_product_Id;
	}

	public void setThird_party_product_Id(int third_party_product_Id) {
		this.third_party_product_Id = third_party_product_Id;
	}

	public String getThird_party_product_Name() {
		return third_party_product_Name;
	}

	public void setThird_party_product_Name(String third_party_product_Name) {
		this.third_party_product_Name = third_party_product_Name;
	}

	public String getThird_party_product_Type() {
		return third_party_product_Type;
	}

	public void setThird_party_product_Type(String third_party_product_Type) {
		this.third_party_product_Type = third_party_product_Type;
	}

	public String getThird_party_product_Description() {
		return third_party_product_Description;
	}

	public void setThird_party_product_Description(
			String third_party_product_Description) {
		this.third_party_product_Description = third_party_product_Description;
	}

	public double getThird_party_product_Price() {
		return third_party_product_Price;
	}

	public void setThird_party_product_Price(double third_party_product_Price) {
		this.third_party_product_Price = third_party_product_Price;
	}

	public String getThird_party_product_Image() {
		return third_party_product_Image;
	}

	public void setThird_party_product_Image(String third_party_product_Image) {
		this.third_party_product_Image = third_party_product_Image;
	}

	public int getThird_party_product_Quantity() {
		return third_party_product_Quantity;
	}

	public void setThird_party_product_Quantity(int third_party_product_Quantity) {
		this.third_party_product_Quantity = third_party_product_Quantity;
	}

	public String getThird_party_merchant_email_Id() {
		return third_party_merchant_email_Id;
	}

	public void setThird_party_merchant_email_Id(
			String third_party_merchant_email_Id) {
		this.third_party_merchant_email_Id = third_party_merchant_email_Id;
	}

	public String getThird_party_product_Discount() {
		return third_party_product_Discount;
	}

	public void setThird_party_product_Discount(String third_party_product_Discount) {
		this.third_party_product_Discount = third_party_product_Discount;
	}

	public int getThird_party_timeForDiscount() {
		return third_party_timeForDiscount;
	}

	public void setThird_party_timeForDiscount(int third_party_timeForDiscount) {
		this.third_party_timeForDiscount = third_party_timeForDiscount;
	}

	public String getThird_party_product_Promo() {
		return third_party_product_Promo;
	}

	public void setThird_party_product_Promo(String third_party_product_Promo) {
		this.third_party_product_Promo = third_party_product_Promo;
	}

	public int getThird_party_timeForPromo() {
		return third_party_timeForPromo;
	}

	public void setThird_party_timeForPromo(int third_party_timeForPromo) {
		this.third_party_timeForPromo = third_party_timeForPromo;
	}

	public int getThird_party_numberOfProductSold() {
		return third_party_numberOfProductSold;
	}

	public void setThird_party_numberOfProductSold(
			int third_party_numberOfProductSold) {
		this.third_party_numberOfProductSold = third_party_numberOfProductSold;
	}

	public double getThird_party_sellingCost() {
		return third_party_sellingCost;
	}

	public void setThird_party_sellingCost(double third_party_sellingCost) {
		this.third_party_sellingCost = third_party_sellingCost;
	}

	public double getThird_party_exchangeAmount() {
		return third_party_exchangeAmount;
	}

	public void setThird_party_exchangeAmount(double third_party_exchangeAmount) {
		this.third_party_exchangeAmount = third_party_exchangeAmount;
	}

	public String getParty_product_Exchanged() {
		return party_product_Exchanged;
	}

	public void setParty_product_Exchanged(String party_product_Exchanged) {
		this.party_product_Exchanged = party_product_Exchanged;
	}  
	
	
}