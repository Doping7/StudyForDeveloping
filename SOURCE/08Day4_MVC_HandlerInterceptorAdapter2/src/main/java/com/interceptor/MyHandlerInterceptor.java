package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.controller.TestController;

public class MyHandlerInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle======"+handler);
		HttpSession session = request.getSession();
		if (session.getAttribute("login")==null) {
			//response.sendRedirect("loginForm");
			//주의! 모든 주소에 대한 처리가 이루어저 최초로 loginForm 호출시에도 세션을 검사하게된다.
			//그러면 무한반복임. 해당하는 주소에 대한 처리를 해줘야함. 앞으로 할예정
		}
		return true;
		//return false;// false로 두면 인터셉터가 실행되고 더 진행이 멈춤
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle====="+handler);
		HandlerMethod method = (HandlerMethod)handler;
		if (method.getBean() instanceof TestController) {
			modelAndView.setViewName("login");
			modelAndView.addObject("data","홍길동");
		}
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterConcurrentHandlingStarted(request, response, handler);
	}

	
}
