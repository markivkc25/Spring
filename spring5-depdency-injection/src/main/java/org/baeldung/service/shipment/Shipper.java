package org.baeldung.service.shipment;
/**
 * Interface responsible for dispatching the shipment
 * 
 * @author baeldung
 *
 *
 */
public interface Shipper {
	/**
	 * Receive the address send the shipment and return the tracking id.
	 * 
	 * @param address
	 * @return tracking id
	 */
	public String dispatch(String address);

}
