//package com.s2.travelmgt.controller;
//
//import java.security.Principal;
//import java.util.Base64;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.s2.travelmgt.model.User;
//
//public class LoginController {
//	@RequestMapping("/login")
//	public boolean login(@RequestBody User user) {
//	    return
//	      user.getMobile().equals("7292887838") && user.getPassword().equals("password");
//	}
//	 
//	@RequestMapping("/user")
//	public Principal user(HttpServletRequest request) {
//	    String authToken = request.getHeader("Authorization")
//	      .substring("Basic".length()).trim();
//	    return () ->  new String(Base64.getDecoder()
//	      .decode(authToken)).split(":")[0];
//	}
//}
