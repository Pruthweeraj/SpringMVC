package controllers;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import beans.Student;

import businessLogic.StudentNameEditor;

@Controller
public class RegistrationController {

	@ModelAttribute
	public void addCommonObject(Model model) {
		model.addAttribute("headMessage", "PR COLLEGE OF ENGINEERING,ODISHA");

	}

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {

		webDataBinder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());

	}

	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public ModelAndView register() {

		ModelAndView modelAndView = new ModelAndView("Registration");
		return modelAndView;
	}

	// using @ModelAttribute
	@RequestMapping(value = "/submitRegistationForm", method = RequestMethod.POST)
	public ModelAndView submit(@Valid @ModelAttribute("student1") Student student, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			ModelAndView modelAndView = new ModelAndView("Registration");
			return modelAndView;
		}

		ModelAndView modelAndView = new ModelAndView("success");

		return modelAndView;

	}

	@RequestMapping(value = "/ioexc", method = RequestMethod.GET)
	public ModelAndView IoException() throws Exception {

		String exceptionString = "IOException";
		if (exceptionString.equalsIgnoreCase("IOException")) {
			throw new IOException();
		}
		ModelAndView modelAndView = new ModelAndView("Registration");
		return modelAndView;
	}

	@RequestMapping(value = "/ariexc", method = RequestMethod.GET)
	public ModelAndView ArithmeticException() throws Exception {

		String exceptionString = "ArithmeticException";
		if (exceptionString.equalsIgnoreCase("ArithmeticException")) {
			throw new ArithmeticException();
		}
		ModelAndView modelAndView = new ModelAndView("Registration");
		return modelAndView;
	}
	
	
	

	@RequestMapping(value = "/nullexc", method = RequestMethod.GET)
	public ModelAndView NullPointerException() throws Exception {

		String exceptionString = "NullPointerException";
		if (exceptionString.equalsIgnoreCase("NullPointerException")) {
			throw new java.lang.NullPointerException();
		}
		ModelAndView modelAndView = new ModelAndView("Registration");
		return modelAndView;
	}

	// This ExceptionHandler only work locally for this controller class only
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public ModelAndView handleNullPointerException(Exception e) {
		System.out.println("Handle from locally");
		//logging NullPointer exception
		System.out.println("NullPointerException occured :"+e);
		ModelAndView modelAndView = new ModelAndView("NullPointerException");
		return modelAndView;
	}

}