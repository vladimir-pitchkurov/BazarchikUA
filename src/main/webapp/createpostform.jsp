<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://ua.bazarchikUA" %>
<html>
<head>
    <title>${param.action == 'create'? 'Create new post' : 'change post'}</title>
</head>
<body>
<section>
    <h1>${param.action == 'create'? 'Create new post' : 'change post'}</h1>
    <h3><a href="index.html">Home</a></h3>

    <hr>
    <jsp:useBean id="post" type="ua.bazarchik.model.UserPost" scope="request"/>
    <form method="post" action="crud">
        <input type="hidden" name="id" value="${post.id}">
        <dl>
            <dt>title:</dt>
            <dd><input type="text" value="${post.title}" name="title"></dd>
        </dl>
        <dl>
            <dt>Description:</dt>
            <dd><input type="text" value="${post.description}" name="description"></dd>
        </dl>
        <dl>
            <dt>idCategory:</dt>
            <dd><input type="number" value="${post.idCategory}" name="idCategory"></dd>
        </dl>
        <button type="submit">Save</button>
        <button onclick="window.history.back()" type="button">Cancel</button>
    </form>

</section>
</body>
</html>
