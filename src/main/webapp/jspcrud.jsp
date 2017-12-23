<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://ua.bazarchikUA" %>
<html>
<head>
    <title>crud servlet example test</title>
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
<section>
    <h1>crud servlet example test</h1>
    <h3><a href="/">back?</a></h3>
    <hr>
    <hr>
    <hr>
    <hr>
    <hr>
    <h3><a href="crud?action=create">Add Post</a></h3>
    <table border="1" cellpadding="8" cellspacing="0">
        <tbody>
        <c:forEach items="${posts}" var="post">
            <tr class="${post.id%2 == 0 ? 'normal' : 'exceeded'}">
                <td>${post.id}</td>
                <td>${post.description}</td>
                <td>${post.title} </td>
                <td>${fn:formatDateTime(post.registeredTime)}</td>
                <td><a href="crud?action=update&id=${post.id}">Update</a></td>
                <td><a href="crud?action=delete&id=${post.id}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</section>
</body>
</html>
