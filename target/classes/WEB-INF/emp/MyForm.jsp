<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Register</title>
  </head>
  <body>
    <h3>Enter Details.</h3>

    <s:form action="myActionForm">
      <s:textfield name="userBean.name" label="Name" />
      <s:textfield name="userBean.age" label="Age" />
      <s:submit/>
    </s:form>	
  </body>
</html>