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
  <h2>Recupera Consulta</h2>
  
  <form method="" action="">
  	<p>Paciente com consultas marcadas: 
  	 <select name="paciente">
  	    <option value=""></option>
  	    <c:forEach items="${pacientes}" var="pac">
  	       <option value="${pac.id}">${pac.nome}</option>
  	    </c:forEach>
  	 </select>
 	</p> 

    <p><input type="submit" value="consulta" />
  </form>
  
  <table>
    <thead>
       <tr><td>Médico</td><td>Especialidade</td><td>Data</td><td>Hora</td></tr>
    </thead>
    <tbody>
       <tr><td>Dr Jekyll</td><td>Cirurgia</td><td>02/11/2023</td><td>00:00</td></tr><td><tr>
       <tr><td colspan="4">Coloque o restante das informações aqui</td></tr>
    </tbody>
  </table>

</body>
</html>