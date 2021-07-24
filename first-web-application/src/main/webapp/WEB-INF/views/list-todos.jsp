<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Todos for ${name}</title>
</head>
<body>
Hi ${username}

<table>
<caption>Your Todos</caption>
<thead>
<tr>
<th>Description</th>
<th>Target Date</th>
</tr>
</thead>
</table>
<!-- for(Todo todo:todos) -->
<c:forEach items="${todos}" var="todo">

${todo.id} ${todo.desc} ${todo.user}</BR>

</c:forEach>
 <a class="button" href="/add-todo">Add</a>
</body>
</html>