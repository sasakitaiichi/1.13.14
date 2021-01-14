import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;
import java.io.IOException;


public class ServletFirst extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Init method is called...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("Service method is called");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Destroy method is called");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws SecurityException, IOException {


        response.setContentType("text/html");
        java.io.PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet<title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<Hello,Java Servlet>");
        out.println("</body>");
        out.println("</html>");
        out.close();

    }
}
