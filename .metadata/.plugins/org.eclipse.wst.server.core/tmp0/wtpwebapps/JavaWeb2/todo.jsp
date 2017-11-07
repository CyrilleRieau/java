<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${variable}
	<form action="" method="post">
	<ul>
	<c:forEach items="${items}" var="item" varStatus="status">
		<li>${item}
			<input type="submit" value="${status.index}" name="suppr" />
		</li>
	</c:forEach>
	</ul>
	</form>
	<form action="" method="post">
		<input type="text" name="nouveau" />
		<button>Ajouter</button>
	</form>
</body>
</html>