package home;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * Class description
 *
 * @author lobseer on 27.01.2017.
 */

public class MyServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("" +
                "<html> " +
                "<head>" +
                "</head>" +
                "<body>" +
                "<h1>My servlet result!</h1>" +
                "</body>" +
                "</html>");

        resp.sendRedirect("index.jsp");

    }
}
