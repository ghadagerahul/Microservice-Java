package com.mobile.entity;

import java.util.List;

public class Pricing {

	private int mobCode;
	private String actualPrice;
	private String discount;
	private String finalPrice;

	private String offers;

	public Pricing(String actualPrice, String discount, String finalPrice) {
		super();
		this.actualPrice = actualPrice;
		this.discount = discount;
		this.finalPrice = finalPrice;
	}

	public Pricing(int mobCode, String actualPrice, String discount, String finalPrice, String offers) {
		super();
		this.mobCode = mobCode;
		this.actualPrice = actualPrice;
		this.discount = discount;
		this.finalPrice = finalPrice;
		this.offers = offers;
	}

	public String getOffers() {
		return offers;
	}

	public void setOffers(String offers) {
		this.offers = offers;
	}

	public Pricing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMobCode() {
		return mobCode;
	}

	public void setMobCode(int mobCode) {
		this.mobCode = mobCode;
	}

	public String getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(String actualPrice) {
		this.actualPrice = actualPrice;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(String finalPrice) {
		this.finalPrice = finalPrice;
	}

}
