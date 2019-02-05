package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pr")
public class HelloController  {

	@RequestMapping("/hello/{name}/{country}")
	public ModelAndView helloPr(@PathVariable String country , @PathVariable String name){
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMsg", "Hello "+name+" , You are from  "+country);

		return modelAndView;
	}
	
	@RequestMapping("/hi/{name}/{country}")
	public ModelAndView hiPr( @PathVariable Map<String, String> pathVariable ){
		String name = pathVariable.get("name");
		String country = pathVariable.get("country");
		
		
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMsg","Hi "+name+" , You are from  "+country);
		
		return modelAndView;
	}
	

}
