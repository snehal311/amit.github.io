<%-- 
    Document   : student
    Created on : 10 Mar, 2019, 8:31:48 PM
    Author     : DELL
--%>

<%@page import="java.lang.String"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="test.test" %>
        <%
            String name=request.getParameter("n");
            String gender=request.getParameter("c");
            String class1=request.getParameter("q"); 
            String feesmode=request.getParameter("p");
            out.println("Student name:"+name);
            %>
            <br/>
            <%
                out.println("Gender :"+gender);
                %>
                <br/>
                <%
                    out.println("Class :"+class1);
                    %>
                    <br/>
                    <%
                        out.println("Fees mode: "+feesmode);
                        test t=new test();
                        t.addInventory(name,gender,class1,feesmode);
                        
                        %>
                        
    </body>
</html>
