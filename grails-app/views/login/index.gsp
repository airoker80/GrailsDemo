<%--
  Created by IntelliJ IDEA.
  User: Sameer
  Date: 4/5/2017
  Time: 12:50 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>sdtged</title>
</head>

<body>
welcome <br/>
asdas:${flash.message}
<table border="1">
    <thead>
    <th>Name</th>
    <th>Address</th>
    </thead>
    <tbody>
    <g:each in="${userList}" var="ul" status="i">
       <tr>
            <td>${ul.name}</td>
            <td>${ul.address}</td>
        </tr>
    </g:each>

    </tbody>
</table>

</body>
</html>