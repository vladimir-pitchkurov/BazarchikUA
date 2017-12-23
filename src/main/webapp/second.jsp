<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://ua.bazarchikUA" %>

<html>
<head>
    <title>second</title>
    <style>
        .normal {
            color: green;
        }

        .exceeded {
            color: red;
        }
    </style>
</head>
<body>
<h1>it is second page refresh</h1>
<h2>User test</h2>

<h3>${user}</h3>
<h2>${posts}</h2>
<table border="1" cellpadding="8" cellspacing="0">
    <tbody>
    <c:forEach items="${posts}" var="post">
        <tr class="${post.id%2 == 0 ? 'normal' : 'exceeded'}">
            <td>${post.id}</td>
            <td>${post.title} </td>
            <td>${fn:formatDateTime(post.registeredTime)}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<table border="1" cellpadding="8" cellspacing="0">
    <tbody>
    <c:forEach items="${post11}" var="post1">
        <tr class="${post1.id%2 == 0 ? 'normal' : 'exceeded'}">
            <td>${post1.id}</td>
            <td>${post1.title} </td>
            <td>${fn:formatDateTime(post1.registeredTime)}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>
