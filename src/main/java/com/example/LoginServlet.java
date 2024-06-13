package com.example;

import com.example.model.Password;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet(name = "loginServlet", value = "/loginServlet")
    public class LoginServlet extends HttpServlet {
        private Password admin;

        public void init() {
             admin = new Password("admin@gmail.com", "admin");
        }

        public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

                String login = request.getParameter("email");
                String pass = request.getParameter("userpass");

                if (login.equals(admin.getEmail()) && pass.equals(admin.getPasswd())  ) {

                    HttpSession session = request.getSession();
                    String codesession = session.getId();
                    session.setAttribute("user", "joni");
                    try {
                        RequestDispatcher dispatch = request.getRequestDispatcher("/hello-servlet2");

                        dispatch.forward(request, response);
                    } catch (IOException ioe) {
                        System.out.println(ioe.getMessage());

                    } catch (ServletException e) {
                        throw new RuntimeException(e);
                    }
                }
            }


            public void destroy () {
            }
        }

