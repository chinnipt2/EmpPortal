package com.my.actions;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author satiskak
 *
 */

public class LoginAction extends ActionSupport{	

	private String userName;
	private String passWord;
	private static final Logger logger = LoggerFactory.getLogger(LoginAction.class);
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String execute(){
		final HttpServletRequest request = ServletActionContext.getRequest();
		String idTokenString = request.getParameter("idtoken");
		System.out.println("id="+idTokenString);
		System.out.println("I am here.");
		logger.info("hello");
		if(idTokenString != null){


			try {
				Payload payload = getPayload(idTokenString);
				String email = payload.getEmail();
				boolean emailVerified = Boolean.valueOf(payload.getEmailVerified());
				String name = (String) payload.get("name");
				String pictureUrl = (String) payload.get("picture");
				String locale = (String) payload.get("locale");
				String familyName = (String) payload.get("family_name");
				String givenName = (String) payload.get("given_name");
				System.out.println(name +" "+pictureUrl +" "+locale +" "+familyName +" "+givenName);
				return "success";
			} catch (Exception e) {
				e.printStackTrace();
				return "denied";
			}
		}

		if(passWord == null || passWord.isEmpty()){
			System.out.println("Dont enter passowrd to login");

			return "success";
		}	
		else
			return "denied";

	}
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		super.validate();
		//System.out.println(loginBean.getUserName());
	}
	public static GoogleIdToken.Payload getPayload(String tokenString) throws Exception {
		String GOOGLE_CLIENT_ID ="874088034608-fno2c6vh7v1eksl5uost9vbf2nt61vpu.apps.googleusercontent.com";
		JacksonFactory jacksonFactory = new JacksonFactory();

		GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(new NetHttpTransport(), jacksonFactory)
				.setAudience(Arrays.asList(GOOGLE_CLIENT_ID))
				.build();

		GoogleIdToken token = GoogleIdToken.parse(jacksonFactory, tokenString);

		if (verifier.verify(token)) {
			System.out.println("its working now");
			GoogleIdToken.Payload payload = token.getPayload();
			if (!GOOGLE_CLIENT_ID.equals(payload.getAudience())) {
				throw new IllegalArgumentException("Audience mismatch");
			} else if (!GOOGLE_CLIENT_ID.equals(payload.getAuthorizedParty())) {
				throw new IllegalArgumentException("Client ID mismatch");
			}
			return payload;
		} else {
			System.out.println("Not working");
			throw new IllegalArgumentException("id token cannot be verified");
		}
	}

}
