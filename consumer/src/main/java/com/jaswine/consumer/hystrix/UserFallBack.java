package com.jaswine.consumer.hystrix;

import com.jaswine.consumer.bean.User;
import com.jaswine.consumer.feign.UserClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFallBack implements UserClient {


	@Override
	public List<User> getAllUser() {
		return null;
	}

	@Override
	public User getUserById(long id) {
		return null;
	}

	@Override
	public String index() {
		return "服务坏了，正在抢修....";
	}
}
