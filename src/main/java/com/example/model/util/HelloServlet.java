package com.example.model.util;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");

        resp.setContentType("text/plain");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().write("Hello " + name + "!");
    }
}
