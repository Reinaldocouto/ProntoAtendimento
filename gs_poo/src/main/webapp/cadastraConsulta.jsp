<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastra consulta</title>
</head>
<body>
  <h2>Cadastra Consulta</h2>
  
  <form method="" action="">
  	<p>Paciente: 
  	 <select name="paciente">
  	    <option value=""></option>
  	    <c:forEach items="${pacientes}" var="pac">
  	       <option value="${pac.id}">${pac.nome}</option>
  	    </c:forEach>
  	 </select>
 	</p> 


  	<p>Médico: 
  	 <select name="medico">
  	    <option value=""></option>
  	    <c:forEach items="${medicos}" var="med">
  	       <option value="${med.id}">${med.nome} - ${med.especialidade}</option>
  	    </c:forEach>
  	 </select>
 	</p> 
 	
 	<p>Data <input type="date" name="data" />  Hora: <input type="text" name="horario" /></p>
 	
    <p><input type="submit" value="cadastra" />
  </form>

</body>
</html>