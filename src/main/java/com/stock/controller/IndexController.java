package com.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.stock.entity.User;
import com.stock.service.UserService;
/**
 * @Description index的控制类
 * @author 张立增
 * @Date 2019年1月20日 下午5:04:27
 */
@RestController
public class IndexController {

	@Autowired
	UserService userService;
	
	
	@RequestMapping("/index")
	public ModelAndView index() {
		System.out.println("hello world!");
		ModelAndView mv = new ModelAndView("pages/index");
		List<User> userList = userService.findUserList();
		mv.addObject("userList", userList);
		return mv;
	}
	
	
	
	
	
	
	
}
