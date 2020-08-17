package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import vo.ActionForward;
import svc.DogCartAddService;
import vo.Dog;

public class DogCartAddAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		DogCartAddService dogCartAddService = new DogCartAddService();
		int id =Integer.parseInt(request.getParameter("id"));
		Dog cartDog = dogCartAddService.getCartDog(id);
		dogCartAddService.addCart(request, cartDog);
		ActionForward forward = new ActionForward("dogCartList.dog", true);
		
		return forward;
	}

}
