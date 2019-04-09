package vn.edu.vnuk.cities.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.edu.vnuk.cities.dao.CityDao;
import vn.edu.vnuk.cities.model.City;

@WebServlet("/addCity")
@SuppressWarnings("serial")
public class AddCityServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String city = request.getParameter("city");
		String province = request.getParameter("province");
		String zipCodeInStringFormat = request.getParameter("zip_code");
		
		Long zipcode = Long.parseLong(zipCodeInStringFormat);
		
		City city1 = new City();
		city1.setCity(city);
		city1.setProvince(province);
		city1.setZip_code(zipcode);
		
		CityDao cityDao = new CityDao();
		try {
			cityDao.create(city1);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		out.println("<html>");
		out.println("<body>");
		out.println("city " + city1.getCity() + " successfully added!");
		out.println("</body>");
		out.println("</html>");
	}
}
