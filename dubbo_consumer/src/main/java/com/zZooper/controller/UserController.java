package com.zZooper.controller;

import com.zZooper.model.DubboCunsumer;
import com.zZooper.model.User;
import com.zZooper.service.DubboProviderService;
import com.zZooper.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhph on 2017/8/17.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/loginCheck")
    public String loginCheck(HttpServletRequest request, Model model){
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");

        DubboProviderService demoService = (DubboProviderService) DubboCunsumer.getBean("demoService");
        String respStr = demoService.sayHello(userName + "--" + passWord);

        request.setAttribute("respStr",respStr);
        return "success";
    }
}
