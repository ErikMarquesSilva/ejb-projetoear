package br.com.caelum.livraria.interceptador;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptador {
	
	@AroundInvoke
	public Object intercepta(InvocationContext context) throws Exception{
		
		long inicio = System.currentTimeMillis();
		
		Object obj = context.proceed();
		String metodo = context.getMethod().getName();
		String classe = context.getTarget().getClass().getSimpleName();
		
		System.out.println("Tempo gasto: " + (System.currentTimeMillis() - inicio) + " na Classe: " + classe + " método: " + metodo);
		return obj;
		
	}

}
