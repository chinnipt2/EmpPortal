<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Login</title>
<script src="https://apis.google.com/js/platform.js" async defer></script>
<script type="text/javascript">
function onSignIn(googleUser) {
	  var profile = googleUser.getBasicProfile();
	  console.log('ID: ' + profile.getId()); // Do not send to your backend! Use an ID token instead.
	  console.log('Name: ' + profile.getName());
	  console.log('Image URL: ' + profile.getImageUrl());
	  console.log('Email: ' + profile.getEmail()); // This is null if the 'email' scope is not present.
	  console.log('id_token='+googleUser.getAuthResponse().id_token);
	  
	  var xhr = new XMLHttpRequest();
	  xhr.open('POST','http://localhost:8080/kum/emp/singIn');
	  xhr.setRequestHeader('Content-Type','application/x-www-form-urlencoded');
	  xhr.onload = function(){
		  console.log('Singed in as'+xhr.responseText);
	  };
	  xhr.send('idtoken='+googleUser.getAuthResponse().id_token);
	}
function signOut() {
    var auth2 = gapi.auth2.getAuthInstance();
    auth2.signOut().then(function () {
      console.log('User signed out.');
    });
  }
</script>
<meta name="google-signin-client_id" content="874088034608-fno2c6vh7v1eksl5uost9vbf2nt61vpu.apps.googleusercontent.com">
</head>
<body>
	<h3>Login Page.</h3>

	<s:form action="../emp/singIn">
		<s:textfield name="userName" label="UserName" />
		<s:password name="passWord" label="PassWord" />
		<s:submit />
	</s:form>
	<div class="g-signin2" data-onsuccess="onSignIn"></div>
	<a href="#" onclick="signOut();">Sign out</a>
</body>
</html>