package controllers;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandlerMethods {

	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = IOException.class)
	public ModelAndView handleIOException(Exception e) {
		System.out.println("Handle from globally");
		//logging IO exception
		System.out.println("IOException occured :"+e);
		ModelAndView modelAndView = new ModelAndView("IOException");
		return modelAndView;
	}

	
	//Generic ExceptionHandler Method
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public ModelAndView HandleException(Exception e) {
		System.out.println("Handle from globally");
		//logging unknown exception
		System.out.println("Unknown Exception  occured :"+e);
		ModelAndView modelAndView = new ModelAndView("Exception");
		return modelAndView;
	}

	/*@ExceptionHandler(value = NullPointerException.class)
	public ModelAndView handleNullPointerException(Exception e) {

		
		//logging NullPointer exception
		System.out.println("NullPointerException occured :"+e);
		ModelAndView modelAndView = new ModelAndView("NullPointerException");
		return modelAndView;
	}*/
}
