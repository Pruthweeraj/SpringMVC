package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class LoveController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
	
	
		String name= request.getParameter("name");
		String loverName = request.getParameter("loverName");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("loveMsg", name+"...LOVES..."+loverName+"<br/>(form SimpleUrlHandlerMapping)");
	
		ModelAndView modelAndView = new ModelAndView("showLove",map);
		return modelAndView;
	}

}
