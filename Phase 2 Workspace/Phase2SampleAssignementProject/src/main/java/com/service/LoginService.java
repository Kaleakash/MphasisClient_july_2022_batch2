package com.service;

import com.bean.Login;

public class LoginService {

	public String checkLoginDails(Login ll) {
		if(ll.getEmail().equals("admin@gmail.com") && ll.getPassword().equals("123")) {
			return "success";
		}else {
			return "falure";
		}
	}
}
