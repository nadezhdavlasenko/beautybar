<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
index
<div class="container">
    <table style="border: 1px solid #ccc; padding: 10px;" class="table table-hover" >
        <tr>
            <td>ID</td>
            <td>NAME</td>
            <td>LONGITUDE</td>
            <td>LATITUDE</td>
        </tr>
        <c:forEach items="${list}" var="list">
            <tr>
                <td>${list.id}</td>
                <td>${list.name}</td>
                <td>${list.longitude}</td>
                <td>${list.latitude}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>