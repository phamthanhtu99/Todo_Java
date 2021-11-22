<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 22/11/2021
  Time: 10:13 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<footer class="footer">
    <!-- This should be `0 items left` by default -->
    <span class="todo-count"><strong>0</strong> item left</span>
    <!-- Remove this if you don't implement routing -->
    <ul class="filters">
        <li>
            <a class="selected" href="#/">All</a>
        </li>
        <li>
            <a href="#/active">Active</a>
        </li>
        <li>
            <a href="#/completed">Completed</a>
        </li>
    </ul>
    <!-- Hidden if no completed items are left ↓ -->
    <button class="clear-completed">Clear completed</button>
</footer>