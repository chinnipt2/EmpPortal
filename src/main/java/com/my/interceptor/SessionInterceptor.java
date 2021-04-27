package com.my.interceptor;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SessionInterceptor implements Interceptor{

	@Override
	public void destroy() {
		System.out.println("SessionInterceptor destroyed");
		
	}

	@Override
	public void init() {
		System.out.println("SessionInterceptor initialized");
		ActionContext.getContext().getValueStack().set("documentRoot", "example");
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("intercpting...");
		return invocation.invoke();
	}

}
