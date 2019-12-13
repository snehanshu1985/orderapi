package com.selfserve.orderapi.order;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@RequestMapping("/order/test")
	public String defaultResponse() {
		return "Orderapi Microservice for order is up and running fine.";
	}
}
