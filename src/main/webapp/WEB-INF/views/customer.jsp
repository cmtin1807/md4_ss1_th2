<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 13/08/2024
  Time: 10:53 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer View</title>
</head>
<body>
<fieldset>
    <legend>Customer Infomation</legend>
    <table border="1">
        <thead>
        <tr>
            <th>ID: </th>
            <th>${customer.id}</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Name:</td>
            <td>${customer.name}</td>
        </tr>
        <tr>
            <td>Email: </td>
            <td>${customer.email}</td>
        </tr>
        <tr>
            <td>Adress:</td>
            <td>${customer.address}</td>
        </tr>
        </tbody>
    </table>
</fieldset>
<a href="/customer">Back Form List</a>

</body>
</html>
