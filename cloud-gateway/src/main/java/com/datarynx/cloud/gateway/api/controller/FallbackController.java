package com.datarynx.cloud.gateway.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

/*FallBack Controller having fallback method which is executed when any API with the URI not responding*/
@RestController
public class FallbackController {

	/* Fallback method for OrderService */
	@RequestMapping("/orderFallBack")
	public Mono<String> orderServiceFallBack() {
		return Mono.just("Order Service is taking too long to respond or is down. Please try again later");
	}

	/* fallback method for Payment service */ 
	@RequestMapping("/paymentFallback")
	public Mono<String> paymentServiceFallBack() {
		return Mono.just("Payment Service is taking too long to respond or is down. Please try again later");
	}
}
