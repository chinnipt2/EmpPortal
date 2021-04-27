http://localhost:8080/kum/guest/login

This is a struts spring intgration project

There is no hibenate.
	



pom.xml.. if there are 2 versions of jar files then its a problem

here struts2-sprint-plugin is importing spring 4.3.13.RELease.jar

https://cwiki.apache.org/confluence/display/WW/Struts+2+JUnit+Plugin+Tutorial

https://www.journaldev.com/2134/struts-tutorial-for-beginners

https://www.journaldev.com/3633/hibernate-interview-questions-and-answers

https://cwiki.apache.org/confluence/display/WW/Comparing+Struts+1+and+2



landing page

-login
-home
-logout

Guest
	Welcome - welcome.html // make sure application is deployed
	Contact us - get some data from database put is in the form bean and render
	About page -  just a forward page
	LoginPage  -  Page with validations client side java script ..server side form validation
	              
	
employees/admin
	Home
Oauth(Open authorization)
https://developers.google.com/identity/sign-in/web/sign-in
	 
		
client_id	 
874088034608-fno2c6vh7v1eksl5uost9vbf2nt61vpu.apps.googleusercontent.com

client credentials

{"web":{"client_id":"874088034608-fno2c6vh7v1eksl5uost9vbf2nt61vpu.apps.googleusercontent.com","project_id":"empportal-213507","auth_uri":"https://accounts.google.com/o/oauth2/auth","token_uri":"https://www.googleapis.com/oauth2/v3/token","auth_provider_x509_cert_url":"https://www.googleapis.com/oauth2/v1/certs","client_secret":"BL7t_WTus1TWLD7LSmzExxAS","javascript_origins":["http://localhost:8080"]}}


Client secreat
BL7t_WTus1TWLD7LSmzExxAS

===============
Oauth types.

token_type is a parameter in Access Token generate call to Authorization server which essentially represents how an access_token will be generated and presented for resource access calls.
You provide token_type in the access token generation call to an authorization server.

If you give Bearer( Default on most implementation), an access_token is generated and sent back to you.
 Bearer can be simply understood as "give access to the bearer of this token." One valid token and no question asked.
  On the other hand if you choose Mac and sign_type(default hmac-sha-1 on most implementation),
   the access token is generated and kept as secret in Key Manager as a attribute, and an encrypted secret is sent back as access_token

Yes you can use your own implementation of token_type, but that might not make much sense as developers will need to follow your process rather than
 standard implementations of OAuth.


while writing the servers side code ..
it was throwing the connectiontime out while verifying the token
adding these vm arguments to the tomcat configuraiton it worked fine


-Dhttp.proxyHost="www-proxy.us.oracle.com" -Dhttp.proxyPort=80 -Dhttps.proxyHost="www-proxy.us.oracle.com" -Dhttps.proxyPort=80

===============
