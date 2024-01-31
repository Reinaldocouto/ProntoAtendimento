<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="CadastraTriagem" method="post">
 	Paciente: 
 	<select name="paciente">
 		<option></option>
 		<c:forEach items="${pacientes}" var="pac">
 			<option value="${pac.id}">${pac.nome}</option>
 		</c:forEach>
 	</select>
 	<p>Temperatura <input type="number" name="temperatura" /></p>
 	<p>Pressão <input type="text" name="pressao" /></p>
 	<p>Peso <input type="number" name="peso" /></p>
 	<p>Motivo <input type="text" name="motivo" /></p>
 	<p>Descricao <input type="text" name="descricao" /></p>
 	<p>Enfermeiro:
 	  <select name="enfermeiro">
 	  	<option></option>
 	  	<c:forEach items="${enfermeiros}" var="enf">
 	  	  <option value="${enf.id}">${enf.nome}</option> 	  	
 	  	</c:forEach> 	  	
 	  </select>
 	<input type="submit" value="ok" /> 	 
 </form>
</body>
</html>