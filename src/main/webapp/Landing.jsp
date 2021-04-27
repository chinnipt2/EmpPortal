<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script  src="js/jQuery/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	JQuery(document).ready(function(){
		jQuery("loginSubmit").on("click",function(){
			console.log('ok');
		});
	});	
</script> 
</head>

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