<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
        <link rel="stylesheet" href="http://localhost:8080/atividade/login.css"/>
        
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
now = new Date
document.write ("Hoje é " + now.getDay() + ", " + now.getDate() + " de " + now.getMonth() + " de " + now.getFullYear() )
}

	if(id=password ="Progweb2021"){
		return true;
	}
</script>
    </head>
    <body onload="startTime()">
    	
    	<div id="txt"></div>
        <div id="login-container">
            <h1>Login</h1>
            <form action="">
                <label for="email">Email:</label>
                <input type="email" name="email" id="email" placeholder="Digite seu Email" autocomplete="off">
                <label for="password">Senha:</label>
                <input type="password" name="password" id="password" placeholder="Digite sua senha">
                <a href="#" id="forgot-pass">Esqueceu sua senha?</a> 
                <a href="http://localhost:8080/atividade/menu.jsp" type="submit">Acessar</a>
            </form>
            
            <div id="register-container">
                <p>Primeiro acesso?</p>
                <a href="#">Registrar</a>
            </div>
        </div>
    </body>
</html>
