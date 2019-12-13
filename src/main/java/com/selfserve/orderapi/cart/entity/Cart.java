package com.selfserve.orderapi.cart.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.selfserve.orderapi.cart.utils.CartWicDetails;

@Document(collection="Cart")
public class Cart {

	@Id private String cartId;
	private String sessionId;
	private String profileId;
	private int cartCounter;
	private Date createDttm;
	private Date updateDttm;
	private List<CartWicDetails> listCartWicDetails;
	/**
	 * @return the cartId
	 */
	public String getCartId() {
		return cartId;
	}
	/**
	 * @param cartId the cartId to set
	 */
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
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
	 * @return the cartCounter
	 */
	public int getCartCounter() {
		return cartCounter;
	}
	/**
	 * @param cartCounter the cartCounter to set
	 */
	public void setCartCounter(int cartCounter) {
		this.cartCounter = cartCounter;
	}
	/**
	 * @return the createDttm
	 */
	public Date getCreateDttm() {
		return createDttm;
	}
	/**
	 * @param createDttm the createDttm to set
	 */
	public void setCreateDttm() {
		this.createDttm = new Date();
	}
	/**
	 * @return the updateDttm
	 */
	public Date getUpdateDttm() {
		return updateDttm;
	}
	/**
	 * @param updateDttm the updateDttm to set
	 */
	public void setUpdateDttm() {
		this.updateDttm = new Date();
	}
	/**
	 * @return the cartWicDetails
	 */
	public List<CartWicDetails> getlistCartWicDetails() {
		return listCartWicDetails;
	}
	/**
	 * @param cartWicDetails the cartWicDetails to set
	 */
	public void setCartWicDetails(CartWicDetails cartWicDetails) {
		listCartWicDetails.add(cartWicDetails);
	}
	
	}
