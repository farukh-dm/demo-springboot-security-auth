package demo.springboot.security.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class HomeController {
	
	@RequestMapping(value = "")
	public String home() {
	
		return "You are Home!";
	
	}
	
	@RequestMapping(value = "/user")
	public String user() {
	
		return "You are in User's Home!";
	
	}
	
	@RequestMapping(value = "/admin")
	public String admin() {
	
		return "You are in Admin's Home!";
	
	}

}
