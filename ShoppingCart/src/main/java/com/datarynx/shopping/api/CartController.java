package com.datarynx.shopping.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import reactor.core.publisher.Mono;

@RestController
@EnableHystrix
@EnableHystrixDashboard
public class CartController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/orderFallBack")
	public Mono<String> orderServiceFallBack() {
		return Mono.just("Order Service is taking too long to respond or is down. Please try again later");
	}

	@RequestMapping("/paymentFallback")
	public Mono<String> paymentServiceFallBack() {
		return Mono.just("Payment Service is taking too long to respond or is down. Please try again later");
	}
	

}