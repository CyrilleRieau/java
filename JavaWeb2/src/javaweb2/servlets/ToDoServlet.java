package javaweb2.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ToDoServlet
 */
@WebServlet("/ToDoServlet")
public class ToDoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private List<String> liste = new ArrayList<>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ToDoServlet() {
        super();
        // TODO Auto-generated constructor stub
        liste.add("ga");
        liste.add("zo");
        liste.add("bu");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("variable", "bloup");
		request.setAttribute("items", liste);
		request.getRequestDispatcher("/todo.jsp").forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("suppr") !=null) {
			String toDel = request.getParameter("suppr");
			liste.remove(Integer.parseInt(toDel));
			
		} else {
		liste.add((String)request.getParameter("nouveau"));
		}
		doGet(request, response);
	}

}
