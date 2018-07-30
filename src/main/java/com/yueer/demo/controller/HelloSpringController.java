package com.yueer.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yueer.demo.service.SmUserService;
 

@Controller
public class HelloSpringController {
    String message = "Welcome to Spring MVC!";
 
    @RequestMapping("/hello")
    public ModelAndView showMessage(@RequestParam(value="name", required = false, defaultValue = "Spring") String name) {
        ModelAndView mv = new ModelAndView("hellospring");//指定视图
        //向视图中添加所要展示或使用的内容，将在页面中使用
        mv.addObject("message", message);
        mv.addObject("name", name);
        return mv;
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody  
    public String ajaxDatas(@RequestParam(value="username", required=true) String username, @RequestParam(value="password", required=true) String password) {
    	return new SmUserService().login(username, password) ? "success" : "fail";
//    	return "success";
    }
}