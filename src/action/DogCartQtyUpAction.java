package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import svc.DogCartQtyUpService;

public class DogCartQtyUpAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String kind = request.getParameter("kind");
		DogCartQtyUpService dogCartQtyUpService =
				new DogCartQtyUpService();
		dogCartQtyUpService.upCartQty(kind, request);
		ActionForward forward = new ActionForward("dogCartList.dog", true);
			
		return forward;
	}

}
