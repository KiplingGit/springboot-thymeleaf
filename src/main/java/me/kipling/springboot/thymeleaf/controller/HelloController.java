package me.kipling.springboot.thymeleaf.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import me.kipling.springboot.thymeleaf.domain.User;

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

	/**
	 * 
	 * 由于使用thymeleaf的html5模板，所以我将index.html模板文件
	 * 直接放到了/src/java/resources/templates目录下。然而这个目录并不是首页文件的默认目录，所以我们需要手动将应用根路径映射到
	 * /src/java/resources/templates/index.html下。
	 * 这个在spring-mvc的Controller下映射一下就可以了。
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/hello")
	public String helloGet(Map<String, Object> map) {
		map.put("name", "HowieLi");
		return "hello";
	}
	
	@GetMapping(value = "/aa")
	public String toaa(Model model) {
		User user = new User();
		user.setAge(27);
		user.setName("Kipling");
		model.addAttribute(user);
		return "user/aa";
	}
	
	//提交表单后进行数据读取，并将数据传出
    @RequestMapping(value = "/bb",method = RequestMethod.POST)
    public String bb(User user,Model model) {
        model.addAttribute("user", user);
        model.addAttribute("message", ",welcome");
        return "user/bb";
    }
	
	/**
     * 测试hello
     * @return
     */
    @RequestMapping(value = "/hello11",method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("name", "Dear");
        return "hello";
    }
}