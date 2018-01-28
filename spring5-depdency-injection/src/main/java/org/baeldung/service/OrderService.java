package org.baeldung.service;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class responsible for creating the order and dispatching it
 * 
 * @author baeldung
 *
 *
 */
public class OrderService {

	private PaymentService paymentService;
	private ShipmentService shippmentService;
	
	private static Logger logger = LoggerFactory.getLogger(OrderService.class);


	/**
	 * 
	 * @return
	 */
	public PaymentService getPaymentService() {
		return paymentService;
	}

	/**
	 * 
	 * @param paymentService
	 */
	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	/**
	 * 
	 * @return
	 */
	public ShipmentService getShippmentService() {
		return shippmentService;
	}
	
	/**
	 * 
	 * @param shippmentService
	 */
	public void setShippmentService(ShipmentService shippmentService) {
		this.shippmentService = shippmentService;
	}

	/**
	 * This method will be used to create the order using the shipment and payment
	 * service.
	 * 
	 * @return - Order Confirmation Number Id
	 */
	public String createOrder(String itemId, String paymentId,String address) {
		logger.info("Recieved order for ItemId - {} - PaymentId - {}",itemId, paymentId);
		//Generate the OrderId
		UUID orderId=UUID.randomUUID();
		logger.info("Created Order Id {}",orderId.toString());
		//Get the Payment status
		boolean paymentStatus=paymentService.processPayment(paymentId);
		logger.info("Payment Status for orderId:{},- {}",orderId,paymentStatus);
		//Send the shipment to get the tracking Id
		String trackingId=shippmentService.dispatchPackage(address);
		logger.info("Shipment tracking number:{} Status for order number:{}",trackingId,orderId);
		return trackingId;
	}

}
