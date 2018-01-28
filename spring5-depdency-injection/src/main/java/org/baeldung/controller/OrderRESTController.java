package org.baeldung.controller;

import org.baeldung.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderRESTController {
	
	@Autowired
	private OrderService orderservice;
	
	@RequestMapping(method = RequestMethod.GET)
	private @ResponseBody String createOrder(@RequestParam("itemId") String itemId,@RequestParam("paymentId") String paymentId,@RequestParam("addressId") String addressId) {		
		return orderservice.createOrder(itemId, paymentId, addressId);
	}

	public OrderService getOrderservice() {
		return orderservice;
	}

	public void setOrderservice(OrderService orderservice) {
		this.orderservice = orderservice;
	}

}
