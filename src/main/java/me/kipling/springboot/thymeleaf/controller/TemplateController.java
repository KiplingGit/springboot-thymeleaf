package me.kipling.springboot.thymeleaf.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * 模板测试.
 * 
 * @author Administrator
 * 
 */
@Controller
public class TemplateController {

	/**
	 * 
	 * 返回html模板
	 * 
	 */
	@RequestMapping("/helloHtml")
	public String helloHtml(Map<String, Object> map) {
		map.put("hello", "from TemplateController.helloHtml");
		return "/helloHtml";
	}
}