<%--
  Created by IntelliJ IDEA.
  User: Sameer
  Date: 4/11/2017
  Time: 4:21 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Demo grails</title>
</head>

<body>
<form action= ${createLink(uri: '/j_spring_security_check')} method='POST' id='loginForm' class='cssform' autocomplete='off'>
    <p>
        <label for='username'><g:message code="springSecurity.login.username.label"/>:</label>
        <input type='text' class='text_' name='j_username' id='username'/>
    </p>

    <p>
        <label for='password'><g:message code="springSecurity.login.password.label"/>:</label>
        <input type='password' class='text_' name='j_password' id='password'/>
    </p>

    <p>
        <input type='submit' id="submit" value='${message(code: "springSecurity.login.button")}'/>
    </p>
</form>
</body>
</html>