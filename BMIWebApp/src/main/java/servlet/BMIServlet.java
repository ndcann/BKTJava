package servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class BMIServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            double height = Double.parseDouble(request.getParameter("height"));
            double weight = Double.parseDouble(request.getParameter("weight"));
            double bmi = weight / (height * height);
            request.setAttribute("bmi", bmi);
            request.getRequestDispatcher("bmi.jsp").forward(request, response);
        } catch (Exception e) {
            response.sendRedirect("bmi.jsp");
        }
    }
}
