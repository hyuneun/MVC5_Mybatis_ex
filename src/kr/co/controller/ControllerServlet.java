package kr.co.controller;

import java.io.IOException;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���1 : parameter�� Ŭ���̾�Ʈ ��û ����
		String command = request.getParameter("command");
		
		CommandInter inter = null;
		
		String prefix = "/view/";	//���ξ�
		String surfix = ".jsp";	//���̾�
		String viewName = "";
		
		try {
			if(command.equals("gogek")){
				
				inter = GogekImpl.instance();
				viewName = prefix + inter.showData(request, response,"up") + surfix;
				request.getRequestDispatcher(viewName).forward(request, response);
				
			}else if(command.equals("gogekd")){
				
				inter = GogekImpl.instance();
				viewName = prefix + inter.showData(request, response,"down") + surfix;
				request.getRequestDispatcher(viewName).forward(request, response);
				
			}
			else if(command.equals("sawon")){
				inter = SawonImpl.instance();
				viewName = prefix + inter.showData(request, response,"up") + surfix;
				request.getRequestDispatcher(viewName).forward(request, response);
			
			}else if(command.equals("sawond")){
				inter = SawonImpl.instance();
				viewName = prefix + inter.showData(request, response,"down") + surfix;
				request.getRequestDispatcher(viewName).forward(request, response);
			
			}else{
				viewName = "error.html";
				response.sendRedirect(viewName);
			}
		} catch (Exception e) {
			System.out.println("service err : " + e);
		}
	}

}
