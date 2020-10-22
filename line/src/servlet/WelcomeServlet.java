package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Logic;
import model.NamePrice;
import model.SortLogic;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/form.jsp");
		dispatcher.forward(request, response);

	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String nameA = request.getParameter("nameA");
		double priceA = Double.parseDouble(request.getParameter("priceA"));
		String nameB = request.getParameter("nameB");
		double priceB = Double.parseDouble(request.getParameter("priceB"));
		String nameC = request.getParameter("nameC");
		double priceC = Double.parseDouble(request.getParameter("priceC"));
		String nameD = request.getParameter("nameD");
		double priceD = Double.parseDouble(request.getParameter("priceD"));
		String nameE = request.getParameter("nameE");
		double priceE = Double.parseDouble(request.getParameter("priceE"));


		double quantity = Double.parseDouble(request.getParameter("quantity"));
		request.setAttribute("quantity",quantity);





		NamePrice a = new NamePrice(nameA,priceA);
		NamePrice b = new NamePrice(nameB,priceB);
		NamePrice c = new NamePrice(nameC,priceC);
		NamePrice d = new NamePrice(nameD,priceD);
		NamePrice e = new NamePrice(nameE,priceE);

		List<NamePrice> namePriceList = new ArrayList<>();

		namePriceList.add(a);
		namePriceList.add(b);
		namePriceList.add(c);
		namePriceList.add(d);
		namePriceList.add(e);

		Logic bo = new Logic();

		List<NamePrice> namePriceList2 = bo.execute(namePriceList,quantity);

		SortLogic  sort = new SortLogic();
		List<NamePrice> namePriceList3 = sort.execute(namePriceList2);

		request.setAttribute("namePriceList", namePriceList);
		request.setAttribute("namePriceList2", namePriceList2);
		request.setAttribute("namePriceList3", namePriceList3);
		System.out.println(namePriceList3);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
		dispatcher.forward(request, response);

	}

}
