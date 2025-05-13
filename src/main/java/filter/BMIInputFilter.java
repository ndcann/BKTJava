package filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class BMIInputFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        try {
            double height = Double.parseDouble(request.getParameter("height"));
            double weight = Double.parseDouble(request.getParameter("weight"));
            if (height > 0 && weight > 0) {
                chain.doFilter(request, response);
            } else {
                ((HttpServletResponse) response).sendRedirect("bmi.jsp");
            }
        } catch (NumberFormatException e) {
            ((HttpServletResponse) response).sendRedirect("bmi.jsp");
        }
    }

    public void init(FilterConfig config) throws ServletException {}
    public void destroy() {}
}
