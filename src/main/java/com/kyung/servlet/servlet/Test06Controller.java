package com.kyung.servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test06")
public class Test06Controller extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
//		String num1 = request.getParameter("number1");
//		String num2 = request.getParameter("number2");
//		
//		int number1 = Integer.parseInt(num1);
//		int number2 = Integer.parseInt(num2);
		
		int number1 = Integer.parseInt(request.getParameter("number1"));
		int number2 = Integer.parseInt(request.getParameter("number2"));
		
		int addition = number1 + number2;
		int substraction = number1 - number2;
		int multiplication = number1 * number2;
		int division = number1 / number2;
		
		//out.println("{addition : " + addition + ", substraction : " + substraction + ", multiplication : " + multiplication + ", division : " + division + "}");
		
		//{"addition" : 100, "substraction" : 20, "multiplication" : 102, "division' : 10} 이런 식으로 만들어두고 그대로 붙여넣기 하면 이클립스에서 알아서 json 형태로 만들어줌
		out.println("{\"addition\" :" + addition + ", \"substraction\" : " +  substraction + ", \"multiplication\" : " + multiplication + ", \"division' : " +division + "}");

		
	}

}
