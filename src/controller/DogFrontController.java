package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import vo.ActionForward;
import action.Action;
import action.DogListAction;








// 모든 클라이언트의 요청을 받아서 제어하는 컨트롤러 클래스
@WebServlet("*.dog")
public class DogFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	
	//1. 요청 파악
	String requestURI = request.getRequestURI();
	// 요청 URL >> http://localhost:9000/JSPExam/board/*.do
	
	String contextPath = request.getContextPath();
	
	String command = requestURI.substring(contextPath.length());
	Action action = null;
	ActionForward forward = null;
	
	// 2. 각 요청별로 비즈니스 로직 호출
	
	if(command.equals("/dogList.dog")) {
		
		action = new DogListAction();
		//프로젝트명 + 기능 + 형태
		try {
			forward = action.execute(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
		
		
		
		
		
		
		
		
		
	}


}