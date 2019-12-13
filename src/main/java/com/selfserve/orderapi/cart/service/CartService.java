/**
 * 
 */
package com.selfserve.orderapi.cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selfserve.orderapi.cart.entity.Cart;
import com.selfserve.orderapi.cart.repository.CartRepository;
import com.selfserve.orderapi.cart.utils.CartInput;
import com.selfserve.orderapi.cart.utils.CartWicDetails;
import com.selfserve.orderapi.cart.utils.OrderConstant;


/**
 * @author m_209474
 *
 */

@Service
public class CartService {
	
	@Autowired CartRepository cartRepository;
	OrderConstant orderConstant;
	
	
	public String addToCart(CartInput cartInput) {
		System.out.println("Inside CartService.addtocart method");
		String cartAddStatus = null;
		Cart cartByProfileId = cartRepository.findByProfileId(cartInput.getProfileId());
		Cart cartBySessionId = cartRepository.findBySessionId(cartInput.getSessionId());
		if(cartByProfileId != null || cartBySessionId != null) {
			System.out.println("Cart already exist. It should be an update cart call");
			//updateCart(CartInput cartInput);
		}
		else {
			System.out.println("Cart does not exist. Starting the process for cart creation.");
			createCart(cartInput);
		}
		return cartAddStatus;
	}
	
	public String createCart(CartInput cartInput) {
		Cart cart = new Cart();
		CartWicDetails cartWicDetails = new CartWicDetails();
		cart.setCartCounter(1);
		cart.setCreateDttm();
		cart.setUpdateDttm();
		cart.setProfileId(cartInput.getProfileId());
		cart.setSessionId(cartInput.getSessionId());
		int quantity = Integer.parseInt(cartInput.getQuantity());
		cartWicDetails = populateWicDetails(cartInput.getWic(), quantity);
		cart.setCartWicDetails(cartWicDetails);
		if(saveCart(cart))
			return "Cart sucessefully saved in DB";
		else
			return "Something went wrong while saving cart to DB";
	}
	
	public CartWicDetails populateWicDetails(String wic, int quantity) {
		CartWicDetails cartWicDetails = new CartWicDetails();
		try {
			cartWicDetails = orderConstant.createWebClient().build().get().uri("http://localhost:5630/product/wic/getWicDetailsByWic=" +wic).retrieve().
							bodyToMono(CartWicDetails.class).block();
		}
		catch(Exception e) {
			System.out.println("Something went wrong while fetching details from product API. Exception is:"+e);
		}
		if(cartWicDetails != null) {
			cartWicDetails.setQuantity(quantity);
		}
		return cartWicDetails;
	}
	
	public boolean saveCart(Cart cart) {
		System.out.println("Inside CartService saveCart method");
		boolean saveCartmessage = false;
		try {
			cartRepository.save(cart);
			saveCartmessage = true;
		}
		catch(Exception e) {
			System.out.println("Something went wrong while saving cart information TO DB. Exception is:"+e);
			saveCartmessage = false;
		}
		return saveCartmessage;
	}

}
