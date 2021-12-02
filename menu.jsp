<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="http://localhost:8080/atividade/menu.css">
<script type="text/javascript">
function startTime()
{
var today=new Date();
var h=today.getHours();
var m=today.getMinutes();
var s=today.getSeconds();
// adicione um zero na frente de números<10
m=checkTime(m);
s=checkTime(s);
document.getElementById('txt').innerHTML=h+":"+m+":"+s;
t=setTimeout('startTime()',500);
}
function checkTime(i)
{
if (i<10)
{
i="0" + i;
}
return i;
}
</script>

<meta charset="ISO-8859-1">
<title>SGP</title>
</head>
<body onload="startTime()">

<h2>Sistema de Gerenciamento do Professor</h2><br></br>

<h1>Seja bem vindo(a)!</h1>
	
	<nav id="menu">
	<div id="txt"></div>
	<div class="menu-item"></div>
          <div class="menu-text">
              <a href="ServletController?acao=Cadastrar Disciplina">Cadastrar Displinas e Notas</a>
          </div>
          
          <div class="menu-item"></div>
          <div class="menu-text">
              <a href="http://localhost:8080/atividade/Consultar.jsp">Consultar Displinas e Notas na tabela</a>
          </div>
          <div class="sub-menu">
              <div class="icon-box"></div>
                   <div class="icon"><i class="fal fa-wind-turbine"></i></div>
              <div class="text"></div>
          </div>
          
          <div class="menu-text">
              <a href="ServletControlador?acao=login">Sair</a>
          </div>
          <div class="sub-menu">
              <div class="icon-box"></div>
                   <div class="icon"><i class="fal fa-wind-turbine"></i></div>
              <div class="text"></div>
          </div>
          
          
          
          <div id="info-box">
            <ul>
                <li><a target="_top" href="https://www.linkedin.com/in/maria-clara-campos-a323821b2">LinkedIn</a></li>
                <li><a target="_top" href="https://www.instagram.com/_mariaclaracss/">Instagram</a></li>
                <li><a target="_top" href="https://github.com/MariaClaraCampos">GitHub</a></li>
            </ul>
        </div>
        </nav>  

    
</body>
</html>
