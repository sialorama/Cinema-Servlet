package com.example;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet2", value = "/hello-servlet2")
public class HelloServlet2 extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        HttpSession session = request.getSession();
        String codesession = session.getId();
//        String personne = session.getId();
        String personne = (String) session.getAttribute("user");
        out.println("<h2>"+ personne+"</h2>");
        out.println("</body></html>");
//        session.setAttribute("user", "joni");


        out.println("<h2>" + codesession + "</h2>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request,response);
    }
}