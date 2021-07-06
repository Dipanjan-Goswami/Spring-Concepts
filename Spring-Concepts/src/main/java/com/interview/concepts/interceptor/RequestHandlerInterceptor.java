package com.interview.concepts.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.interview.concepts.exception.InvalidHeaderException;

@Component
@SuppressWarnings("deprecation")
public class RequestHandlerInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception{
			if(StringUtils.isBlank(request.getHeader("student-auth-key"))) {
				throw new InvalidHeaderException("Invalid Header");
			}
			return super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
		super.afterConcurrentHandlingStarted(request, response, handler);
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object handler,
			Exception ex) throws Exception {
		super.afterCompletion(request, response, handler, ex);
	}
	
	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request,HttpServletResponse response,
			Object handler) throws Exception {
		super.afterConcurrentHandlingStarted(request, response, handler);
	}
	
}
