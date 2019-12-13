package com.selfserve.orderapi.cart.utils;

import org.springframework.web.reactive.function.client.WebClient;

import com.selfserve.orderapi.cart.entity.Cart;

public class OrderConstant {
	
	
	public Cart createCart() {
		return new Cart();
	}
	
	
	public CartWicDetails cartWicDetails() {
		CartWicDetails cartWicDetails = new CartWicDetails();
		return cartWicDetails;
	}
	

	public WebClient.Builder createWebClient() {
		return WebClient.builder();
	}
}
