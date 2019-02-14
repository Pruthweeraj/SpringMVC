package businessLogic;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeakBaseAccessInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		// If this method returns "true" -- then the application will further handle the
		// request
		// If this method returns "false" -- then the application will NOT further
		// handle the request

		Calendar calendar = Calendar.getInstance();
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		if (dayOfWeek == 1) {

			response.getWriter().write("This Website is clased on sunday...Please Try in other Day...!!!");
			System.out.println("executed Interceptor and Todaay is  sunday");
			return false;
		}

		System.out.println("executed Interceptor and Todaay is not sunday");

		return true;

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		// this method would be called after SpringMVC executes the requestHandler Method
		System.out.println("HandlerInterceptorAdaptor:  Spring called postHandler Method for  "
				+ request.getRequestURI().toString());

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//Thread.sleep(10000);
		// this method would be called after the response object is prepared by the view for the request 
		// But before sending the view to the browser
		System.out.println("HandlerInterceptorAdptor:  Spring MVC called afterCompletion method for  "
				+ request.getRequestURI().toString());

	}

}
