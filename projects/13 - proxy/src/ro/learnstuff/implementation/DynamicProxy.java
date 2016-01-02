package ro.learnstuff.implementation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
	Object obj;

	public static Object newInstance(Object obj) {
		return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
				new DynamicProxy(obj));
	}

	public DynamicProxy(Object obj) {
		this.obj = obj;
	}

	// AOP much ?
	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		Object result;
		try {
			System.out.println("Did something before my method!");
			result = m.invoke(obj, args);
			System.out.println("Did something after my method!");
		} catch (Exception e) {
			throw e;
		}
		return result;
	}

}
