package me.kipling.springboot.thymeleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.kipling.springboot.thymeleaf.domain.User;
import me.kipling.springboot.thymeleaf.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("user/{str}")
	public List<User> getListByNameLike(@PathVariable(value = "str") String strLike) {
		return userService.findByName(strLike);
	}
}
