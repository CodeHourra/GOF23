package proxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2020/5/2 0002 13:53
 * @Description Java的动态代理
 */
public class DynamicSubject implements InvocationHandler {
		private Object object;
		
		public DynamicSubject(Object object) {
				this.object = object;
		}
		
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
				System.out.println("before calling " + method);
				method.invoke(object, args);
				System.out.println("after calling " + method);
				return null;
		}
}
