<%-- 
    Document   : listEvents
    Created on : Apr 2, 2015, 4:08:53 AM
    Author     : Yeah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!!!!!!!!!</h1>
       
          <c:forEach items="${list}" var="review">
                <div><strong>${review.getTitle()}</strong> <span>${review.getDescription()}</span></div>hello<br /><br />
                
            </c:forEach>
        
        
        
    </body>
</html>
