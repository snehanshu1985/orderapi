package com.selfserve.orderapi.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.selfserve.orderapi.cart.service.CartService;
import com.selfserve.orderapi.cart.utils.CartInput;

@RestController
public class CartController {
	
	@Autowired
	CartService cartService;

	@RequestMapping("/cart/test")
	public String defaultResponse() {
		return "Orderapi Microservice for cart is up and running fine.";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/cart/addtocart")
	public String addToCart(@RequestBody CartInput cartInput) {
		return cartService.addToCart(cartInput);
	}
}
