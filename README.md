# Cinema-Servlet

Les Servlets
Une servlet est un composant Web de Java EE. Elle permet de traiter une requête entrante sur un serveur et de générer une réponse dynamique. La plupart du temps, les servlets sont utilisées pour traiter des requêtes HTTP et générer dynamiquement une réponse.

L’API servlet est définie par la spécification [JSR-000369] (https://jcp.org/aboutJava/communityprocess/final/jsr369/index.html) et la version actuelle est la 4.0.

Structure d’une servlet HTTP
Une servlet HTTP est une classe Java qui hérite de la classe javax.servlet.http.HttpServlet :
```java
package fr.epsi.b3;

import javax.servlet.http.HttpServlet;

public class MyServlet extends HttpServlet {

}
```
Par défaut, la classe javax.servlet.http.HttpServlet fournit des méthodes doXXX (XXX représentant une méthode HTTP) qui seront appelées lorsque la servlet devra traiter une requête HTTP de la méthode correspondante.

HttpServlet dispose donc des méthodes doGet, doPost, doPut… L’implémentation par défaut de ces méthodes consiste à retourner un message d’erreur HTTP. Chaque servlet doit donc redéfinir les méthodes qui la concernent.
```java
package fr.epsi.b3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Exemple d'une servlet acceptant les requêtes HTTP GET
 */
public class MyServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                 throws ServletException, IOException {
    // traitement de la requête et génération du résultat à retourner au client
  }

}
```
Les méthodes doXXX ont toutes deux paramètres : javax.servlet.http.HttpServletRequest et javax.servlet.http.HttpServletResponse qui représentent respectivement la requête HTTP entrante et la réponse renvoyée par le serveur.
