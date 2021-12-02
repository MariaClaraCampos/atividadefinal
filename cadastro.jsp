<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="http://localhost:8080/atividade/cadastro.css"/>
<meta charset="ISO-8859-1">
<title>Cadastro de Disciplinas</title>
</head>
<body>
<h3>Tela de cadastro de disciplinas!</h3><br></br>

	
	<form action="ServletDisciplina" method="get">
		<input type="text" name="nome" placeholder="Digite o nome da disciplina..."/><br></br>
		<input type="text" name="nome1" placeholder="Digite o seu nome..."/><br></br>
		<input type="text" name="nome" placeholder="Digite o nome do aluno(a)..."/><br></br>
		<input type="text" name="nome1" placeholder="Digite o semestre..."/><br></br>
		<input type="text" name="nome1" placeholder="Digite a nota..."/><br></br>
		 <a href="http://localhost:8080/atividade/Consultar.jsp" type="submit">Adicionar</a>
	</form>

	<div class="menu-text">
              <a href="http://localhost:8080/atividade/menu.jsp#">Voltar ao Menu</a>
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
</body>
</html>
