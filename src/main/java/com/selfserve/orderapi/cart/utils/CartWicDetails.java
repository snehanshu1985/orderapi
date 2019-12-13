package com.selfserve.orderapi.cart.utils;

public class CartWicDetails {
	private String Wic;
	private String fulfillerType;
	private double price;
	private String webExclusive;
	private boolean reorderStatus;
	private String description;
	private boolean itemStatus;
	private boolean shippingStatus;
	private int purchaseLimit;
	private String categoryId;
	private int stockLevel;
	private String availStatus;
	private int threshold;
	private int quantity;
	/**
	 * @return the wic
	 */
	public String getWic() {
		return Wic;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @param wic the wic to set
	 */
	public void setWic(String wic) {
		Wic = wic;
	}
	/**
	 * @return the fulfillerType
	 */
	public String getFulfillerType() {
		return fulfillerType;
	}
	/**
	 * @param fulfillerType the fulfillerType to set
	 */
	public void setFulfillerType(String fulfillerType) {
		this.fulfillerType = fulfillerType;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the webExclusive
	 */
	public String getWebExclusive() {
		return webExclusive;
	}
	/**
	 * @param webExclusive the webExclusive to set
	 */
	public void setWebExclusive(String webExclusive) {
		this.webExclusive = webExclusive;
	}
	/**
	 * @return the reorderStatus
	 */
	public boolean isReorderStatus() {
		return reorderStatus;
	}
	/**
	 * @param reorderStatus the reorderStatus to set
	 */
	public void setReorderStatus(boolean reorderStatus) {
		this.reorderStatus = reorderStatus;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the itemStatus
	 */
	public boolean isItemStatus() {
		return itemStatus;
	}
	/**
	 * @param itemStatus the itemStatus to set
	 */
	public void setItemStatus(boolean itemStatus) {
		this.itemStatus = itemStatus;
	}
	/**
	 * @return the shippingStatus
	 */
	public boolean isShippingStatus() {
		return shippingStatus;
	}
	/**
	 * @param shippingStatus the shippingStatus to set
	 */
	public void setShippingStatus(boolean shippingStatus) {
		this.shippingStatus = shippingStatus;
	}
	/**
	 * @return the purchaseLimit
	 */
	public int getPurchaseLimit() {
		return purchaseLimit;
	}
	/**
	 * @param purchaseLimit the purchaseLimit to set
	 */
	public void setPurchaseLimit(int purchaseLimit) {
		this.purchaseLimit = purchaseLimit;
	}
	/**
	 * @return the categoryId
	 */
	public String getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * @return the stockLevel
	 */
	public int getStockLevel() {
		return stockLevel;
	}
	/**
	 * @param stockLevel the stockLevel to set
	 */
	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}
	/**
	 * @return the availStatus
	 */
	public String getAvailStatus() {
		return availStatus;
	}
	/**
	 * @param availStatus the availStatus to set
	 */
	public void setAvailStatus(String availStatus) {
		this.availStatus = availStatus;
	}
	/**
	 * @return the threshold
	 */
	public int getThreshold() {
		return threshold;
	}
	/**
	 * @param threshold the threshold to set
	 */
	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}
	
	
}
