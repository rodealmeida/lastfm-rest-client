package au.com.redballoon.error;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by rodealmeida on 11/04/2017.
 */
@WebServlet("/error-handler")
public class ErrorServlet extends HttpServlet
{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        Exception exception = (Exception) req.getAttribute("javax.servlet.error.exception");
        Integer statusCode = (Integer) req.getAttribute("javax.servlet.error.status_code");

        resp.setContentType("application/json; charset=utf-8");
        resp.setStatus(statusCode);

        PrintWriter out = resp.getWriter();
        out.write("{");
        out.write("\"status\":" + statusCode);
        out.write(",\"message\":\"" + exception.getMessage() + "\"");
        out.write("}");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        doGet(req, resp);
    }

}
