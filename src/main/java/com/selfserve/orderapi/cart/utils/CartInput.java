package com.selfserve.orderapi.cart.utils;

import javax.validation.constraints.NotNull;

public class CartInput {
	
	@NotNull
	private String sessionId;
	private String profileId;
	@NotNull
	private String Wic;
	@NotNull
	private String quantity;
	/**
	 * @return the sessionId
	 */
	public String getSessionId() {
		return sessionId;
	}
	/**
	 * @param sessionId the sessionId to set
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	/**
	 * @return the profileId
	 */
	public String getProfileId() {
		return profileId;
	}
	/**
	 * @param profileId the profileId to set
	 */
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	/**
	 * @return the wic
	 */
	public String getWic() {
		return Wic;
	}
	/**
	 * @param wic the wic to set
	 */
	public void setWic(String wic) {
		Wic = wic;
	}
	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
	
}
