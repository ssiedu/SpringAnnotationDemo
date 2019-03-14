package com.ssi;

public class Card {
	private String cardNo;
	private String ctype;
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	@Override
	public String toString() {
		return "Card [cardNo=" + cardNo + ", ctype=" + ctype + "]";
	}
	
}
