package bacit.web.bacit_web;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "stopCharger", urlPatterns = "/stopCharger")
public class HelloServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse resp) {
        try {
            resp.getWriter().write("Hello!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}