package com.kyung.servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex03")
public class Ex03Controller extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/html");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		// 이름과 생년월일을 전달받고
		// 이름과 나이를 정리한 html을 작성한다
		
		
		// url 뒤에 파라미터 추가 : ?name=이름&birthday=20040512
		// 원래는 링크로 파라미터 전달함
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday"); // 20040512
		

		
		String yearString = birthday.substring(0,4);
		int year = Integer.parseInt(yearString);
		
		int age = 2024 - year + 1;
		
		
//		out.println("<html><head><title>이름, 나이</title></head><body>");
//		out.println("<h2> 이름 : " + name + "</h2>");
//		out.println("<h2> 나이 : " + age + "</h2>");
//		out.println("</body></html>");
		
		// 이름, 나이
		// response에 데이터만 담아서 보내야 하는 경우
		// 데이터를 표현하는 규격을 톨해 문자열을 담음
		// 주로 사용되는 건 json
		// {"name" : "김인규", "age" : 31}
		out.println("{\"name\":\""+ name + "\", \"age\":" + age + "}");
		
	};
}


//jsonview 크롬웹스토어로 설치하면 json을 에쁘게 보여줌