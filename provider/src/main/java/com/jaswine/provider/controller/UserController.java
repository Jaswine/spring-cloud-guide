package com.jaswine.provider.controller;


import com.jaswine.provider.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

	/**
	 * 获得所有用户
	 * @return res
	 */
	@GetMapping
	public List<User> getAllUser() {
		List<User> users = new ArrayList<>();

		log.info("获得所有用户");

		users.add(new User(1,"jaswine1","china1"));
		users.add(new User(2,"jaswine2","china2"));
		users.add(new User(3,"jaswine3","china3"));
		users.add(new User(4,"jaswine4","china4"));

		return users;
	}

	/**
	 * id-->user
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public User getUserById(@PathVariable long id){
		log.info("获得id为{"+id+"}的用户");
		return new User(12, "jaswine","china" );
	}

	@GetMapping("/index")
	public String index(){
		log.info("index");
		return "index";
	}
}
