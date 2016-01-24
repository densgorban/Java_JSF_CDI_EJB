package servlets;

import services.SomeService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author dens on 18.01.16.
 */
@WebServlet("/simple")
public class SimpleServlet extends HttpServlet {

    @Inject
    SomeService someService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("do get aaoooiii");
        resp.getWriter().println(someService.doSmth());
    }
}
