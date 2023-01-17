package com.appsdeveloperblog.photoapp.api.gateway.PhotoAppAPIZuulGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class PhotoAppApiZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppApiZuulGatewayApplication.class, args);
	}

}
