package com.mobile.entity;

public class Offers {

	private int offId;
	private String offOnCreditCard;
	private String offOnCreditEmi;
	private String offOnCreditCash;

	public Offers(String offOnCreditCard, String offOnCreditEmi, String offOnCreditCash) {
		super();
		this.offOnCreditCard = offOnCreditCard;
		this.offOnCreditEmi = offOnCreditEmi;
		this.offOnCreditCash = offOnCreditCash;
	}

	public Offers(int offId, String offOnCreditCard, String offOnCreditEmi, String offOnCreditCash) {
		super();
		this.offId = offId;
		this.offOnCreditCard = offOnCreditCard;
		this.offOnCreditEmi = offOnCreditEmi;
		this.offOnCreditCash = offOnCreditCash;
	}

	public Offers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOffOnCreditCard() {
		return offOnCreditCard;
	}

	public void setOffOnCreditCard(String offOnCreditCard) {
		this.offOnCreditCard = offOnCreditCard;
	}

	public String getOffOnCreditEmi() {
		return offOnCreditEmi;
	}

	public void setOffOnCreditEmi(String offOnCreditEmi) {
		this.offOnCreditEmi = offOnCreditEmi;
	}

	public String getOffOnCreditCash() {
		return offOnCreditCash;
	}

	public void setOffOnCreditCash(String offOnCreditCash) {
		this.offOnCreditCash = offOnCreditCash;
	}

	public int getOffId() {
		return offId;
	}

	public void setOffId(int offId) {
		this.offId = offId;
	}

}
