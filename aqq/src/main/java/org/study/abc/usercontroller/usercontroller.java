package org.study.abc.usercontroller;

import org.study.abc.user.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/users")
public class usercontroller {
 
 
   
    @RequestMapping(value="/signUp", method=RequestMethod.GET)
    public String signUp() {
        return "users/signUp";
    }
   
    @RequestMapping(value="/signUp", method=RequestMethod.POST)
    public String signUp(user user) throws Exception {
 
        return "users/welcome";
    }
}
