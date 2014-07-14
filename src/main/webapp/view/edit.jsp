<%@ page contentType="text/html; UTF-8" language="java" %>

<html>
<head>
    <title>Edit Record</title>
</head>

<body>
<jsp:useBean id="record" scope="request" class="model.Record">
</jsp:useBean>
    <h1>Edit record</h1>

<form method="post" action="edit.do">
        <table>
            <tr>
                <input type="text" name="id" value="${record.id}" readonly>
                <td>id:</td>
            </tr>
            <tr>
                <input type="text" name="note" value="${record.note}">
                <td>note:</td>
            </tr>
            <tr>
                <td><input type="submit" value="send"></td>
                <td><input type="reset" value="clean"></td>
            </tr>
        </table>
    </form>
</body>

</html>