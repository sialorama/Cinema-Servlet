# Cinema-Servlet

Les Servlets
Une servlet est un composant Web de Java EE. Elle permet de traiter une requête entrante sur un serveur et de générer une réponse dynamique. La plupart du temps, les servlets sont utilisées pour traiter des requêtes HTTP et générer dynamiquement une réponse.

L’API servlet est définie par la spécification JSR-000369 et la version actuelle est la 4.0.

Structure d’une servlet HTTP
Une servlet HTTP est une classe Java qui hérite de la classe javax.servlet.http.HttpServlet :
```java
package fr.epsi.b3;

import javax.servlet.http.HttpServlet;

public class MyServlet extends HttpServlet {

}
```
Par défaut, la classe javax.servlet.http.HttpServlet fournit des méthodes doXXX (XXX représentant une méthode HTTP) qui seront appelées lorsque la servlet devra traiter une requête HTTP de la méthode correspondante.
