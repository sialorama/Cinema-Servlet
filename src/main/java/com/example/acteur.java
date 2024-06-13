package com.example;

import com.example.model.ActeurDAO;
import com.example.model.entity.Acteur;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "acteur", value = "/acteur")
public class acteur extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException {

        ActeurDAO ac = new ActeurDAO();
        int id = Integer.parseInt(request.getParameter("id"));
        Acteur acteur = ac.getActeur(id);
        request.setAttribute("acteur",acteur);
                try {
                    RequestDispatcher dispatch = request.getRequestDispatcher("/detailacteur.jsp");

                    dispatch.forward(request, response);
                } catch (IOException ioe) {
                    System.out.println(ioe.getMessage());

                } catch (ServletException e) {
                    throw new RuntimeException(e);
                }
            }
        }



