<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nodirbek
  Date: 05/08/2022
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="../adfragment/head.jsp"/>
</head>
<body class="bg-success p-2 text-dark bg-opacity-50">
<jsp:include page="../adfragment/admin-nav.jsp"/>
<br><br><br><br>
<h1>ADD Product</h1>
<div class="row">
    <div class="col-6 offset-3">
        <form method="post">
            <%--@declare id="exampleinputemail1"--%>
            <div class="form-group">
                <label for="name">Product Name</label>
                <input type="text" name="name" class="form-control" id="name"/>
            </div>
            <br>
            <div class="form-group">
                <label for="price">Product price</label>
                <input type="number" name="price" class="form-control" id="price"/>
            </div>
            </br>
            <%--            <br><br>--%>
            <%--            <label for="exampleInputEmail1" class="form-label">From ... airport</label>--%>
            <%--            <select class="form-select" name="from" aria-label="Default select example">--%>
            <%--                <c:forEach items="${airs}" var="air">--%>
            <%--                    <option value="${air.id}">${air.name}</option>--%>
            <%--                </c:forEach>--%>
            <%--            </select>--%>
            <%--            <br><br>--%>

            <div class="form-group">
                <label for="genre">Category</label>
                <select class="form-control" id="genre">
            <c:forEach items="${categories}" var="category">--%>
                <option value="${category.name}">${category.name}</option>
            </c:forEach>
                </select>
            </div>
            <div class="form-group">
                <label for="pageCount">Title</label>
                <input type="text" name="pageCount" class="form-control" id="pageCount"/>
            </div>
            <div class="form-group">
                <label for="file">Enter product picture</label>
                <input type="file" name="file" class="form-control" id="file"/>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</div>


</body>
</html>
