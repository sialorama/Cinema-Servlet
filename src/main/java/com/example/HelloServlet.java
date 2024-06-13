package com.example;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        HttpSession session = request.getSession();
            String codesession = session.getId();
            session.setAttribute("user","joni");
            try {
                RequestDispatcher dispatch = request.getRequestDispatcher("/HelloServlet2");

                dispatch.forward (request, response);
            }catch(IOException ioe) {
                System.out.println(ioe.getMessage());

            } catch (ServletException e) {
                throw new RuntimeException(e);
            }

    }


    public void destroy() {
    }
}