<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="<ww:property value='documentRoot'/>js/jQuery/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	jQuery("loginSubmit").on("click",function(){
		console.log('ok');
	});
</script>
<body>
	<div>
		<table>
			<tr><td>UserName : </td><td><input type="text" id="userName"></td></tr>
			<tr><td>Password: </td><td><input type="password" id="password"></td></tr>
			<tr><td></td><td><button type="submit" id="loginSubmit">SingIn</button></td></tr>
		</table>
		
		
	</div>
</body>
</html>
