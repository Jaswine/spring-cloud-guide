package com.jaswine.consumer.feign;

import com.jaswine.consumer.bean.User;
import com.jaswine.consumer.hystrix.UserFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "PROVIDER",fallback = UserFallBack.class)
public interface UserClient {

	@GetMapping("/p/user/")
	List<User> getAllUser();

	@GetMapping("/p/user/{id}")
	User getUserById(@PathVariable("id") long id);

	@GetMapping("/p/user/index/")
	String index();

}
