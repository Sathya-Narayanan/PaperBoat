package com.paperboat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	public HomeController() {
		//super();
		// TODO Auto-generated constructor stub
		System.out.println("inside controller");
	}
@RequestMapping("/")
	public String gotoHome()
	{
		return "Index";
	}

@RequestMapping("/Index")
public String gotoHome1()
{
	return "Index";
}

@RequestMapping("/Login")
public String gotoHome2()
{
	return "Login";
}

@RequestMapping("/Register")
public String gotoHome3()
{
	return "Register";
}

@RequestMapping("/Aboutus")
public String gotoHome4()
{
	return "Aboutus";
}

}
