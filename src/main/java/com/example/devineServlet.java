package com.example;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "devineServlet", value = "/devineServlet")
    public class devineServlet extends HttpServlet {

        public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

            response.setContentType("text/html");
            // recupération du parametre
            int i = Integer.valueOf(request.getParameter("guess"));
            // Hello
            PrintWriter out =  response.getWriter();
            out.println("<html><body>");
            out.println("<h1>" + i + "</h1>");
            out.println("</body></html>");
        }

        public void destroy(){

        }
}
