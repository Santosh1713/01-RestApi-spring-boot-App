package com.bikkadit.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadit.model.User;

@RestController
public class UserRestController {

	@GetMapping("/user")
	public User getUsers(User user) {
		
		user.setUserid(101);
		user.setUserName("santosh katjkari");
		user.setUserAdrress("Aurangabad");
		return user;
		
		
	}
}
