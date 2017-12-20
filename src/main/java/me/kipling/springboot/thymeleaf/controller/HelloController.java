package me.kipling.springboot.thymeleaf.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这里使用@Controller,而不是@RestController注解
 * 因为@RestController,表示同时使用@Controller和@ResponseBody，所以会返回hello
 * 而不是返回hello.html的内容。
 * 
 * @author howieli
 *
 */
@Controller
public class HelloController {

	@RequestMapping(value = "/hello")
	public String helloGet(Map<String, Object> map) {
		 map.put("name", "HowieLi");
		return "hello";
	}
}