<% Acteur acteur; %>
<%@ page import="com.example.model.entity.Acteur" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.model.ActeurDAO" %><%--
  Created by IntelliJ IDEA.
  User: 29010-55-02
  Date: 13/06/2024
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CRUD ACTEUR</title>
</head>
<body>
<h1>CRUD Acteurs</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Nom</th>
        <th>Prénom</th>
        <th>Date de naissance</th>
        <th>Actions</th>
    </tr>

    <tr>
        <td><%= acteur.getId() %></td>
        <td><%= acteur.getNom() %></td>
        <td><%= acteur.getPrenom() %></td>

        <td>
            <a href="editActeur.jsp?id=<%= acteur.getId() %>">Edit</a>
            <a href="deleteActeur.jsp?id=<%= acteur.getId() %>">Delete</a>
        </td>
    </tr>
    <%
        }
    %>
</table>
<a href="addActeur.jsp">Add new actor</a>

</body>
</html>
