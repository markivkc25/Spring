package org.baeldung.service.payment;

import org.baeldung.service.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {

	/*<bean id="paypalService" class="org.baeldung.service.payment.PaypalService" />*/
	@Bean
	public PaypalService paypalService() {
		return new PaypalService();
	}
	
	/*<bean id="visaService" class="org.baeldung.service.payment.VisaService" />*/
	@Bean
	public VisaService visaService() {
		return new VisaService();
	}
	
	/*<bean id="masterCardService" class="org.baeldung.service.payment.MasterCardService" />*/
	@Bean
	public MasterCardService masterCardService() {
		return new MasterCardService();
	}
	
	/*<bean id="paymentBean" class="org.baeldung.service.PaymentService" />*/
	@Bean(name="paymentBean")
	public PaymentService paymentService() {
		PaymentService paymentService=new PaymentService();
		//Setter Based injection - <property name="payer" ref="paypalService"></property>
		paymentService.setPayer(paypalService());
		return paymentService;
	}

}
