<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <form action = "AttributeServlet" method = "get">


            Name: <input type = "text" name = "name" /> <br/>
            Value: <input type = "text" name = "value" /> <br/>

            Scope: 
            <select name="scope" multiple="false" size="3">
                <option value="application">application</option>
                <option value="session">session</option>
                <option value="request">request</option>
            </select> <br/>
            Action : <input type = "radio" name = "action" value = "add">add</input><br/>
            Action : <input type = "radio" name = "action" value = "replace">replace</input><br/>
            Action : <input type = "radio" name = "action" value = "remove">remove</input><br/>

            <input type = "submit" name = "process" value = "Process"/>
            <input type = "reset" name = "clear" value = "Clear"/>
        </form>
    </body>
</html>

