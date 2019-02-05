package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public ModelAndView register() {

		ModelAndView modelAndView = new ModelAndView("Registration");

		return modelAndView;
	}

	@RequestMapping(value="/submitRegistationForm" , method=RequestMethod.POST)
	//public ModelAndView submit(@RequestParam(value="studentName" ,defaultValue="BCCST-student" )String studentName, @RequestParam String studentRollNumber) {
	public ModelAndView submit(@RequestParam Map<String, String> requestParam) {
		
		String studentName = requestParam.getOrDefault("studentName", "BCCST-student");
		System.out.println(requestParam.getOrDefault("studentName", "BCCST-student"));
		String studentRollNumber = requestParam.get("studentRollNumber");
		
		ModelAndView modelAndView = new ModelAndView("success");
		modelAndView.addObject("studentRollNumber", studentRollNumber);
		modelAndView.addObject("studentName", studentName);

		return modelAndView;
	}

}
