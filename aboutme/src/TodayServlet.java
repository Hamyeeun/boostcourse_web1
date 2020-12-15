

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayServlet
 */
@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
//		response.setCharacterEncoding("UTF-8");
		Date now = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy/M/dd hh:mm");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Time</title></head>");
		out.println("<body>");
		out.println("<a href=http://localhost:8080/aboutme/index.html>메인화면</a><br><br><br><br>");
		out.println("<h1 align = \"center\">현재시간 : " + ft.format(now) + "</h1>");
		
		out.println("</body>");
		out.println("</html>");
	}

}
