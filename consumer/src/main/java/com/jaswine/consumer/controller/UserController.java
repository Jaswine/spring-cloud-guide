package com.jaswine.consumer.controller;


import com.jaswine.consumer.bean.User;
import com.jaswine.consumer.feign.UserClient;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

	@Resource
	private RestTemplate restTemplate;
	@Resource
	private UserClient userClient;

	@GetMapping()
	public List<User> getAllUser(){
		// 使用指定方式
		return restTemplate.getForObject("http://localhost:9001/p/user", List.class);
	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable long id){
		return userClient.getUserById(id);
	}

	@GetMapping("/index")

	public String index(){
		return userClient.index();
	}

}
