

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test2 extends HttpServlet {

  protected void doGet(
      HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException {

    PrintWriter out = response.getWriter();  
    out.println(new Util2().sayHello());

  }

}
