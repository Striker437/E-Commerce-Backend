package com.Ecommerce.DTO;
//use this class to send java object as JSON
public class PurchaseResponse {
	
	private String orderTrackingNumber;

	
	
	
	public PurchaseResponse(String orderTrackingNumber) {
		super();
		this.orderTrackingNumber = orderTrackingNumber;
	}




	public String getOrderTrackingNumber() {
		return orderTrackingNumber;
	}




	public void setOrderTrackingNumber(String orderTrackingNumber) {
		this.orderTrackingNumber = orderTrackingNumber;
	}
	
	
	
	
	
	

}
