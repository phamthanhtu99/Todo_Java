<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 22/11/2021
  Time: 10:24 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/tablig.jsp"%>
    <html>
    <head>
        <title>Title</title>
        href="node_modules/todomvc-common/base.css"
        <link rel="stylesheet"  href="<c:url value="/template/todomvc-common/base.css/"></c:url> ">
        <link rel="stylesheet" href="<c:url value="/template/todomvc-app-css/index.css"></c:url> ">
    </head>
    <body>
        <section class="todoapp">
             <%@ include file="/common/header.jsp" %>
            <dec:body/>
            <%@ include file="/common/footer.jsp" %>

        </section>

    </body>
    </html>
