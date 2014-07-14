<%--
  Created by IntelliJ IDEA.
  User: lss
  Date: 7/14/14
  Time: 1:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<jsp:useBean id="record" scope="request" type="model.Record">

</jsp:useBean>

<table>
    <thead>
    <tr>
        <td>id</td>
        <td>note</td>
        <td></td>
        <td></td>
    </tr>
    </thead>

    <tbody>

    <tr>
        <td><%= record.getId() %>  </td>
        <td><%= record.getNote() %></td>
        <td></td>
        <td></td>
    </tr>

    </tbody>

</table>
</body>
</html>
