package com.hzjc.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
//�Լ��Ŀ�������ʵ����Controller�ӿ�
public class HelloWordController implements Controller {
	//��д�˽ӿڵķ�����handleRequest���÷���������������߼�
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		System.out.println("hello world in Controller");
		//ModelAndView������������ͼ��Ϣ����Spring MVCͨ���ö����װ����Ϣȥ��ת����Ӧ��View
		return new ModelAndView("/index");//�����������ļ������á���ʾ��ת����·���µ�index.jspҳ��
	}
}
