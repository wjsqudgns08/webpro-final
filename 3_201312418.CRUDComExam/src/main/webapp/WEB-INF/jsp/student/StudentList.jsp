<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>목록</title><script type="text/javaScript" language="javascript" defer="defer">

</script>
</head>
<body>
	<c:forEach var="result" items="${resultList}" varStatus="status">
		 <li>
		 <c:out value="${result.number}"/></a>&nbsp;</td>
		 <c:out value="${result.number}"/>
		 </li>
	</c:forEach>
	<a href="/CRUDComExam/student/addStudentView.do">Create</a>
</body>
</html>
