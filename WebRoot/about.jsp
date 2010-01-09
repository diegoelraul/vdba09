<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>FILMS 2010</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="./css/estilo.css">
  </head>
<body>
		<center>
		<div id="fondoCuerpo">
		<%@include file="/inc/menu.jsp"%>
		
			<div id="content" style="float:center;text-align:center;">
			<br/>
			<p>Web realizada para la gestión de una tienda virtual de pel&iacute;culas para la asignatura<br/>
			<h2 align=center>Aplicaciones Visuales de Bases de Datos</h2>
			de la universidad <b>Carlos III</b> de Madrid, en el curso <b>2009/2010</b>. <br/>
			<br/>
			<img src="./images/letras.gif"/>
			<br/>
			La práctica ha sido realizada por los siguientes alumnos:
			</p>
			<p style="margin-left:50px;">
			<b>Yago Casal</b>, como Arquitecto Software.<br/>
			<b>Guillermo Solano</b>, como Administrador de Bases de Datos.<br/>
			<b>Alvaro Queipo</b>, como Administrador de Sistemas.<br/>
			<b>Elisa Diez</b>, como Añalista Programadora.<br/>
			<b>Daniel Torrico</b>, como Añalista Programador.<br/>
			<b>Eva Higueras</b>, como Diseñadora de la Interfaz de Usuario.<br/>
			</p>
			<br/><br/><br/><br/><br/>
			</div>
			
		
		</div>
		</center>
	</body>
</html>
