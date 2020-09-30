<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<body>
<h3>Tarefas</h3>
<table border ='1'>
<c:forEach var='tarefa' items="${tarefas }">
<tr>
<td>${tarefa.id }</td>
<td>${tarefa.descricao}</td>
<td><form action="deletaTarefa" method="post">
<input type="hidden" name='id' value='${tarefa.id}'>
<button type='submit' class="btn btn-secondary btn-sm"> Del </button> 
</form></td>
</tr>
</c:forEach>
</table>
<a href="criaTarefa"> Criar tarefa</a>
</body>
</html>