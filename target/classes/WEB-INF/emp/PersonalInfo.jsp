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
      <s:textfield name="personalInfo.name" label="Name-" />
    
      <s:radio label="Gender-" name="personalInfo.genders" list="personalInfo.genders" value="personalInfo.defaultGenderValue" /> 
      
      <s:select label="Location-" list="personalInfo.location"></s:select>
      
      <s:checkboxlist label="Hobbies-" name ="personalInfo.hobbies" list="personalInfo.hobbies"></s:checkboxlist>
      <s:textarea label="Summary-" name="personalInfo.summary"></s:textarea>
      
      <s:date name="personalInfo.dateOfBirth" format="dd/MM/yyyy"/>
      <s:label name="personalInfo.dateOfBirth" label="Name--" />
      <s:submit/>
    </s:form>	
  </body>
</html>