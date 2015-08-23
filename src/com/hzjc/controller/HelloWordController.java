package com.hzjc.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
//自己的控制器类实现了Controller接口
public class HelloWordController implements Controller {
	//重写了接口的方法：handleRequest，该方法用来处理请的逻辑
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		System.out.println("hello world in Controller");
		//ModelAndView对象代表的是视图信息对象，Spring MVC通过该对象封装的信息去跳转到相应的View
		return new ModelAndView("/index");//这里结合配置文件的配置。表示跳转到根路径下的index.jsp页面
	}
}
