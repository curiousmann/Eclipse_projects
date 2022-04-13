<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
we are in success.jsp page 
<br>

${empObj}

<br>
EMplpyee Details are :<br>

EMployee Id is : ${empObj.empId} <br>
EMployeeName : ${empObj.empName}<br>
EmployeeSalary : ${empObj.empSal}<br>



</body>
</html>