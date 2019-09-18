import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Caculator_servlet", urlPatterns = "/caculate")
public class Caculator_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product_Description = request.getParameter("pd");
        double list_Price = Double.parseDouble(request.getParameter("lp"));
        double discount_Percent = Integer.parseInt(request.getParameter("dp"));
        double x = (list_Price /100)*(100- discount_Percent);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Product_Description : " + product_Description+ "<br>");
        writer.println(" List Price is: "+list_Price + "<br>");
        writer.println(" Discount Percent is: "+ discount_Percent + "% <br>");
        writer.println(" Discount Amount is: "+ x );
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
