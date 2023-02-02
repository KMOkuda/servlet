package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contact;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("got.");

		request.setCharacterEncoding("UTF-8");

		String name = "名前";
		String furigana = "フリガナ";
		String tel = "4444444";
		String mail = "kk@gmail.com";
		String comment = "aaaa";

		Contact contact = new Contact(name, furigana, tel, mail, comment);

		request.setAttribute("contact", contact);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/contactResult.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("posted.");

		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("username");
		String furigana = request.getParameter("userfurigana");
		String tel = request.getParameter("usertel");
		String mail = request.getParameter("usermail");
		String comment = request.getParameter("usercomment");

		Contact contact = new Contact(name, furigana, tel, mail, comment);

		request.setAttribute("contact", contact);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/contactResult.jsp");
		dispatcher.forward(request, response);
	}

}
