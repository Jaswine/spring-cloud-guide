package com.jaswine.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 开启Eureka注册
 * 开启Feign客户端
 * 开启Hystrix容错能力
 *
 *
 * @author Jaswine
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
//@EnableCircuitBreaker
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

}
