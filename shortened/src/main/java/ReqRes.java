

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ReqRes")
public class ReqRes extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static URL url = new URL();
	private static login login = new login() ;
    public ReqRes() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
	
	String userName = request.getParameter("UserName given by USER");
	String passwordString = request.getParameter("Password given by USER");
	if ("URL given from USER".equals(url.getOrigiString()) ) {
	     url.setShortenedCounter(1);	
	     }
	
	if (userName.equals(null) && passwordString.equals(null)) {
		url.setOrigiString(request.getParameter("URL given from USER") );
		url.setShortString("virtualidentity.shortened") ;
		response.sendRedirect("URL given from USER");
	}
	
	if (userName.equals(login.getUserName()) && passwordString.equals(login.getPassword())) {
		url.setOrigiString(request.getParameter("URL given from USER") );
		url.setShortString("virtualidentity.shortened"+login.getUserName()) ;
		login.setUserUrl(url);
		response.sendRedirect("URL given from USER");
		}
	if (userName.equals(login.getUserName()) && passwordString.equals(login.getPassword())) {
		System.out.println(url.getShortenedCounter());
		System.out.println(url.getVisits());
		}

	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
