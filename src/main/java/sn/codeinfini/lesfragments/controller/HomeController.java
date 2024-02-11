package sn.codeinfini.lesfragments.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @author Bara WADE
 *
 */

@Controller
public class HomeController
{
	@GetMapping("/")
	public String index()
	{
		return"index";
	}
	
	@GetMapping("/contact")
	public String contact()
	{
		return"contact";
	}
	
	@GetMapping("/galerie")
	public String galerie()
	{
		return"galerie";
	}
	
	@GetMapping("/service")
	public String service()
	{
		return"service";
	}
	
	@GetMapping("/apropos")
	public String apropos()
	{
		return"apropos";
	}
}
