package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import beans.Student;

@Controller
public class RegistrationController {

	
	@ModelAttribute
	public void addCommonObjects(Model model){
		model.addAttribute("headMessage", "PR COLLEGE OF ENGINEERING....");

	}
	
	
	
	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public ModelAndView register() {

		ModelAndView modelAndView = new ModelAndView("Registration");

		return modelAndView;
	}

	/*@RequestMapping(value="/submitRegistationForm" , method=RequestMethod.POST)
	//public ModelAndView submit(@RequestParam(value="studentName" ,defaultValue="BCCST-student" )String studentName, @RequestParam String studentRollNumber) {
	public ModelAndView submit(@RequestParam Map<String, String> requestParam) {
		
		String studentName = requestParam.getOrDefault("studentName", "BCCST-student");
		System.out.println(requestParam.getOrDefault("studentName", "BCCST-student"));
		String studentRollNumber = requestParam.get("studentRollNumber");
		
		ModelAndView modelAndView = new ModelAndView("success");
		modelAndView.addObject("studentRollNumber", studentRollNumber);
		modelAndView.addObject("studentName", studentName);

		return modelAndView;
	}*/

	
	/*
	@RequestMapping(value="/submitRegistationForm" , method=RequestMethod.POST)
public ModelAndView submit(@RequestParam Map<String, String> requestParam) {
		
		Student student1 = new Student();
		student1.setStudentName(requestParam.get("studentName"));
		student1.setStudentRollNumber(requestParam.get("studentRollNumber"));
		
		System.out.println(student1.getStudentName()+"..."+student1.getStudentRollNumber());
		
		ModelAndView modelAndView = new ModelAndView("success");
		
		modelAndView.addObject("student1", student1);
		modelAndView.addObject("headMessage", "PR COLLEGE OF ENGINEERING....");
		
		return modelAndView;
	}
	
	*/
	
	//using @ModelAttribute  
	@RequestMapping(value="/submitRegistationForm" , method=RequestMethod.POST)
	public ModelAndView submit(@ModelAttribute("student1") Student student) {
			
			
		
		//NO NEED TO create Student object
		//no need to getting the value from RequestParam and setting it to the Student object
		//and no need to put the value to the ModelAndView object
	
			ModelAndView modelAndView = new ModelAndView("success");
			
		
			
			return modelAndView;
		}
	
	
	
	
}
