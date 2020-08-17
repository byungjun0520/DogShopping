package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import vo.ActionForward;
import java.util.ArrayList;
import svc.DogListService;
import vo.ActionForward;
import vo.Dog;

// 새로운 상품 정보를 등록하는 Action 클래스
public class DogListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ArrayList<String> todayImageList = new ArrayList<String>();
		Cookie[] cookieArray = request.getCookies();
		
		if(cookieArray != null) {
			
			for(int i = 0; i<cookieArray.length; i++) {
				if(cookieArray[i].getName().startsWith("today")) {
					todayImageList.add(cookieArray[i].getValue());
				}
			}
		}
		
		DogListService dogListService = new DogListService();
		ArrayList<Dog> dogList = dogListService.getDogList();
		
		request.setAttribute("dogList", dogList);
		request.setAttribute("todayImageList", todayImageList);
		
		ActionForward forward = new ActionForward("dogList.jsp", false);
		
		return forward;
	}

}
